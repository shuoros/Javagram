package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ReplyKeyboardMarkup<KeyboardButton> implements ReplyMarkup {

    private List<List<KeyboardButton>> keyboard;
    private boolean resizeKeyboard;
    private boolean oneTimeKeyboard;
    private String inputFieldPlaceholder;
    private boolean selective;

    public ReplyKeyboardMarkup(List<List<KeyboardButton>> keyboard) {
        this.keyboard = keyboard;
    }

}
