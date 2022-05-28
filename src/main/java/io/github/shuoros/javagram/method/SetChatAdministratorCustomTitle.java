package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Boolean;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SetChatAdministratorCustomTitle implements Method {

    private final String REQUEST = "/setChatAdministratorCustomTitle";
    private String chatId;
    private int userId;
    private String customTitle;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Boolean();
    }

    public SetChatAdministratorCustomTitle(int chatId, int userId, String customTitle) {
        this(String.valueOf(chatId), userId, customTitle);
    }

}
