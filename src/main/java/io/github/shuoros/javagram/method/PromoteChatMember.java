package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Bool;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PromoteChatMember implements Method {

    private final String REQUEST = "/promoteChatMember";
    private String chatId;
    private int userId;
    private boolean isAnonymous;
    private boolean canManageChat;
    private boolean canPostMessages;
    private boolean canEditMessages;
    private boolean canDeleteMessages;
    private boolean canManageVoiceChats;
    private boolean canRestrictMembers;
    private boolean canPromoteMembers;
    private boolean canChangeInfo;
    private boolean canInviteUsers;
    private boolean canPinMessages;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Bool();
    }

    public PromoteChatMember(int chatId, int userId) {
        this(String.valueOf(chatId), userId);
    }

    public PromoteChatMember(String chatId, int userId) {
        this.chatId = chatId;
        this.userId = userId;
    }

}
