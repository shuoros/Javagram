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
public class EditMessageText implements Method {

    private final String REQUEST = "/editMessageText";
    private String chatId;
    private int messageId;
    private String inlineMessageId;
    private String text;
    private String parseMode;
    private List<MessageEntity> entities;
    private Boolean disableWebPagePreview;
    private ReplyMarkup replyMarkup;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Message();
    }

    public EditMessageText(String text) {
        this.text = text;
    }

}
