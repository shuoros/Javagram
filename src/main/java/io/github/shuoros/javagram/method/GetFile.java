package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.File;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetFile implements Method {

    private final String REQUEST = "/getFile";
    private String fileId;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new File();
    }

}
