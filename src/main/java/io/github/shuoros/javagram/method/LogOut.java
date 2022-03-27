package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Type;

public class LogOut implements Method {

    private final String REQUEST = "/logOut";

    @Override
    public String getMethod() {
        return this.REQUEST;
    }
    @Override
    public Type getReturnType() {
        return null;
    }

}
