package bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts;

import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.gopay.GopayCancelPaymentRequest;
import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.gopay.GopayChargePaymentRequest;
import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.gopay.GopayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory{

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalancePaymentRequest();
    }
}
