import java.util.Locale;

public class TextFormat {
    public static void main(String[] args) {
        int accountBalance = 15_005;
        System.out.printf("Saldo: %,d zł%n", accountBalance);   //%, d => po przecinku bedzie liczba dziesietna (digit); tylko w frintf    | n => nowa linia

        // %[flags][width][.precision]conversion-character
    //w kwadratowych nawiasach sa info nieobowiazkowe

        //s - formatuj strings
        //d - decimal integers
        //f - floating points numbers/ liczby zmiennoprzecinkowe
        //t - time / format date/times values
        //n - separacja linia\ new line
        //bB - boolean --> format wartosci logicznych

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf(new Locale("us"),"%.11f%n", pi);    //11 znakow po przdecinku i znak nowej linii
        //stałe są zapisane wielkimi literami
// . lub , w zaleznosci od lokalizacji; mozna na stale zmienic recznie ==> new Locale("us")


    }

}
