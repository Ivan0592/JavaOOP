package Seminar5.Task1;

public class CalculateRational extends Numbers implements Calculating<Numbers> {
    public CalculateRational(double x, double y) {
        super( x, y );
    }

    @Override
    public Numbers sum() {
        return new Numbers( x + y );
    }

    @Override
    public Numbers diff() {
        return new Numbers( x - y );
    }

    @Override
    public Numbers mult() {
        return new Numbers( x * y );
    }

    @Override
    public Numbers div() {
        return new Numbers( x / y );
    }

    @Override
    public String toString() {
        return "CalculateRational{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
