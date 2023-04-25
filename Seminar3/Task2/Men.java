package Seminar3.Task2;

public class Men extends Owner implements Communication {
    public Men(String name, int age) {
        super( name, age );
    }

    @Override
    public void meeting(Animals animal) {
        if (animal instanceof Dog) {
            System.out.println( "-hi my favourite dog" );
        } else if (animal instanceof Cat) {
            System.out.println( "Hi my favourite cat" );
        }
    }

    @Override
    public void meeting(Person person) {
        if (person instanceof Children) {
            System.out.println( "-Hi children" );
        }
    }
}
