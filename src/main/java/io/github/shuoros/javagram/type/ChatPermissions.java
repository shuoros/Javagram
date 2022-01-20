package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatPermissions implements Type {

    private boolean canSendMessages;
    private boolean canSendMediaMessages;
    private boolean canSendPolls;
    private boolean canSendOtherMessages;
    private boolean canAddWebPagePreviews;
    private boolean canChangeInfo;
    private boolean canInviteUsers;
    private boolean canPinMessages;

}
