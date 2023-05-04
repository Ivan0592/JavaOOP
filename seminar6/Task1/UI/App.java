package seminar6.Task1.UI;

import seminar6.Task1.Format.SaveTxt;
import seminar6.Task1.Mathematic.CalculateArea.CalculateComplex;
import seminar6.Task1.Mathematic.CalculateArea.CalculateRational;
import seminar6.Task1.Mathematic.Numbers.Num;

import java.util.Scanner;

public class App {
    public static void ButtonClick(Num num) {
        System.out.print( "\033[H\033[J" );
        try (Scanner in = new Scanner( System.in )) {
            System.out.println( " 1 - sum  2 - diff 3 - mult 4 - div" );
            String key = in.next();
            System.out.print( "\033[H\033[J" );
            Num result = new Num( 0 );
            SaveTxt log = new SaveTxt();
            log.saveFile( "Input " + num.toString() );

            switch (key) {
                case "1" -> {
                    if (num instanceof CalculateComplex) {
                        result = ((CalculateComplex) num).sum();
                    } else {
                        result = ((CalculateRational) num).sum();
                    }
                }
                case "2" -> {
                    if (num instanceof CalculateComplex) {
                        result = ((CalculateComplex) num).diff();
                    } else {
                        result = ((CalculateRational) num).diff();
                    }
                }
                case "3" -> {
                    if (num instanceof CalculateComplex) {
                        result = ((CalculateComplex) num).mult();
                    } else {
                        result = ((CalculateRational) num).mult();
                    }
                }
                case "4" -> {
                    if (num instanceof CalculateComplex) {
                        result = ((CalculateComplex) num).div();
                    } else {
                        result = ((CalculateRational) num).div();
                    }
                }
                default -> {
                    System.out.println( "Такой команды нет" );
                }
            }
            log.saveFile( " Result " + result.toString() + "\n" );
        }
    }
}
