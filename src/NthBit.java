public class NthBit {

    public static void main(String[] args) {
        //Napisz program wyznaczający wartość n-tego bitu (licząc od lewej do prawej) dla dowolnej liczby całkowitej typu int.

        int a = 15;
        int n;
        n = 29;
        //System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        String value = String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.println("Nasza liczba w systemie binarnym to: " + value);
        System.out.println( "Wartość " + n + "-tego bitu liczby " + a + " wynosi:  " + value.charAt(n));



  }
}