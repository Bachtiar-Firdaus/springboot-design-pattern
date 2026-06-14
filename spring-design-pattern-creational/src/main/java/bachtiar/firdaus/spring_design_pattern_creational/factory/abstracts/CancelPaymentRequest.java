package bachtiar.firdaus.spring_design_pattern_creational.factory.abstracts;

public interface CancelPaymentRequest {

    String getId();

    void setId(String id);

    PaymentMethod getMethod();

}
