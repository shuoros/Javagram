package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Type;
import io.github.shuoros.javagram.type.User;

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
