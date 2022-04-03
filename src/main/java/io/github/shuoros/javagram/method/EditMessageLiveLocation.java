package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.InlineKeyboardMarkup;
import io.github.shuoros.javagram.type.Message;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EditMessageLiveLocation implements Method {

    private final String REQUEST = "/editMessageLiveLocation";
    private int chatId;
    private int messageId;
    private String inlineMessageId;
    private double latitude;
    private double longitude;
    private double horizontalAccuracy;
    private int heading;
    private int proximityAlertRadius;
    private InlineKeyboardMarkup replyMarkup;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Message();
    }

    public EditMessageLiveLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
