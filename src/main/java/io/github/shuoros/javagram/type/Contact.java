package io.github.shuoros.javagram.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    private String phoneNumber;
    private String firstName;
    private String lastName;
    private int userId;
    private String vcard;

    public Contact(String phoneNumber, String firstName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
    }

}
