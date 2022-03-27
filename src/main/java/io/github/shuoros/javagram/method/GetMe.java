package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Type;
import io.github.shuoros.javagram.type.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetMe implements Method {

    private final String REQUEST = "/sendMessage";

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new User();
    }

}
