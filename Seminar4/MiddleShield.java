package Seminar4;

public class MiddleShield extends Shield {
    public MiddleShield() {
        super( 15, String.format( "Middle_Shield #%d", ++Shield.number ) );
    }

    @Override
    public String toString() {
        return "MiddleShield{" +
                "name='" + getName() + '\'' +
                ", protection=" + getProtection() +
                '}';
    }

    @Override
    public int protection() {
        return 15;
    }
}
