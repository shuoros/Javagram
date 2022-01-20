package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatPhoto implements Type {

    private String smallFileId;
    private String smallFileUniqueId;
    private String bigFileId;
    private String bigFileUniqueId;

}
