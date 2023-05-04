package seminar6.Task1.Mathematic.CalculateArea;

import seminar6.Task1.Interface.Calculating;
import seminar6.Task1.Mathematic.Numbers.Num;

public class CalculateRational extends Num implements Calculating<Num> {
    public CalculateRational(double x, double y) {
        super( x, y );
    }

    @Override
    public Num sum() {
        return new Num( x + y );
    }

    @Override
    public Num diff() {
        return new Num( x - y );
    }

    @Override
    public Num mult() {
        return new Num( x * y );
    }

    @Override
    public Num div() {
        return new Num( x / y );
    }

    @Override
    public String toString() {
        return "CalculateRational{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

