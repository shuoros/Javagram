package io.github.shuoros.javagram.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    private String title;
    private String description;
    private String startParameter;
    private String currency;
    private String totalAmount;

}
