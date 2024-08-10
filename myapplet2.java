package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myapplet2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example"); // pencere adı ve nesnesi
        frame.setSize(400, 400); // pencere boyutları

        JButton btn = new JButton("Send");// buton adı ve nesnesi
        btn.setBounds(150, 150, 100, 25);// buton yeri ve boyutları

        btn.addActionListener(new ActionListener() {
            int i = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked " + i + " times");
                i = i + 1;
            }
        });

        frame.add(btn); // butonu frame e ekleme
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// pencereyi kapattığımızda kodun durması
        frame.setLayout(null);// butonun tüm ekranı kaplamaması ve yer belirtmek
        frame.setVisible(true);// pencere görünürlüğü

    }
}
