package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Boolean;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BanChatMember implements Method {

    private final String REQUEST = "/banChatMember";
    private String chatId;
    private int userId;
    private int untilDate;
    private boolean revokeMessages;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Boolean();
    }

    public BanChatMember(int chatId, int userId) {
        this(String.valueOf(chatId), userId);
    }

    public BanChatMember(String chatId, int userId) {
        this.chatId = chatId;
        this.userId = userId;
    }

}
