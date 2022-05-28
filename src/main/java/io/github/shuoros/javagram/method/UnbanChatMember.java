package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Boolean;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UnbanChatMember implements Method {

    private final String REQUEST = "/unbanChatMember";
    private String chatId;
    private int userId;
    private boolean onlyIfBanned;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Boolean();
    }

    public UnbanChatMember(int chatId, int userId) {
        this(String.valueOf(chatId), userId);
    }

    public UnbanChatMember(String chatId, int userId) {
        this.chatId = chatId;
        this.userId = userId;
    }

}
