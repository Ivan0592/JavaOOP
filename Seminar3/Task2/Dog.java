package Seminar3.Task2;

public class Dog extends Animals implements Communication {
    public Dog(String nickname, int age) {
        super( nickname, age );
    }

    @Override
    public void meeting(Animals animal) {
        if (animal instanceof Dog) {
            System.out.println( "Battle Gaf Gaf" );
        } else if (animal instanceof Cat) {
            System.out.println( "Attack cat Uaf Uaf" );
        }
    }

    @Override
    public void meeting(Person person) {
        if (person instanceof Men) {
            System.out.println( "Wag the tail" );
        } else if (person instanceof Children) {
            System.out.println( "Run run run" );
        }
    }
}
