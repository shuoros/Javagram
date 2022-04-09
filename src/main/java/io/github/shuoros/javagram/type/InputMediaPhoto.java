package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InputMediaPhoto implements InputMedia {

    private final String type = "photo";
    private String media;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;

}
