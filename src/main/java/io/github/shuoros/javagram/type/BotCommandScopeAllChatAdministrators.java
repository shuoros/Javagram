package io.github.shuoros.javagram.type;

import lombok.Getter;

@Getter
public class BotCommandScopeAllChatAdministrators implements BotCommandScope {

    private final String type = "all_chat_administrators";

}
