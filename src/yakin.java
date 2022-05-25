import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yakin extends  JDialog{
    private JButton yakinButton;
    public JPanel yakinPanel;
    private JButton tidakButton;
    public JFrame delete;

    public yakin() {
        yakinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Terima kasih sudah berbelanja");
                System.exit(0);
            }
        });
        tidakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame utama = new JFrame("Pilih Brand");
                utama.setContentPane(new Pilih_Brand().PanelBrand);
                utama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                utama.setLocationRelativeTo(null);
                utama.pack();
                utama.setSize(450 , 400);
                utama.setLocation(500 , 250);
                utama.setVisible(true);
                delete.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame yakin = new JFrame("Anda Yakin?");
        yakin frame = new yakin();
        frame.delete = yakin;
        yakin.setContentPane(new yakin().yakinPanel);
        yakin.pack();
        yakin.setVisible(true);
        yakin.setSize(400, 450);
        yakin.setResizable(true);
    }
}


