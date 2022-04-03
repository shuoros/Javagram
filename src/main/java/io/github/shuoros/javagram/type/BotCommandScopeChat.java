package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BotCommandScopeChat implements BotCommandScope {

    private final String type = "chat";
    private String chatId;

    public BotCommandScopeChat(int chatId) {
        this(String.valueOf(chatId));
    }

}
