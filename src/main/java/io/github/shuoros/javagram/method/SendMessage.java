package io.github.shuoros.javagram.method;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SendMessage implements Method {

    private final String REQUEST = "/sendMessage";
    private int chatId;
    private String text;
    private String parseMode;
    private MessageEntity entities;
    private boolean disableWebPagePreview;
    private boolean disableNotification;
    private int replyToMessageId;
    private boolean allowSendingWithoutReply;
    private ReplyMarkup replyMarkup;

    public String getMethod() {
        return this.REQUEST;
    }

    public SendMessage(int chatId, String text) {
        this.chatId = chatId;
        this.text = text;
    }

}
