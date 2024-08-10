package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myapplet3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Metin");

        JLabel l1, l2, l3; // yazılar
        JTextField t1, t2, t3; // metin girişleri
        JButton btn; // buton
        l1 = new JLabel("First Number");
        l1.setBounds(25, 10, 150, 30); // 1.yazı
        l1.setBackground(Color.WHITE);

        t1 = new JTextField();
        t1.setBounds(25, 40, 150, 30);// 1.metin girişi

        l2 = new JLabel("Second Number");
        l2.setBounds(25, 70, 150, 30);// 2.yazı

        t2 = new JTextField();
        t2.setBounds(25, 100, 150, 30);// 2.metin girişi

        l3 = new JLabel("Result");
        l3.setBounds(80, 130, 150, 30);// 3.yazı

        t3 = new JTextField();
        t3.setBounds(25, 160, 150, 30);// 3.metin girişi
        t3.setEditable(false);// metin girişini kapatma

        btn = new JButton("Result");
        btn.setBounds(25, 200, 150, 30);// buton

        btn.setBackground(Color.YELLOW); // buton arkaplanı

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                String result = String.valueOf(c);
                t3.setText(result);
            }
        });

        // Eklemeler
        frame.add(btn);
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);

        frame.setSize(220, 400); // pencere boyutu
        frame.getContentPane().setBackground(Color.GRAY); // pencere arkaplanı
        frame.setLayout(null); // bileşenleri manuel yerleştirmemiz için
        frame.setVisible(true); // pencere görünürlüğü
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // pencere kapatttığımızda kodun durması
    }
}
