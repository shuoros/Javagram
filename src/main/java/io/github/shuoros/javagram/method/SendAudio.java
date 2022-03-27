package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.MessageEntity;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class SendAudio implements Method {

    private final String REQUEST = "/sendAudio";
    private int chatId;
    private String audio;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;
    private int duration;
    private String performer;
    private String title;
    private String thumb;

    @Override
    public String getMethod() {
        return REQUEST;
    }

    @Override
    public Type getReturnType() {
        return null;
    }

    public SendAudio(int chatId, String audio) {
        this.chatId = chatId;
        this.audio = audio;
    }

}
