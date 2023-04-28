package Seminar4;

public class Archer extends Warrior<Throwing, SimpleShield> {
    public Archer(String name, int hp, Throwing weapon, SimpleShield protection) {
        super( name, hp, weapon, protection );
    }

    public int getRange() {
        return rand.nextInt( weapon.getDistance() + 1 );
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString() +
                '}';
    }
}
