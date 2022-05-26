import javax.swing.*;

public class Setter {
    //Encapsulation setter
    private String email;
    private String password;

    public Setter(){
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
