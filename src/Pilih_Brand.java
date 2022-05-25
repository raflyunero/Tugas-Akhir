import javax.swing.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class Pilih_Brand extends JDialog {
    private JButton KTCButton;
    private JButton RCBButton;
    public JPanel PanelBrand;
    public JFrame delete;

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
                delete.setVisible(false);
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
                delete.setVisible(false);
            }
        });
    }
    public static void main(String[] args) {
        JFrame pilih_brand = new JFrame("Pilih Brand");
        Pilih_Brand frame = new Pilih_Brand();
        frame.delete = pilih_brand;
        pilih_brand.setContentPane(frame.PanelBrand);
        pilih_brand.pack();
        pilih_brand.setVisible(true);
        pilih_brand.setSize(600, 600);
        pilih_brand.setResizable(true);
    }
}