package io.github.shuoros.javagram.passport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PassportData {

    private List<EncryptedPassportElement> data;
    private EncryptedCredentials credentials;

}
