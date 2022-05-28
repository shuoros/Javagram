package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class File implements Type {

    private String fileId;
    private String fileUniqueId;
    private Int fileSize;
    private String filePath;

}
