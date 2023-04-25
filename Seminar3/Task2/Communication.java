package Seminar3.Task2;

public interface Communication<T extends Animals, E extends Person> {
    public void meeting(T animal);

    public void meeting(E person);
}
