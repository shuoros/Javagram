package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Bool;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SendChatAction implements Method {

    private final String REQUEST = "/sendChatAction";
    private int chatId;
    private String action;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Bool();
    }

}
