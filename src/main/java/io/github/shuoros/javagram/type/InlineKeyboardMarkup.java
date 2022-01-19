package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class InlineKeyboardMarkup implements ReplyMarkup {

    private List<List<InlineKeyboardButton>> inlineKeyboard;

}
