package bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.bcaklikpay;

import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.GetBalancePaymentRequest;
import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;


public class BcaKlikpayGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
