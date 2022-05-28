package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Boolean;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BanChatSenderChat implements Method {

    private final String REQUEST = "/banChatSenderChat";
    private String chatId;
    private int senderChatId;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Boolean();
    }

    public BanChatSenderChat(int chatId, int senderChatId) {
        this(String.valueOf(chatId), senderChatId);
    }

}
