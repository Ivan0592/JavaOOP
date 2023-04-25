package Seminar3.Task2;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
