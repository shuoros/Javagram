package io.github.shuoros.javagram.type;

import lombok.Getter;

@Getter
public class BotCommandScopeAllPrivateChats implements BotCommandScope {

    private final String type = "all_private_chats";

}
