package bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts;

import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.creditcard.CreditCardCancelPaymentRequest;
import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.creditcard.CreditCardChargePaymentRequest;
import bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory{

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        // throw new UnsupportedOperationException("Get Balance is not supported in Credit Card");
        return new CreditCardGetBalancePaymentRequest();
    }
}
