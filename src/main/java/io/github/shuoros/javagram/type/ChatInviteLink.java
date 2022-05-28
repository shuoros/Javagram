package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatInviteLink implements Type {

    private String inviteLink;
    private User creator;
    private boolean createsJoinRequest;
    private boolean isPrimary;
    private boolean isRevoked;
    private String name;
    private int expireDate;
    private int memberLimit;
    private int pendingJoinRequestCount;

}
