public class CMP202 {
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 23;
        height = 172;
        name = "Godswill Ubah";
        name.length();
        password = "Sireldest";
        if (password.contains("eldest") || password.contains("sir")) {
            System.out.println("Password is not strong enough");
        }
    }    
}
