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
public class Poll {

    private String id;
    private String question;
    private List<PollOption> options;
    private int totalVoterCount;
    private boolean isClosed;
    private boolean isAnonymous;
    private String type;
    private boolean allowsMultipleAnswers;
    private int correctOptionId;
    private String explanation;
    private List<MessageEntity> explanationEntities;
    private int openPeriod;
    private int closeDate;

    public Poll(String id, String question, List<PollOption> options, int totalVoterCount, boolean isClosed,
                boolean isAnonymous, String type, boolean allowsMultipleAnswers) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.totalVoterCount = totalVoterCount;
        this.isClosed = isClosed;
        this.isAnonymous = isAnonymous;
        this.type = type;
        this.allowsMultipleAnswers = allowsMultipleAnswers;
    }

}
