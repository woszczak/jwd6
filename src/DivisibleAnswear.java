public class DivisibleAnswear {

    public static void main(String[] args) {
        int i = 35;
        boolean result = (i % 5) == 0 && (i % 7) == 0;
        System.out.println("Czy liczba " + i + " dzieli się przez 7 i 5 jednocześnie? - " + result);
    }
}
