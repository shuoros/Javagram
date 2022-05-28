package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Chat;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetChat implements Method {

    private final String REQUEST = "/getChat";
    private String chatId;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Chat();
    }

    public GetChat(int chatId) {
        this(String.valueOf(chatId));
    }

}
