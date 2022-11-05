public class InwestmentAnswear {

    public static void main(String[] args) {
        float total = 14_000;
        System.out.println("Inwestycja początkowa: " + total + " zł");

        total = total + (total * .4F); // total = total * 1.4F    // total *= 1.4F;
        System.out.println("Po pierwszym roku: " + total + " zł");

        total = total - 1500F;
        System.out.println("Po drugim roku: " + total + " zł");

        total = total + (total * .12F);
        System.out.println("Po trzecim roku: " + total + " zł");
    }
}
