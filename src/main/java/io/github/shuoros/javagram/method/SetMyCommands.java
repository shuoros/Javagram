package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Bool;
import io.github.shuoros.javagram.type.BotCommand;
import io.github.shuoros.javagram.type.BotCommandScope;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class SetMyCommands implements Method {

    private final String REQUEST = "/setMyCommands";
    private List<BotCommand> commands;
    private BotCommandScope scope;
    private String languageCode;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Bool();
    }

    public SetMyCommands(List<BotCommand> commands) {
        this.commands = commands;
    }

}
