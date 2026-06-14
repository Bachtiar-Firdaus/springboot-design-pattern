package bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts;

public interface GetBalancePaymentRequest {

    String getUserId();

    void setUserId(String userId);

    PaymentMethod getMethod();

}
