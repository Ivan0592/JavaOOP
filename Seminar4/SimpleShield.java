package Seminar4;

public class SimpleShield extends Shield {
    public SimpleShield() {
        super( 10, String.format( "Simple_Shield #%d", ++Shield.number ) );
    }

    @Override
    public String toString() {
        return "SimpleShield{" + "name=" + getName()
                + " protection" + getProtection() +
                '}';
    }

    @Override
    public int protection() {
        return 10;
    }
}
