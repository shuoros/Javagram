package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.InputMedia;
import io.github.shuoros.javagram.type.Message;
import io.github.shuoros.javagram.type.ReplyMarkup;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EditMessageMedia implements Method {

    private final String REQUEST = "/editMessageMedia";
    private String chatId;
    private int messageId;
    private String inlineMessageId;
    private InputMedia media;
    private ReplyMarkup replyMarkup;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Message();
    }

    public EditMessageMedia(InputMedia media) {
        this.media = media;
    }

}
