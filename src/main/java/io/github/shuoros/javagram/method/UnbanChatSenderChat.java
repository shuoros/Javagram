package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Bool;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UnbanChatSenderChat implements Method {

    private final String REQUEST = "/unbanChatSenderChat";
    private String chatId;
    private int senderChatId;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Bool();
    }

    public UnbanChatSenderChat(int chatId, int senderChatId) {
        this(String.valueOf(chatId), senderChatId);
    }

}
