package io.github.shuoros.javagram.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {

    private String name;
    private String phoneNumber;
    private String email;
    private ShippingAddress shippingAddress;

}
