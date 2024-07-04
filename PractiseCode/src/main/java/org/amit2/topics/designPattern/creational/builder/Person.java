package org.amit2.topics.designPattern.creational.builder;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }

    public static void main(String[] args) {
        Person person = new Person()
                .setName("John Doe")
                .setAge(30)
                .setAddress("123 Main St");

        person.displayInfo();
    }
}
