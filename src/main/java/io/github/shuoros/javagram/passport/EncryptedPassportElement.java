package io.github.shuoros.javagram.passport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EncryptedPassportElement {

    private String type;
    private String data;
    private String phoneNumber;
    private String email;
    private List<PassportFile> files;
    private PassportFile frontSide;
    private PassportFile reverse_side;
    private PassportFile selfie;
    private List<PassportFile> translation;
    private String hash;

    public EncryptedPassportElement(String type, String hash) {
        this.type = type;
        this.hash = hash;
    }

}
