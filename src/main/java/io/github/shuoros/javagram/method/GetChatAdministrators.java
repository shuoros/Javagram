package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.ChatMember;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetChatAdministrators implements Method {

    private final String REQUEST = "/getChatAdministrators";
    private String chatId;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new ChatMember();
    }

    public GetChatAdministrators(int chatId) {
        this(String.valueOf(chatId));
    }

}
