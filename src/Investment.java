public class Investment {
    public static void main(String[] args) {

//Napisz program, który oblicza ile warta byłaby inwestycja na kwotę 14 000 zł, gdyby jej wartość zwiększyła się w pierwszym roku o 40%, w drugim roku zanotowała stratę w wysokości 1500 zł, a w trzecim roku zwiększyła się o 12%.

        int a; // początkowo
        int b; // 1 rok
        int c; //2 rok
        a = 14000;
        b = (int) (1.4 * a);
        c = (int) ( 1.12 * b);

        System.out.println("Początkowa wartość inwestycji: " + a + " zł.");
        System.out.println("Wartość inwestycji po pierwszym roku wyniesie: " + b + " zł.");
        System.out.println("Wartość inwestycji w drugim roku wyniesie: " + (b - 1500) + " zł.");
        System.out.println("Wartość inwestycji w trzecim roku wyniesie " + c + " zł.");

    }
}