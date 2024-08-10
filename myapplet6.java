package Gui;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;

public class myapplet6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Example");

        JLabel l1 = new JLabel("No choice");
        l1.setBounds(50, 25, 150, 30);

        JCheckBox box1 = new JCheckBox("Java");
        box1.setBounds(50, 50, 100, 30);

        JCheckBox box2 = new JCheckBox("Python");
        box2.setBounds(50, 75, 100, 30);

        JButton btn = new JButton("Check");
        btn.setBounds(50, 110, 100, 30);

        // Konsola yazdırma
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (box1.isSelected()) {// Kutu 1 seçili mi kontrol
                    System.out.println("Your choice: " + box1.getText());
                }
                if (box2.isSelected()) {// Kutu 2 seçili mi kontrol
                    System.out.println("Your choice: " + box2.getText());
                } else if (!box1.isSelected() && !box2.isSelected()) {
                    System.out.println("No choice");
                }
            }

        });
        // Bastığımız gibi tepki vermesi için
        box1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {// Değişiklik oldu mu olmadı mı
                    box2.setSelected(false);// Diğer kutuyu boşalt
                    l1.setText("Your choice: Java");
                } else {// Seçim geri kaldırılırsa
                    l1.setText("No choice");
                }
            }
        });
        box2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {// Değişiklik oldu mu olmadı mı
                    box1.setSelected(false);// Diğer kutuyu boşalt
                    l1.setText("Your choice: Python");
                } else {// Seçim geri kaldırılırsa
                    l1.setText("No choice");
                }
            }
        });
        frame.add(l1);
        frame.add(btn);
        frame.add(box2);
        frame.add(box1);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
