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
public class SendVenue implements Method {

    private final String REQUEST = "/sendVenue";
    private int chatId;
    private double latitude;
    private double longitude;
    private String title;
    private String address;
    private String foursquareId;
    private String foursquareType;
    private String googlePlaceId;
    private String googlePlaceType;
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

    public SendVenue(int chatId, double latitude, double longitude, String title, String address) {
        this.chatId = chatId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

}
