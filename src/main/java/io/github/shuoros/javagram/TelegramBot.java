package io.github.shuoros.javagram;

import com.google.gson.Gson;
import io.github.shuoros.javagram.method.Method;
import io.github.shuoros.javagram.type.Type;
import io.github.shuoros.jterminal.JTerminal;
import io.github.shuoros.jterminal.ansi.Color;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TelegramBot implements Javagram {

    private final String TELEGRAM = "https://api.telegram.org/bot";
    private final String token;
    private final boolean debug;

    public TelegramBot(String token) {
        this(token, false);
    }

    public TelegramBot(String token, boolean debug) {
        this.token = token;
        this.debug = debug;
    }

    @Override
    public Type sendRequest(Method method) {
        JSONObject json = Utils.serializeRequest(method);
        if (debug) {
            JTerminal.print("Request: ", Color.AQUA);
            JTerminal.println(json.toString(), Color.YELLOW);
        }
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL(TELEGRAM + token + method.getMethod());
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            OutputStream os = con.getOutputStream();
            byte[] input = json.toString().getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    con.getResponseCode() / 100 == 2 ? con.getInputStream() : con.getErrorStream(), StandardCharsets.UTF_8));
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            if (debug) {
                JTerminal.print("Response: ", Color.AQUA);
                JTerminal.println(response.toString(), Color.YELLOW);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Utils.deserializeResponse(new JSONObject(response.toString()), method.getReturnType());
    }

    private static class Utils {

        private static JSONObject serializeRequest(Method method) {
            JSONObject json = new JSONObject(method);
            json.remove("REQUEST");
            return Utils.telegramizeParameters(json);
        }

        private static Type deserializeResponse(JSONObject json, Type type) {
            if (json.get("result") instanceof Boolean)
                return io.github.shuoros.javagram.type.Boolean.builder().value(json.getBoolean("result")).build();
            else if (json.get("result") instanceof Integer)
                return io.github.shuoros.javagram.type.Integer.builder().value(json.getInt("result")).build();
            else if (json.get("result") instanceof JSONArray)
                return new Gson().fromJson(Utils.javaizeParameters(json.getJSONArray("result")).toString(), type.getClass());
            else
                return new Gson().fromJson(Utils.javaizeParameters(json.getJSONObject("result")).toString(), type.getClass());
        }

        private static JSONObject telegramizeParameters(JSONObject input) {
            JSONObject output = new JSONObject();
            input.keySet().forEach(key -> {
                if (input.get(key).getClass().equals(JSONObject.class)) {
                    output.put(camelCaseToSnakeCase(key), telegramizeParameters(input.getJSONObject(key)));
                } else if (input.get(key).getClass().equals(JSONArray.class)) {
                    output.put(camelCaseToSnakeCase(key), telegramizeArrayParameters(input.getJSONArray(key)));
                } else {
                    output.put(camelCaseToSnakeCase(key), input.get(key));
                }
            });
            return output;
        }

        private static JSONArray telegramizeArrayParameters(JSONArray input) {
            JSONArray output = new JSONArray();
            for (int i = 0; i < input.length(); i++) {
                if (input.get(i).getClass().equals(JSONObject.class)) {
                    output.put(telegramizeParameters(input.getJSONObject(i)));
                } else if (input.get(i).getClass().equals(JSONArray.class)) {
                    output.put(telegramizeArrayParameters(input.getJSONArray(i)));
                } else if (input.get(i).getClass().equals(String.class)) {
                    output.put(camelCaseToSnakeCase(input.getString(i)));
                }
            }
            return output;
        }

        private static JSONArray javaizeParameters(JSONArray input) {
            JSONArray output = new JSONArray();
            input.forEach(element -> {
                output.put(javaizeParameters((JSONObject) element));
            });
            return output;
        }

        private static JSONObject javaizeParameters(JSONObject input) {
            JSONObject output = new JSONObject();
            input.keySet().forEach(key -> {
                if (input.get(key).getClass().equals(JSONObject.class)) {
                    output.put(snakeCaseToCamelCase(key), javaizeParameters(input.getJSONObject(key)));
                } else if (input.get(key).getClass().equals(JSONArray.class)) {
                    output.put(snakeCaseToCamelCase(key), javaizeArrayParameters(input.getJSONArray(key)));
                } else {
                    output.put(snakeCaseToCamelCase(key), input.get(key));
                }
            });
            return output;
        }

        private static JSONArray javaizeArrayParameters(JSONArray input) {
            JSONArray output = new JSONArray();
            for (int i = 0; i < input.length(); i++) {
                if (input.get(i).getClass().equals(JSONObject.class)) {
                    output.put(javaizeParameters(input.getJSONObject(i)));
                } else if (input.get(i).getClass().equals(JSONArray.class)) {
                    output.put(javaizeArrayParameters(input.getJSONArray(i)));
                } else if (input.get(i).getClass().equals(String.class)) {
                    output.put(snakeCaseToCamelCase(input.getString(i)));
                }
            }
            return output;
        }

        private static String camelCaseToSnakeCase(String input) {
            StringBuilder output = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    output.append(c);
                } else {
                    output.append("_" + Character.toLowerCase(c));
                }
            }
            return output.toString();
        }

        private static String snakeCaseToCamelCase(String input) {
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '_') {
                    output.append(Character.toUpperCase(input.charAt(i + 1)));
                    i++;
                } else {
                    output.append(input.charAt(i));
                }
            }
            return output.toString();
        }
    }

}
