import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;

public class Login extends JDialog { // class
    public JPanel LoginPanel;
    private JButton loginButton;
    private JTextField Email;
    private JPasswordField Password;
    private JFrame deleteFrame;

    public Login() { // constructor
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Setter main = new Setter();
                main.setEmail("Rafly");
                main.setPassword("12345");
                if (Email.getText().equals(main.getEmail()) && Password.getText().equals(main.getPassword())){ //pengkondisian dan setter getter
                    JOptionPane.showMessageDialog(null, "Selamat Datang");
                    JFrame utama = new JFrame("Pilih Brand"); //Object Oriented Programming
                    Pilih_Brand frame = new Pilih_Brand();
                    frame.delete = utama;
                    utama.setContentPane(frame.PanelBrand);
                    utama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    utama.setLocationRelativeTo(null);
                    utama.pack();
                    utama.setSize(500, 500);
                    utama.setLocation(500 , 100);
                    utama.setResizable(true);
                    utama.setVisible(true);
                    deleteFrame.setVisible(false);


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
        JFrame frame = new JFrame("Login");
        Login login = new Login();
        login.deleteFrame = frame;
        frame.setContentPane(login.LoginPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 450);
        frame.setLocation(400 , 120);
        frame.setResizable(true);
    }
}
