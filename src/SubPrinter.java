//alt + insert ==> opcje override methods ==> program zasugeruje, które metody  możemy przesłonić (te po których dziedziczymy)
// wszystkie klasy w javie dziedziczą po Object
public class SubPrinter extends Printer {
    int z = 3;



//przesłanianie metody:
void printMe() {
    System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    System.out.println("Jestem egzemplarzem klasy " + this.getClass().getSimpleName());
}
    public static void main(String[] args) {
        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe(); // metoda printMe() jest dziedziczona z klasy Printer()
    }

}
