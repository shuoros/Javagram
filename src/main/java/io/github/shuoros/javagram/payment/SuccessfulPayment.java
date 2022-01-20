package io.github.shuoros.javagram.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SuccessfulPayment {

    private String currency;
    private int totalAmount;
    private String invoicePayload;
    private String shippingOptionId;
    private OrderInfo orderInfo;
    private String telegramPaymentChargeId;
    private String providerPaymentChargeId;

    public SuccessfulPayment(String currency, int totalAmount, String invoicePayload) {
        this.currency = currency;
        this.totalAmount = totalAmount;
        this.invoicePayload = invoicePayload;
    }

}
