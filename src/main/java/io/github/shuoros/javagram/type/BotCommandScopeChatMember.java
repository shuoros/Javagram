package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BotCommandScopeChatMember implements BotCommandScope {

    private final String type = "chat_administrators";
    private String chatId;
    private int userId;

    public BotCommandScopeChatMember(int chatId, int userId) {
        this(String.valueOf(chatId), userId);
    }

}
