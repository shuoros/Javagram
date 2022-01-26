package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ForceReply implements ReplyMarkup {

    final boolean forceReply = true;
    private String inputFieldPlaceholder;
    private boolean selective;

}
