package io.github.shuoros.javagram.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShippingAddress {

    private String countryCode;
    private String state;
    private String city;
    private String streetLine1;
    private String streetLine2;
    private String postCode;

}
