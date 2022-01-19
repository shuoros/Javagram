package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LoginUrl {

    private String url;
    private String forwardText;
    private String botUsername;
    private boolean requestWriteAccess;

    public LoginUrl(String url) {
        this.url = url;
    }

}
