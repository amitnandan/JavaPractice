package org.amit2.topics.designPattern.creational.abstractFactory;


interface PaymentFactory{
     UPIPaymentFactory getUPIPaymentFactory();
     BankPaymentFactory getBankPaymentFactory();
}

public class AbstractPaymentFactory implements PaymentFactory{

    @Override
    public UPIPaymentFactory getUPIPaymentFactory() {
        return new UPIPaymentFactory();
    }

    @Override
    public BankPaymentFactory getBankPaymentFactory() {
        return new BankPaymentFactory();
    }
}
