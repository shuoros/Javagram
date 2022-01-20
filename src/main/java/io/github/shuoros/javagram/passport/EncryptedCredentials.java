package io.github.shuoros.javagram.passport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EncryptedCredentials {

    private String data;
    private String hash;
    private String secret;

}
