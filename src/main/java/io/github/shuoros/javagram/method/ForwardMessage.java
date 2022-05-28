package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Message;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ForwardMessage implements Method {

    private final String REQUEST = "/forwardMessage";
    private int chatId;
    private int fromChatId;
    private boolean disableNotification;
    private boolean protectContent;
    private int messageId;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Message();
    }

    public ForwardMessage(int chatId, int fromChatId, int messageId) {
        this.chatId = chatId;
        this.fromChatId = fromChatId;
        this.messageId = messageId;
    }

}
