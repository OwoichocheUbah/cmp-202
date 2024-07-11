public class User {
    String username = "Godswill Ubah";
    String email = "ubah-godswill@gmail.com";
    String login() {
        if (username.equals("Godswill Ubah") && email.equals("ubah-godswill@gmail.com")) {
            return "Logged in";
        } else {
            return "Failed";
        }
    }
    public static void main(String[] args) {
        User ubah = new User();
        System.out.println(ubah.login());
    }
}
