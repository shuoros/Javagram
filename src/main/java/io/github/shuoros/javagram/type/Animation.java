package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animation {

    private String fileId;
    private String fileUniqueId;
    private int width;
    private int height;
    private int duration;
    private PhotoSize thumb;
    private String fileName;
    private String mimeType;
    private int fileSize;

    public Animation(String fileId, String fileUniqueId, int width, int height, int duration) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.width = width;
        this.height = height;
        this.duration = duration;
    }

}
