public class NthBitAnswear {

    public static void main(String[] args) {
        int i = 5;
        int n = 2;
        int mask = 1<<(n-1);

        boolean result = (i & mask) > 0;   //bitowe pomnozenie i przez maske

        System.out.println(" Dla liczby " + i + " na " + n + " pozycji znajduje się bit: " + result);

        //mask = 1<<(n-1) // n-1 bo bit jest juz na 1 pozycji

        System.out.println();
        System.out.println();

        System.out.println(String.format("%32s",Integer.toBinaryString(i)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(mask)).replace(' ', '0'));
        System.out.println("-------------------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(i & mask)).replace(' ', '0'));

    }

}
