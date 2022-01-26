package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhotoSize {

    private String fileId;
    private String fileUniqueId;
    private int width;
    private int height;
    private int fileSize;

    public PhotoSize(String fileId, String fileUniqueId, int width, int height) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.width = width;
        this.height = height;
    }

}
