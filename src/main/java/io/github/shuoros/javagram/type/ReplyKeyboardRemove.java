package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ReplyKeyboardRemove implements ReplyMarkup {

    final boolean removeKeyboard = true;
    private boolean selective;

}
