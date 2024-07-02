package org.amit2.topics.designPattern.creational.AbstractFactory;



abstract class BPaymentFactory{
    public abstract BankPayment createPayment(String type);
}
public class BankPaymentFactory extends BPaymentFactory{
    @Override
    public BankPayment createPayment(String type) {
        switch (type.toLowerCase()){
            case "hdfc" -> {
                return new HDFC();
            }
            case "icici" -> {
                return  new ICICI();
            }
            case "sbi" -> {
                return new SBI();
            }
            default -> throw new IllegalArgumentException("Wrong type Mentioned");
        }

    }

}

class HDFC implements BankPayment{

    @Override
    public void pay() {
        System.out.println("Pay HDFC BANK PAYMENT");
    }
}

class ICICI implements BankPayment{

    @Override
    public void pay() {
        System.out.println("Pay ICICI BANK PAYMENT");
    }
}

class SBI implements BankPayment{

    @Override
    public void pay() {
        System.out.println("Pay SBI BANK PAYMENT");
    }
}