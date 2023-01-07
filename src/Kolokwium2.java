

//Załóżmy, że na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy, na drugie 2 ziarna, na trzecie 4 ziarna
//        i na każde następne pole dwa razy więcej ziaren niż na pole poprzednie.
//        Napisz program, który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren na szachownicy.
public class Kolokwium2 {
    public static void main(String[] args) {
        int i, field = 1;
        int number = 8;
        for (i = 1; i <= number; i++) {
            field = field * i;
        }
        System.out.println(field);

    }
}