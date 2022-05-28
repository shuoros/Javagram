package io.github.shuoros.javagram.type;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chat implements Type {

    private long id;
    private String type;
    private String title;
    private String username;
    private String firstName;
    private String lastName;
    private ChatPhoto photo;
    private String bio;
    private String description;
    private String inviteLink;
    private Message pinnedMessage;
    private ChatPermissions permissions;
    private int slowModeDelay;
    private int messageAutoDeleteTime;
    private String stickerSetName;
    private boolean canSetStickerSet;
    private int linkedChatId;
    private ChatLocation location;

    public Chat(int id, String type) {
        this.id = id;
        this.type = type;
    }

}
