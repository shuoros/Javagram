package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Boolean;
import io.github.shuoros.javagram.type.ChatPermissions;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RestrictChatMember implements Method {

    private final String REQUEST = "/restrictChatMember";
    private String chatId;
    private int userId;
    private ChatPermissions permissions;
    private int untilDate;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Boolean();
    }

    public RestrictChatMember(int chatId, int userId, ChatPermissions permissions) {
        this(String.valueOf(chatId), userId, permissions);
    }

    public RestrictChatMember(String chatId, int userId, ChatPermissions permissions) {
        this.chatId = chatId;
        this.userId = userId;
        this.permissions = permissions;
    }

}
