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
public class SendVideo implements Method {

    private final String REQUEST = "/sendVideo";
    private int chatId;
    private String video;
    private int duration;
    private int width;
    private int height;
    private String thumb;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;
    private boolean supportsStreaming;
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

    public SendVideo(int chatId, String video) {
        this.chatId = chatId;
        this.video = video;
    }

}
