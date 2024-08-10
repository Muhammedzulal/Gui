//ScrollBar
package Gui;

import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class MyApplet9 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel lb = new JLabel("Selamun Aleyküm");
        lb.setBounds(100, 50, 300, 30);
        // ? sss = new JScrollBar(JScrollBar.VERTICAL, Başlangıç, Buton payı, min, max);
        JScrollBar s = new JScrollBar(JScrollBar.VERTICAL, 0, 1, 0, 120);
        s.setBounds(100, 100, 20, 100);
        // ScrollBar Dinleyici
        s.addAdjustmentListener(new AdjustmentListener() {

            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                lb.setText("Değer:" + s.getValue());
            }
        });
        f.add(lb);
        f.add(s);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
