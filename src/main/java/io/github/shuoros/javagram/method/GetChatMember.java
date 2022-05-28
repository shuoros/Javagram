package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.ChatMember;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetChatMember implements Method {

    private final String REQUEST = "/getChat";
    private String chatId;
    private String userId;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new ChatMember();
    }

    public GetChatMember(int chatId, String userId) {
        this(String.valueOf(chatId), userId);
    }

}
