package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Message;
import io.github.shuoros.javagram.type.MessageEntity;
import io.github.shuoros.javagram.type.ReplyMarkup;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class SendPoll implements Method {

    private final String REQUEST = "/sendPoll";
    private int chatId;
    private String question;
    private List<String> options;
    private boolean isAnonymous;
    private String type;
    private boolean allowsMultipleAnswers;
    private int correctOptionId;
    private String explanation;
    private List<MessageEntity> explanationEntities;
    private int openPeriod;
    private int closeDate;
    private boolean isClosed;
    private boolean disableNotification;
    private boolean protectContent;
    private int replyToMessageId;
    private boolean allowSendingWithoutReply;
    private ReplyMarkup replyMarkup;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Message();
    }

    public SendPoll(int chatId, String question, List<String> options) {
        this.chatId = chatId;
        this.question = question;
        this.options = options;
    }

}
