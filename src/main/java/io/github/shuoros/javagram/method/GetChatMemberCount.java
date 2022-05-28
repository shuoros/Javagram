package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Integer;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetChatMemberCount implements Method {

    private final String REQUEST = "/getChatMemberCount";
    private String chatId;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Integer();
    }

}
