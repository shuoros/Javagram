package io.github.shuoros.javagram.type;

import io.github.shuoros.javagram.game.Game;
import io.github.shuoros.javagram.sticker.Sticker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Type {

    private int messageId;
    private User from;
    private Chat senderChat;
    private int date;
    private Chat chat;
    private User forwardFrom;
    private Chat forwardFromChat;
    private int forwardFromMessageId;
    private String forwardSignature;
    private String forwardSenderName;
    private int forwardDate;
    private Message replyToMessage;
    private User viaBot;
    private int editDate;
    private String mediaGroupId;
    private String authorSignature;
    private String text;
    private List<MessageEntity> entities;
    private Animation animation;
    private Audio audio;
    private Document document;
    private List<PhotoSize> photo;
    private Sticker sticker;
    private Video video;
    private Voice voice;
    private String caption;
    private List<MessageEntity> captionEntities;
    private Contact contact;
    private Dice dice;
    private \
    Game game;
    private Poll poll;
    private Venue venue;
    private Location location;
    private List<User> newChatMembers;
    private User leftChatMember;
    private String newChatTitle;
    private List<PhotoSize> newChatPhoto;
    private boolean deleteChatPhoto;
    private boolean groupChatCreated;
    private boolean supergroupChatCreated;
    private boolean channelChatCreated;
    private MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
    private int migrateToChatId;
    private int migrateFromChatId;
    private Message pinnedMessage;
    private Invoice invoice;
    private SuccessfulPayment successfulPayment;
    private String connectedWebsite;
    private PassportData passportData;
    private ProximityAlertTriggered proximityAlertTriggered;
    private VoiceChatScheduled voiceChatScheduled;
    private VoiceChatStarted voiceChatStarted;
    private VoiceChatEnded voiceChatEnded;
    private VoiceChatParticipantsInvited voiceChatParticipantsInvited;
    private InlineKeyboardMarkup replyMarkup;

    public Message(int messageId, User from, Chat senderChat, int date, Chat chat) {
        this.messageId = messageId;
        this.from = from;
        this.senderChat = senderChat;
        this.date = date;
        this.chat = chat;
    }
}
