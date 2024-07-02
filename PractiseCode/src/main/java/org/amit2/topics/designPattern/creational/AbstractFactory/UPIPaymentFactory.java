package org.amit2.topics.designPattern.creational.AbstractFactory;



 abstract class UPaymentFactory{
     public abstract UPIPayment createPayment(String type);

    }

public class UPIPaymentFactory extends  UPaymentFactory{
    @Override
    public UPIPayment createPayment(String type) {
        switch (type.toLowerCase()){
            case "razorpay" -> {
                return new Razorpay();
            }
            case "phonepe" -> {
                return  new PhonePe();
            }
            case "googlepay" -> {
                return new Googlepay();
            }
            default -> throw new IllegalArgumentException("Wrong type Mentioned");
        }

    }
}

class Razorpay implements UPIPayment{
    @Override
    public void pay() {
        System.out.println( "pay THROUGH RAZORPAY");
    }
}
class PhonePe implements UPIPayment {
    @Override
    public void pay() {
        System.out.println( "pay THROUGH PHONEPE");

    }
}

class Googlepay implements UPIPayment {

    @Override
    public void pay() {
        System.out.println( "pay THROUGH GOOLGEPAY");

    }
}
