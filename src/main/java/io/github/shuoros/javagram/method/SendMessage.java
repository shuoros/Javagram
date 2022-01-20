package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.MessageEntity;
import io.github.shuoros.javagram.type.ReplyMarkup;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class SendMessage implements Method {

    private final String REQUEST = "/sendMessage";
    private int chatId;
    private String text;
    private String parseMode;
    private List<MessageEntity> entities;
    private boolean disableWebPagePreview;
    private boolean disableNotification;
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

    public SendMessage(int chatId, String text) {
        this.chatId = chatId;
        this.text = text;
    }

}
