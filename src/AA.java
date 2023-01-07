////overriding (przesłanianie); rozszerzamy klase A => zmieniamy zachowanie metody show()
//public class A {
//
//    void show(){
//        System.out.println("A");
//    }
//}
//
//
//class B extends A {   //wszystko co dostępne w klasie A będzie  też dostępne w klasie B
//    void show(){
//        System.out.println("B");
//    }
//
//    public static void main(String[] args) {
//        B b = new B();  //metoda B przesłoni nam metodę z klasy A (musi być ta sama nazwa metody, parametry i zwracany typ)
//        b.show();
//
//    }
//}