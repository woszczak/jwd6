public class ConvTester {

    public static void main(String[] args) {

       // byte a = 7;
       // short b;
       // int c;
       // c = a; // konwersja niejawna
       // b = (short)c; //konwersja jawna/ rzutowanie ==> int jest za duze zeby mozna bylo zamienic na slepo w short

        int a = 5;
        double b = 13.5;
       // int c = (int)b / a;// => stracimy precyzje



        //     int firstPrice = 234;  // jak int zamienimy na typ obiektowy/referencyjny Integer to tez zadziala (unboxing dziala automatycznie)
        //int secondPrice = 178;
        // System.out.println(Math.max(firstPrice, secondPrice)); //metoda Math jest statyczna dlatego nie potrzebujemy obiektu klasy Math
        //short tez zadziala, bo nie ma utraty precyzji, robi aurtomatyczna konwersje niejawna
    }
}
