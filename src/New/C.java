package New;

public class C extends B {
    public C() {
        System.out.println("Konstruktor C()");
    }


    public C(boolean isSilent) {
        super(true);
        if (!isSilent){
            System.out.println("Konstruktor C(" + isSilent + ")");
        }}
}
