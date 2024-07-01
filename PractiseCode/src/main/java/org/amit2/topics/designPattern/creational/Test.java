package org.amit2.topics.designPattern.creational;

public class Test {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton1 == singleton2: " + (singleton1 == singleton2)); // Output: true

        singleton2.setA(52);
        singleton1.setA(51);

        System.out.println("singleton1.hashCode(): " + singleton1.getA());
        System.out.println("singleton2.hashCode(): " + singleton2.getA());

        // Hash codes should be the same due to default behavior
        System.out.println("singleton1.hashCode(): " + singleton1.hashCode());
        System.out.println("singleton2.hashCode(): " + singleton2.hashCode());

    }
}
