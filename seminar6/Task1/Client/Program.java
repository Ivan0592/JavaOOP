package seminar6.Task1.Client;

import seminar6.Task1.Mathematic.CalculateArea.CalculateComplex;
import seminar6.Task1.Mathematic.CalculateArea.CalculateRational;
import seminar6.Task1.UI.App;

public class Program {
    public static void main(String[] args) {
        CalculateComplex calcCompl1 = new CalculateComplex( 15, 37 );
        CalculateRational calcRation1 = new CalculateRational( 3, 30 );
        App.ButtonClick(calcCompl1);
    }
}
