package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Audio {

    private String fileId;
    private String fileUniqueId;
    private int duration;
    private String performer;
    private String title;
    private String fileName;
    private String mimeType;
    private int fileSize;
    private PhotoSize thumb;

    public Audio(String fileId, String fileUniqueId, int duration) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.duration = duration;
    }

}
