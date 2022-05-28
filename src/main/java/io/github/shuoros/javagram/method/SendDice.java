package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Message;
import io.github.shuoros.javagram.type.ReplyMarkup;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SendDice implements Method {

    private final String REQUEST = "/sendDice";
    private int chatId;
    private String emoji;
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

    public SendDice(int chatId) {
        this.chatId = chatId;
    }

}
