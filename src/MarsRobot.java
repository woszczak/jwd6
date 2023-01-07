public class MarsRobot {

    String status;
    int speed;
    int power;


    //konstruktor z parametrami:
    MarsRobot(String status, int speed, int power){
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    MarsRobot(){} // --> trzeba go dostarczyc ; jesli tworzymy jakieś komnstruktory to konstr. bezargumentowy nie zostanie sam wyświetlony


    public static void main(String[] args) {
        MarsRobot marsRobot = new MarsRobot("w bazie", 0, 4);   //obiekt, który korzysta z konstruktora
//        marsRobot.status = "w bazie";
//        marsRobot.speed = 0;
//        marsRobot.power = 4;
        System.out.println(marsRobot.status);
    }

}
