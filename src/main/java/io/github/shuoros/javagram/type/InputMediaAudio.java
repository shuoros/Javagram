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
public class InputMediaAudio implements InputMedia {

    private final String type = "audio";
    private String media;
    private String thumb;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;
    private int duration;
    private int performer;
    private int title;

}
