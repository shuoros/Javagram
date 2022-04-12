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
public class SetChatPermissions implements Method {

    private final String REQUEST = "/setChatPermissions";
    private String chatId;
    private ChatPermissions permissions;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Boolean();
    }

    public SetChatPermissions(int chatId, ChatPermissions permissions) {
        this(String.valueOf(chatId), permissions);
    }

}
