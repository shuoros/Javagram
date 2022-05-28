package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BotCommandScopeChatAdministrators implements BotCommandScope {

    private final String type = "chat_administrators";
    private String chatId;

    public BotCommandScopeChatAdministrators(int chatId) {
        this(String.valueOf(chatId));
    }

}
