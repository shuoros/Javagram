package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MessageEntity {

    private String type;
    private int offset;
    private int length;
    private String url;
    private User user;
    private String language;

}
