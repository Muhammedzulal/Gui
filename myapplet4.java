package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myapplet4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea");
        JLabel l1, l2;
        JTextArea t1;
        JButton btn;
        l1 = new JLabel("Kelimeler: ");
        l1.setBounds(75, 65, 100, 20);
        l2 = new JLabel("Karakterler: ");
        l2.setBounds(180, 65, 100, 20);
        t1 = new JTextArea();
        t1.setBounds(75, 90, 200, 170);
        btn = new JButton("Hesapla");
        btn.setBounds(75, 270, 200, 30);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = t1.getText();
                String words[] = txt.split("\\s");
                l1.setText("Kelimeler: " + words.length);
                l2.setText("Karakterler: " + txt.length());

            }

        });

        frame.add(btn);
        frame.add(t1);
        frame.add(l2);
        frame.add(l1);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}