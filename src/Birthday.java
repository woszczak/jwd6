import java.util.StringTokenizer;

public class Birthday {

    //Utwórz program, który zmienia datę urodzin w formacie DD/MM/RRRR (na przykład 29/04/2016) na trzy oddzielne teksty.

    public static void main(String[] args) {
        StringTokenizer birth;
        String date = "29/04/2016";

        birth = new StringTokenizer(date,"/");
        System.out.println("Urodziny: " + date);
        System.out.println("Dzień: " + birth.nextToken());
        System.out.println("Miesiąc: " + birth.nextToken());
        System.out.println("Rok: " + birth.nextToken());



        //------------------------------------------------------------

        // drugi sposob:
        // String birthday = "29/04/2016";
        // String day = birthday.substring(0, 2);
        //String month = birthday.substring(3, 5);
        //String year = birthday.substring(6, 10);

        //System.out.println("Urodziny: " + birthday);
        //System.out.println("Dzień: " + day);
        //System.out.println("Miesiąc: " + month);
        // System.out.println("Rok: " + year);



    }


}


