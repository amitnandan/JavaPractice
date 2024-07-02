package org.amit2.topics.designPattern.creational.factoryDesign;

public class Test {
    public static void main(String[] args){
//        PaymentFactory paymentFactory = new ConcretePaymentFactor().createProduct("phonepe");
        PaymentFactory factory = new ConcretePaymentFactory();

        // Create RazorPay payment
        Payment razorpay = factory.createProduct("razorpay");
        razorpay.pay();

        Payment phonepe = factory.createProduct("PhonePe");
        phonepe.pay();

    }
}
