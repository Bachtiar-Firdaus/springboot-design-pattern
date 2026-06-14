package bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts;

public interface PaymentFactory {

    ChargePaymentRequest createChargeRequest();

    CancelPaymentRequest createCancelRequest();

    GetBalancePaymentRequest createGetBalanceRequest();

}
