package pl.edu.wszib;

import pl.edu.wszib.szejki.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        MyClass2 myClass = new MyClass2();
        myClass.field2 = "field2";
        myClass.field3 = "field3";
        myClass.field4 = "field4";

        myClass.run2();
        myClass.run3();
        myClass.run4();
        myClass.run();

        ShakeTruskawkowy shakeTruskawkowy = new ShakeTruskawkowy();
        shakeTruskawkowy.main();
    }
}
