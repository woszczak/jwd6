package New;

public class B extends A{
    public B() {
        System.out.println("Konstruktor B()");
    }


    public B(boolean isSilent) {
        super(true);
        if (!isSilent){

            System.out.println("Konstruktor B(" + isSilent + ")");
        }}
}
