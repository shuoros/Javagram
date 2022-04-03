package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.ChatInviteLink;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EditChatInviteLink implements Method {

    private final String REQUEST = "/editChatInviteLink";
    private String chatId;
    private String inviteLink;
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

    public EditChatInviteLink(int chatId, String inviteLink) {
        this(String.valueOf(chatId), inviteLink);
    }

    public EditChatInviteLink(String chatId, String inviteLink) {
        this.chatId = chatId;
        this.inviteLink = inviteLink;
    }

}
