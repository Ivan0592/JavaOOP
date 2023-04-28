package Seminar4;
public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons( new Archer( "Robin_1", 100, new Bow( 20 ), new SimpleShield() ) )
                .addPersons( new Archer( "Bobin_1", 100, new Bow( 15 ), new SimpleShield() ) );
        knights.addPersons( new Knight( "John", 150, new Knife(), new MiddleShield() ) )
                .addPersons( new Knight( "Adam", 150, new Knife(), new MiddleShield() ) );
        Archer archer1 = new Archer( "Robin", 100, new Bow( 20 ), new SimpleShield() );
        Archer archer2 = new Archer( "Bobin", 150, new Bow( 15 ), new SimpleShield() );
        Battle fight = new Battle( archer1, archer2 );
        fight.run();

        Knight knight1 = new Knight( "John", 100, new Knife(), new MiddleShield() );
        Battle fight2 = new Battle( archer2, knight1 );
        fight2.run();

        ArcherWithoutShield archerWithout1 = new ArcherWithoutShield( "Volh", 100, new Bow( 20 ) );
        Battle fight3 = new Battle( archer1, archerWithout1 );
        fight3.run();
    }
}
