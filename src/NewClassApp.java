public class NewClassApp {
    //Utwórz klasę ze zmiennymi egzemplarza height, width, depth, będącymi liczbami całkowitymi.
    // Utwórz aplikację, która korzysta z nowej klasy, ustawia zmienne w obiekcie a następnie je wyświetla.
    public static void main(String[] args) {
        NewClass data1 = new NewClass();
        data1.height = 18;
        data1.width = 29;
        data1.depth = 48;

        System.out.println("Wysokość: " + data1.height);
        System.out.println("Szerokość: " + data1.width);
        System.out.println("Głębokość: " + data1.depth);

        System.out.println("-----------------------------------");

        NewClass data2 = new NewClass();
        data2.height = 46;
        data2.width = 53;
        data2.depth = 23;

        System.out.println("Wysokość: " + data2.height);
        System.out.println("Szerokość: " +  data2.width);
        System.out.println("Głębokość: " +  data2.depth);

    }
}
