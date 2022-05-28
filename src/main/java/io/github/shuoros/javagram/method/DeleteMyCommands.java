package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.BotCommandScope;
import io.github.shuoros.javagram.type.Bool;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DeleteMyCommands implements Method {

    private final String REQUEST = "/deleteMyCommands";
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

}
