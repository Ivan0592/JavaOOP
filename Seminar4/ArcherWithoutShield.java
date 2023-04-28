package Seminar4;

public class ArcherWithoutShield extends Warrior<Throwing, Shield> {
    public ArcherWithoutShield(String name, int hp, Throwing weapon) {
        super( name, hp, weapon );
    }

    public int getRange() {
        return rand.nextInt( weapon.getDistance() + 1 );
    }

    @Override
    public String toString() {
        return "ArcherWithoutShield{" +
                super.toString() +
                '}';
    }
}
