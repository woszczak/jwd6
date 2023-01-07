// do poprawy
public class A {
    public A() {
        super();
        System.out.println("Działa konstuktor A()");
    }
    public A(String param) {
        System.out.println("Działa konstuktor A(" + param + ")");
    }

}

    class B extends A {
        public B() {
            super();
            System.out.println("Działa konstuktor B()");
        }
        public B(String param) {

            System.out.println("Działa konstuktor B(" + param + ")");
        }
    }

    class Test {
        public static void main(String[] args) {
            B b = new B("test");
        }
    }
