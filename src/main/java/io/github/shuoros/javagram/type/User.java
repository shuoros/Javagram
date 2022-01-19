package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private int id;
    private boolean isBot;
    private String firstName;
    private String lastName;
    private String username;
    private String languageCode;
    private boolean canJoinGroups;
    private boolean canReadAllGroupMessages;
    private boolean supportsInlineQueries;

}
