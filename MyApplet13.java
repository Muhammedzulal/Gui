package Gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MyApplet13 {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTabbedPane");
        // paneller ve yazıları
        JLabel l1 = new JLabel("İlk Alan");
        JPanel p1 = new JPanel();
        p1.add(l1);

        JLabel l2 = new JLabel("İkinci Alan");
        JPanel p2 = new JPanel();
        p2.add(l2);

        JLabel l3 = new JLabel("Üçüncü Alan");
        JPanel p3 = new JPanel();
        p3.add(l3);

        // sekmelerin oluşması panellerin eklenmesi
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 220, 220);
        tp.add("ilk", p1);
        tp.add("ikinci", p2);
        tp.add("üçüncü", p3);

        f.add(tp);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
