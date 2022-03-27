package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.MessageEntity;
import io.github.shuoros.javagram.type.MessageId;
import io.github.shuoros.javagram.type.ReplyMarkup;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CopyMessage implements Method {

    private final String REQUEST = "/copyMessage";
    private int chatId;
    private int fromChatId;
    private int messageId;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;
    private Boolean disableNotification;
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
        return new MessageId();
    }

    public CopyMessage(int chatId, int fromChatId, int messageId) {
        this.chatId = chatId;
        this.fromChatId = fromChatId;
        this.messageId = messageId;
    }

}
