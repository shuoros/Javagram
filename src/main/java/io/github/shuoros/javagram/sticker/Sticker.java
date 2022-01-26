package io.github.shuoros.javagram.sticker;

import io.github.shuoros.javagram.type.PhotoSize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sticker {

    private String fileId;
    private String fileUniqueId;
    private int width;
    private int height;
    private boolean isAnimated;
    private PhotoSize thumb;
    private String emoji;
    private String setName;
    private MaskPosition maskPosition;
    private int fileSize;

    public Sticker(String fileId, String fileUniqueId, int width, int height, boolean isAnimated) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.width = width;
        this.height = height;
        this.isAnimated = isAnimated;
    }

}
