package org.amit2.topics.designPattern.creational.AbstractFactory;

public class Test {
    public static void main(String[] args){

        PaymentFactory paymentFactory = new AbstractPaymentFactory();
        BPaymentFactory bankPayment = paymentFactory.getBankPaymentFactory();
        bankPayment.createPayment("ICICI").pay();
    }
}
