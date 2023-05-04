package seminar6.Task2.UI;

import seminar6.Task2.Config;
import seminar6.Task2.Core.MVP.Presenter;
import seminar6.Task2.Core.MVP.View;

import java.util.Scanner;

public class App {
    public static void buttonClick() {
        System.out.print( "\033[H\033[J" );
        View view = new ConsoleView();
        Presenter presenter = new Presenter( view, Config.pathDb );
        presenter.LoadFromFile();

        try (Scanner in = new Scanner( System.in )) {
            while (true) {
                System.out.println( " 1 - prev  2 - next 3 - add 4 - save 5 - saveAnotherFormat" );
                String key = in.next();
                System.out.print( "\033[H\033[J" );
                switch (key) {
                    case "1" -> presenter.prev();
                    case "2" -> presenter.next();
                    case "3" -> presenter.add();
                    case "4" -> presenter.saveToFile();
                    case "5" -> presenter.saveToFileAnotherFormat();
                    default -> System.out.println( "Такой команды нет" );
                }
            }
        }
    }
}
