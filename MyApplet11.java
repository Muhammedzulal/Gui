//Pop-Up Menu
package Gui;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class MyApplet11 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Pop-up");
        JPopupMenu pm = new JPopupMenu();// Menümüz
        // İtemler
        JMenuItem cut = new JMenuItem("Kes");
        JMenuItem copy = new JMenuItem("Kopyala");
        JMenuItem paste = new JMenuItem("Yapışır");
        // İtemleri ekleme
        pm.add(cut);
        pm.add(copy);
        pm.add(paste);

        // Mouse Dinleyici
        f.addMouseListener(new MouseInputAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3)
                    pm.show(f, e.getX(), e.getY());
            }
        });

        // Tuşlara aktiflik
        cut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kesildi");
            }

        });
        copy.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kopyalandı");
            }

        });
        paste.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Yapıştırıldı");
            }

        });

        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
