import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JDialog { // class
    public JPanel LoginPanel;
    private JButton loginButton;
    private JTextField Email;
    private JPasswordField Password;

    public Login() { // constructor
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = Email.getText(); // variabel
                String password = Password.getText();
                if (Email.getText().equals("Rafly") && Password.getText().equals("12345")){ //pengkondisian dan setter getter
                    JOptionPane.showMessageDialog(null, "Selamat Datang");
                    JFrame utama = new JFrame("Pilih Brand"); //Object Oriented Programming
                    utama.setContentPane(new Pilih_Brand().PanelBrand);
                    utama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    utama.setLocationRelativeTo(null);
                    utama.pack();
                    utama.setSize(500, 500);
                    utama.setLocation(500 , 100);
                    utama.setResizable(true);
                    utama.setVisible(true);
                } else { //pengkondisian
                    JOptionPane.showMessageDialog(null, "Email atau password salah");
                    Email.setText("");
                    Password.setText("");
                    Email.requestFocus();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame Login = new JFrame("Login");
        Login.setContentPane(new Login().LoginPanel);
        Login.pack();
        Login.setVisible(true);
        Login.setSize(600, 550);
        Login.setLocation(400 , 120);
        Login.setResizable(true);
    }
}




