package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Document {

    private String fileId;
    private String fileUniqueId;
    private PhotoSize thumb;
    private String fileName;
    private String mimeType;
    private int fileSize;

    public Document(String fileId, String fileUniqueId) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
    }

}
