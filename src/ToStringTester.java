import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class ToStringTester {
    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i.toString()); //toString jest tu niep[otrzebne bo i tak w ten sposob zadziala

        Point point = new Point(3,4);
        System.out.println(point); //niejawnie zostala tu wywołana metoda toString =. point.toString()

        Employee employee= new Employee("Kowalski", 28, 3900);
        System.out.println(employee);

         employee= new Employee("Nowak", 55, 8000);
        System.out.println(employee);
    }
}
