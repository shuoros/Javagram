package io.github.shuoros.javagram.passport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PassportFile {

    private String fileId;
    private String fileUniqueId;
    private int fileSize;
    private int fileDate;

}
