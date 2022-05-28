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
public class SendContact implements Method {

    private final String REQUEST = "/sendContact";
    private int chatId;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String vcard;
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

    public SendContact(int chatId, String phoneNumber, String firstName) {
        this.chatId = chatId;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
    }

}
