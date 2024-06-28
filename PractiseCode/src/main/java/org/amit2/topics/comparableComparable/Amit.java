package org.amit2.topics.comparableComparable;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Amit implements Comparable<Amit>{
     private String name ;
     private int age;

//    @Override
//    public int compareTo(Amit o) {
//        return  Integer.compare(this.age, o.age);
//    }
    @Override
    public int compareTo(Amit o) {
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString() {
        return name + " - " + age;
    }
}
