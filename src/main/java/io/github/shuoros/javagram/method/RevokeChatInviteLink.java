package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.ChatInviteLink;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RevokeChatInviteLink implements Method {

    private final String REQUEST = "/revokeChatInviteLink";
    private String chatId;
    private String inviteLink;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new ChatInviteLink();
    }

    public RevokeChatInviteLink(int chatId, String inviteLink) {
        this(String.valueOf(chatId), inviteLink);
    }

}
