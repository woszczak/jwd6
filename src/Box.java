//Formatowanie kodu: ctrl + alt + L

import java.awt.*;

public class Box {

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }


    public Box(Point topLeft, Point bottomRight) {
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);  //z ctrl kliknąć na this
    }


    public Box(Point topLeft, int w, int h) {    //w = width; h = height
        this(topLeft.x, topLeft.y, topLeft.x +w, topLeft.y + h);  //z ctrl kliknąć na this
    }


    void printBox() {
        System.out.println("Box: <" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ">");
    }


    public static void main(String[] rags) {
        Box box; //zmienna lokalna
        System.out.println("Za pomocą współrzędnych (25, 25) i (50, 50)");
        box = new Box(25, 25, 50, 50);
        box.printBox();

        System.out.println("Za pomocą punktów(1,1) i (10,5)");
        box = new Box(new Point(1, 1), new Point(10, 5));
        box.printBox();
        System.out.println();

        System.out.println("Punkt (10, 10), szerokość 20, wysokość 5");
        box = new Box(new Point(10,10), 20, 5);
        box.printBox();
        System.out.println();


    }
}
