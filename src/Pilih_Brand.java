import javax.swing.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class Pilih_Brand extends JDialog {
    private JButton KTCButton;
    private JButton RCBButton;
    public JPanel PanelBrand;

    public Pilih_Brand() {
        KTCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame kedua = new JFrame("Brand KTC");
                kedua.setContentPane(new KTC().KTCPanel);
                kedua.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                kedua.setLocationRelativeTo(null);
                kedua.pack();
                kedua.setLocation(400 , 120);
                kedua.setSize(600, 600);
                kedua.setResizable(true);
                kedua.setVisible(true);
            }
        });
        RCBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ketiga = new JFrame("Brand RCB");
                ketiga.setContentPane(new BeliRCB().PanelRCB);
                ketiga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ketiga.setLocationRelativeTo(null);
                ketiga.pack();
                ketiga.setSize(550, 500);
                ketiga.setLocation(400 , 120);
                ketiga.setResizable(true);
                ketiga.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        JFrame pilih_brand = new JFrame("Pilih Brand");
        pilih_brand.setContentPane(new Pilih_Brand().PanelBrand);
        pilih_brand.pack();
        pilih_brand.setVisible(true);
        pilih_brand.setSize(600, 600);
        pilih_brand.setResizable(true);
    }
}
