import Encapsulation.Person;

public class Main {
    static void addNumber(int a, int b){
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        CMP202 printUser = new CMP202();
        printUser.printUserDetails();
        Person student = new Person("Godswill", "Bingham", "1234", "bhu/22/04/05/0054", 123);
        Person staff = new Person("Barka fori", "Bingham", "23424", null, 445);
        System.out.println(staff);
        Main main = new Main();
        addNumber(8, 23);
        
        System.out.println(person.getName());
        System.out.println(person.setPassword("349751"));;
        person.password = "12345";
    }
}
