package io.github.shuoros.javagram.type;

import lombok.Getter;

@Getter
public class BotCommandScopeAllGroupChats implements BotCommandScope {

    private final String scope = "all_group_chats";

}
