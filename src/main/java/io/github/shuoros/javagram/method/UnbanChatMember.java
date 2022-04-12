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
    private String userId;
    private boolean onlyIfBanned;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Boolean();
    }

    public UnbanChatMember(int chatId, String userId) {
        this(String.valueOf(chatId), userId);
    }

    public UnbanChatMember(String chatId, String userId) {
        this.chatId = chatId;
        this.userId = userId;
    }

}
