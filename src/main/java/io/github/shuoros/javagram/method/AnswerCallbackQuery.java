package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Bool;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AnswerCallbackQuery implements Method {

    private final String REQUEST = "/answerCallbackQuery";
    private String callbackQueryId;
    private String text;
    private boolean showAlert;
    private String url;
    private int cacheTime;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Bool();
    }

    public AnswerCallbackQuery(String callbackQueryId) {
        this.callbackQueryId = callbackQueryId;
    }

}
