
public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,1));
        System.out.println(calculator.add(1,1,1));
        System.out.println(calculator.add(2.,.2));
        System.out.println(calculator.add(Math.PI, Math.PI, Math.PI));

    }


    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }
    public double add(double a, double b, double c){
        return a + b + c;
    }
}
