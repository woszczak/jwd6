public class FamilyMemberTester {
    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.name = "Karol";
        dad.age = 34;
        // jak zmienimy nazwisko ojcu to od razu zmieni sie matce; dla calej klasy => dad.surname = "Kowalski;
        System.out.println("Nazwisko rodu to: " + dad.surname);
        System.out.println("Nazwisko rodu to: " + FamilyMember.surname); //Preferowany zapis


        FamilyMember moth = new FamilyMember();
        moth.name = "Dorota";
        moth.age = 30;
        //System.out.println("Nazwisko rodu to: " + moth.surname);
        System.out.println("Nazwisko rodu to: " + FamilyMember.surname); //Preferowany zapis

    }
}
