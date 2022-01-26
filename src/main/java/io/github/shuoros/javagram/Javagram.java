package io.github.shuoros.javagram;

import io.github.shuoros.javagram.method.Method;
import io.github.shuoros.javagram.type.Type;

public interface Javagram {

    Type sendRequest(Method method);

}
