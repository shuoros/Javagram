package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Voice {

    private String fileId;
    private String fileUniqueId;
    private int duration;
    private String mimeType;
    private int fileSize;

    public Voice(String fileId, String fileUniqueId, int duration) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.duration = duration;
    }

}
