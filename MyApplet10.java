//Menu
package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyApplet10 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Window");
        JMenuBar mb = new JMenuBar(); // Bar
        JMenu m = new JMenu("Main"); // Açılacak yerin adı
        JMenu m1 = new JMenu("File");// Açılacak yerin adı
        JMenuItem i1 = new JMenuItem("Java");// İçindekiler
        JMenuItem a1 = new JMenuItem("C#");// İçindekiler
        mb.add(m);// Bara Menü eklemek
        m.add(i1);// Menümüzün içini donatmak

        mb.add(m1);// Bara Menü eklemek
        m1.add(a1);// Menümüzün içini donatmak

        // !AltMenü
        JMenu malt = new JMenu("Gizli");
        JMenuItem b1 = new JMenuItem("Command");
        m.add(malt);// Menü içine Menü ekledik İtem değil
        malt.add(b1);

        // Dinleyici
        i1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Java Seçtin");
            }

        });
        // Dinleyici
        a1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("C# Seçtin");
            }

        });
        // Dinleyici
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Command Seçtin");
            }

        });

        f.setJMenuBar(mb);// ! Barı yerleştirme
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
