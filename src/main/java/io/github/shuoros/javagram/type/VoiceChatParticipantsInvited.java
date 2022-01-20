package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VoiceChatParticipantsInvited {

    private List<User> users;

}
