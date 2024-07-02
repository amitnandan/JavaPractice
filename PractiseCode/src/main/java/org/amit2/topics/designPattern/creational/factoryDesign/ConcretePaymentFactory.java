package org.amit2.topics.designPattern.creational.factoryDesign;





abstract class PaymentFactory {
    public abstract Payment createProduct(String  type );
}


public class ConcretePaymentFactory extends PaymentFactory{

    @Override
    public Payment createProduct( String type) {

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



class Razorpay implements  Payment  {
    @Override
    public void pay() {
        System.out.println( "pay THROUGH RAZORPAY");
    }
}
class PhonePe implements  Payment{
    @Override
    public void pay() {
        System.out.println( "pay THROUGH PHONEPE");

    }
}

class Googlepay implements Payment{
    
    @Override
    public void pay() {
        System.out.println( "pay THROUGH GOOLGEPAY");

    }
}