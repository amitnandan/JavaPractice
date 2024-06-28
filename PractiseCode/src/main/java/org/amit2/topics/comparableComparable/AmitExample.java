package org.amit2.topics.comparableComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AmitExample {
    public static void main(String[] args) {
        List<Amit> people = new ArrayList<>();
        people.add(new Amit("Alice", 25));
        people.add(new Amit("Bob", 30));
        people.add(new Amit("Charlie", 20));


        System.out.println("------------------------------COMPARABLE--------------------------");

        Collections.sort(people); // Sorts by age


        for (Amit person : people) {
            System.out.println(person);
        }

        System.out.println("------------------------------COMPARATOR--------------------------");

        Collections.sort(people, new Comparator<Amit>() {
            @Override
            public int compare(Amit o1, Amit o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        for (Amit person : people) {
            System.out.println(person);
        }
    }
}