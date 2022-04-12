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
public class EditMessageCaption implements Method {

    private final String REQUEST = "/editMessageCaption";
    private String chatId;
    private int messageId;
    private String inlineMessageId;
    private String caption;
    private String parseMode;
    private List<MessageEntity> entities;
    private ReplyMarkup replyMarkup;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Message();
    }

}
