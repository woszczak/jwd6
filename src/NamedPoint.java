import java.awt.*;

public class NamedPoint extends Point {
    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);  // super musi byc zawsze w pierwszej linijce w ciele konstruktora
        this.name = name;
    }

    public static void main(String[] args) {
        NamedPoint np = new NamedPoint(5, 5, "SmallPoint");
        System.out.println("x wynosi " + np.x);
        System.out.println("y wynosi " + np.y);
        System.out.println("Nazwa punktu " + np.name);


    }
}
