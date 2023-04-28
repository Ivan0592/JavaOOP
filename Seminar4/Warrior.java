package Seminar4;

import java.util.Random;

public class Warrior<T extends Weapon, S extends Protection> extends Person {
    protected T weapon;
    protected S protection;
    protected static Random rand = new Random();

    public Warrior(String name, int hp, T weapon, S protection) {
        super( name, hp );
        this.weapon = weapon;
        this.protection = protection;
    }

    public Warrior(String name, int hp, T weapon) {
        super( name, hp );
        this.weapon = weapon;
    }

    public int harm() {
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            if (protection != null) {
                damage = rand.nextInt( weapon.damage() + 1 ) - rand.nextInt( protection.protection() );
                if (damage < 0) {
                    damage = 0;
                }
            }
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                " name = " + getName() +
                " hp = " + getHp() +
                " weapon = " + weapon +
                '}';
    }
}
