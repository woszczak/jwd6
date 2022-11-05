import java.awt.*;
import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {

        //Object obj = new Object();   //deklaracja + inicjalizacja
        //String name = new String("Michael Jordan");
        //Point pt = new Point(0,0);

        StringTokenizer str1, str2;             //system zarzadzajacy akcjami
        String quote1 = "GOOG 530,80 -9,98";
        str1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + str1.nextToken());
        System.out.println("Token 2: " + str1.nextToken());
        System.out.println("Token 3: " + str1.nextToken());
        System.out.println();


        String quote2 = "RTH@75,00@0,22"; //akcje firmy RTS, ktore wynosilu 75 $ i wzrosly o 22
        str2 = new StringTokenizer(quote2, "@");
        System.out.println("Token 1: " + str1.nextToken());
        System.out.println("Token 2: " + str1.nextToken());
        System.out.println("Token 3: " + str1.nextToken());
    }

}
