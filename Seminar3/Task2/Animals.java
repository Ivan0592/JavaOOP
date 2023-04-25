package Seminar3.Task2;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Animals {
    private String nickname;
    private int age;

    public Animals(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
}
