package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.InlineKeyboardMarkup;
import io.github.shuoros.javagram.type.Message;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StopMessageLiveLocation implements Method {

    private final String REQUEST = "/stopMessageLiveLocation";
    private int chatId;
    private int messageId;
    private String inlineMessageId;
    private InlineKeyboardMarkup replyMarkup;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Message();
    }

}
