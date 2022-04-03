package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Message;
import io.github.shuoros.javagram.type.ReplyMarkup;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SendLocation implements Method {

    private final String REQUEST = "/sendLocation";
    private int chatId;
    private double latitude;
    private double longitude;
    private double horizontalAccuracy;
    private int livePeriod;
    private int heading;
    private int proximityAlertRadius;
    private boolean disableNotification;
    private boolean protectContent;
    private int replyToMessageId;
    private boolean allowSendingWithoutReply;
    private ReplyMarkup replyMarkup;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Message();
    }

    public SendLocation(int chatId, double latitude, double longitude) {
        this.chatId = chatId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
