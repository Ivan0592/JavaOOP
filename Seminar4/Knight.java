package Seminar4;

public class Knight extends Warrior<Knife, MiddleShield> {
    public Knight(String name, int hp, Knife weapon, MiddleShield protection) {
        super( name, hp, weapon, protection );
    }

    @Override
    public String toString() {
        return "Knight{" +
                super.toString() +
                '}';
    }
}
