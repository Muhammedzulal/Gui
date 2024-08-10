package Gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myapplet7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String arr[] = { "Java", "Python", "Php" };
        @SuppressWarnings("rawtypes")
        JComboBox cb = new JComboBox<>(arr);
        cb.setBounds(75, 50, 100, 30);
        JButton btn = new JButton("Select");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(cb.getSelectedItem());
            }

        });

        btn.setBounds(75, 85, 100, 30);
        frame.add(cb);
        frame.add(btn);
        frame.setSize(250, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
