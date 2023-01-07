// formatowanie cen ==> overloading

public class PriceFormatter {
    String currency = "zł";
    String formatPrice(int value){
        return String.format("%d,00 %s",value, currency); //%d --> po przecinku dwa zera; %s --> string
    }
    String formatPrice(double value){
        return String.format("%.2f %s",value, currency); //%d --> wartość float; 2 miejsca po przecinku
    }

    String formatPrice(String value){
        return String.format("%.2f %s",Double.parseDouble(value), currency); //%d --> wartość float; 2 miejsca po przecinku // value zmieniamy do doubla
    }
    public static void main(String[] args) {
        PriceFormatter pf = new PriceFormatter();
        System.out.println(pf.formatPrice(100));   //system sam dobierze opcję metody
        System.out.println(pf.formatPrice(53.56));
        System.out.println(pf.formatPrice("550"));

    }
}
