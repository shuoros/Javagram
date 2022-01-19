package io.github.shuoros.javagram.type;

import io.github.shuoros.javagram.game.CallbackGame;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InlineKeyboardButton {

    private String text;
    private String url;
    private LoginUrl loginUrl;
    private String callbackData;
    private String switchInlineQuery;
    private String switchInlineQueryCurrentChat;
    private CallbackGame callbackGame;
    private boolean pay;

    public InlineKeyboardButton(String text) {
        this.text = text;
    }

}
