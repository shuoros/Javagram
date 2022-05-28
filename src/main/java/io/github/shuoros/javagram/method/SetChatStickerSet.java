package io.github.shuoros.javagram.method;

import io.github.shuoros.javagram.type.Boolean;
import io.github.shuoros.javagram.type.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SetChatStickerSet implements Method {

    private final String REQUEST = "/setChatStickerSet";
    private String chatId;
    private String stickerSetName;

    @Override
    public String getMethod() {
        return this.REQUEST;
    }

    @Override
    public Type getReturnType() {
        return new Boolean();
    }

    public SetChatStickerSet(int chatId, String stickerSetName) {
        this(String.valueOf(chatId), stickerSetName);
    }

}
