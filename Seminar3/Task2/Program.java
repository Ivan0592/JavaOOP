package Seminar3.Task2;

public class Program {
    public static void main(String[] args) {
        Men om1 = new Men( "OLeg", 55 );
        Children oc1 = new Children( "Ivan", 5 );
        Cat c1 = new Cat( "Barsic", 2 );
        Dog d1 = new Dog( "Sharic", 3 );

        om1.meeting( oc1 );
        oc1.meeting( om1 );

        d1.meeting( d1 );
        d1.meeting( c1 );
        om1.meeting( d1 );
        d1.meeting( om1 );
    }
}
