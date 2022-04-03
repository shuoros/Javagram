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
public class SendVoice implements Method {

    private final String REQUEST = "/sendVoice";
    private int chatId;
    private String voice;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;
    private int duration;
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

    public SendVoice(int chatId, String voice) {
        this.chatId = chatId;
        this.voice = voice;
    }

}
