package io.github.shuoros.javagram.type;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BotCommand {

    private String command;
    private String description;

}
