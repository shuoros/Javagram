package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Boolean;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DeleteChatStickerSet implements Method {

    private final String REQUEST = "/deleteChatStickerSet";
    private String chatId;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Boolean();
    }

    public DeleteChatStickerSet(int chatId) {
        this.chatId = String.valueOf(chatId);
    }

}
