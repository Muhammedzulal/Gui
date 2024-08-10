package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myapplet5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPassword Ex");

        JLabel l1 = new JLabel("Password: ");
        l1.setBounds(20, 20, 300, 30);

        JButton btn = new JButton("Show");
        btn.setBounds(20, 80, 150, 30);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(20, 50, 150, 30);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String secretpassword = new String(pass.getPassword());
                l1.setText(l1.getText() + secretpassword);
            }

        });

        frame.add(pass);
        frame.add(l1);
        frame.add(btn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
