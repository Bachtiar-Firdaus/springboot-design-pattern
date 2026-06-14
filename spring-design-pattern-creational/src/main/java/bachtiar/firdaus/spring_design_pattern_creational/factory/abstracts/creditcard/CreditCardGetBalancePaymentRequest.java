package bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.creditcard;

import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.GetBalancePaymentRequest;
import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;


public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
