package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.BotCommandScope;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetMyCommands implements Method {

    private final String REQUEST = "/getMyCommands";
    private BotCommandScope scope;
    private String languageCode;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return null;
    }
}
