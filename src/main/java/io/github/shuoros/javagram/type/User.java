package io.github.shuoros.javagram.type;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Type {

    private String id;
    private boolean isBot;
    private String firstName;
    private String lastName;
    private String username;
    private String languageCode;
    private boolean canJoinGroups;
    private boolean canReadAllGroupMessages;
    private boolean supportsInlineQueries;

}
