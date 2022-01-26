package io.github.shuoros.javagram.game;

import io.github.shuoros.javagram.type.Animation;
import io.github.shuoros.javagram.type.MessageEntity;
import io.github.shuoros.javagram.type.PhotoSize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    private String title;
    private String description;
    private List<PhotoSize> photo;
    private String text;
    private List<MessageEntity> textEntities;
    private Animation animation;

    public Game(String title, String description, List<PhotoSize> photo) {
        this.title = title;
        this.description = description;
        this.photo = photo;
    }

}
