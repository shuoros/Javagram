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

    public MessageEntity(String type, int offset, int length) {
        this.type = type;
        this.offset = offset;
        this.length = length;
    }

}
