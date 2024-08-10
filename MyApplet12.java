//Progress-Bar
package Gui;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyApplet12 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Yükleme Barı");
        JProgressBar pb = new JProgressBar(0, 200);
        pb.setBounds(100, 130, 200, 30);
        pb.setStringPainted(true);// güzel görünüm

        f.add(pb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int i = 0;
        while (i <= 200) {
            pb.setValue(i);
            i += 3;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Congratulations");
    }
}
