package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.ChatInviteLink;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateChatInviteLink implements Method {

    private final String REQUEST = "/createChatInviteLink";
    private String chatId;
    private String name;
    private int expireDate;
    private int memberLimit;
    private boolean createsJoinRequest;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new ChatInviteLink();
    }

    public CreateChatInviteLink(int chatId) {
        this(String.valueOf(chatId));
    }

    public CreateChatInviteLink(String chatId) {
        this.chatId = chatId;
    }

}
