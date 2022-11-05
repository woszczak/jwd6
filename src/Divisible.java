public class Divisible {

    public static void main(String[] args) {

        // Napisz wyrażenie logiczne, które sprawdza, czy dana liczba całkowita może być podzielona (bez reszty) przez 7 i 5 jednocześnie.


        int a;
        a=34;

        if (a % 7 == 0 && a % 5 == 0){
            System.out.println("Liczba " + a + " jest podzielna przez 7 i 5 jednocześnie");
        }
        else {
            System.out.println("Liczba " + a + " NIE jest podzielna przez 7 i 5 jednocześnie");
        }

    }
}