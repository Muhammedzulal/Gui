//MessageBox
package Gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyApplet8 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        // JOptionPane.showMessageDialog(f, "Merhaba");
        JOptionPane.showMessageDialog(f, "Selamun Aleyküm", "MessageBox", 3);
        String str = JOptionPane.showInputDialog(f, "Adınız:");
        JOptionPane.showInputDialog(f, "Selam", "box", 0);
        System.out.println(str);
    }
}
