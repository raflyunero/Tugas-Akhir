import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KTC extends JDialog {
    public JPanel KTCPanel;
    private JButton MasterKTC;
    private JButton KaliperKTC;
    private JButton DIscKTC;
    private JButton GasKTC;
    private JButton StikerKTC;
    private JButton KoplingKTC;
    private JButton prosesButton;
    public JTextArea textHasil;

    public KTC() {
        MasterKTC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 950000;
                textHasil.setText("Master Rem KTC Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");

            }
        });
        GasKTC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 35000;
                textHasil.setText("Gas Spontan KTC Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        StikerKTC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 9600;
                textHasil.setText("Stiker KTC Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        KaliperKTC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 650000;
                textHasil.setText("Kaliper KTC Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        DIscKTC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 400000;
                textHasil.setText("Disc KTC Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        KoplingKTC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 370000;
                textHasil.setText("Kopling KTC Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame yakinPanel = new JFrame("Yakin?");
                yakinPanel.setContentPane(new yakin().yakinPanel);
                yakinPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                yakinPanel.setLocationRelativeTo(null);
                yakinPanel.pack();
                yakinPanel.setVisible(true);
                yakinPanel.setSize(250, 100);
                yakinPanel.setLocation(600, 250);
            }
        });
    }
    public static void main(String[] args) {
        JFrame KTC = new JFrame("Brand KTC");
        KTC.setContentPane(new KTC().KTCPanel);
        KTC.pack();
        KTC.setVisible(true);
        KTC.setSize(600 , 600);
        KTC.setResizable(true);
    }
}
