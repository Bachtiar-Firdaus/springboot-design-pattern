package bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts;

import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.bcaklikpay.BcaKlikpayCancelPaymentRequest;
import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.bcaklikpay.BcaKlikpayChargePaymentRequest;
import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.bcaklikpay.BcaKlikpayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BcaKlikpayPaymentFactory implements PaymentFactory{

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BcaKlikpayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BcaKlikpayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BcaKlikpayGetBalancePaymentRequest();
    }
}
