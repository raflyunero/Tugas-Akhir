public class Setter {
    public static void main(String[] args) {
        //Pengunaan Encapsulation Setter Getter
        Login main = new Login();
        String email = main.getEmail().getText();
        String pass = main.getPassword().getText();
        String emailSet = "Rafly";
        String passSet = "123456";
        main.setEmail(emailSet);
        main.setPassword(passSet);
        main.setEmailandPassword();

    }
}