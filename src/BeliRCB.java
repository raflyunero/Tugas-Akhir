import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeliRCB extends JDialog {
    private JButton MasterRCB;
    private JButton KaliperRCB;
    private JButton DiscRCB;
    private JButton VelgRCB;
    private JButton KoplingRCB;
    private JButton StikerRCB;
    public JPanel PanelRCB;
    private JTextArea textHasil;
    private JButton checkoutButton;

    public BeliRCB() {
        VelgRCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 2100000;
                textHasil.setText("Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        KaliperRCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 750000;
                textHasil.setText("Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        StikerRCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 10000;
                textHasil.setText("Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        MasterRCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 950000;
                textHasil.setText("Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        DiscRCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 30000;
                textHasil.setText("Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        KoplingRCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int harga = 35000;
                textHasil.setText("Harga nya Rp. " + harga + " " + " lho ngab, anda yakin?");
            }
        });
        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame yakinPanel = new JFrame("Yakin?");
                yakinPanel.setContentPane(new yakin().yakinPanel);
                yakinPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                yakinPanel.setLocationRelativeTo(null);
                yakinPanel.pack();
                yakinPanel.setSize(250 , 100);
                yakinPanel.setLocation(600 , 250);
                yakinPanel.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame BeliRCB = new JFrame(" Brand RCB");
        BeliRCB.setContentPane(new BeliRCB().PanelRCB);
        BeliRCB.pack();
        BeliRCB.setVisible(true);
        BeliRCB.setSize(500, 400);
        BeliRCB.setLocation(400 , 100);
        BeliRCB.setResizable(true);
    }
}