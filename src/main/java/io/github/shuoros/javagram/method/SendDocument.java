package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Message;
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
public class SendDocument implements Method {

    private final String REQUEST = "/sendDocument";
    private int chatId;
    private String document;
    private String thumb;
    private String caption;
    private int parseMode;
    private List<MessageEntity> captionEntities;
    private boolean disableContentTypeDetection;
    private boolean disableNotification;
    private boolean protectContent;
    private int replyToMessageId;
    private boolean allowSendingWithoutReply;
    private ReplyMarkup replyMarkup;

    @Override
    public String getMethod() {
        return REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Message();
    }

    public SendDocument(int chatId, String document) {
        this.chatId = chatId;
        this.document = document;
    }

}
