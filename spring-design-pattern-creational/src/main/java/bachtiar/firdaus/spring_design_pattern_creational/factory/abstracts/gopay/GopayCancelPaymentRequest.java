package bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.gopay;

import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.CancelPaymentRequest;
import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;


public class GopayCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
