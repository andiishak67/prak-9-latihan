/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiswing2;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
public class Aplikasiswing2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("title");
            JPanel p = new JPanel();
            JButton b = new JButton("Tekan Tombol");
            
            f.setSize (400, 400);
            
            p.add(b);
            f.setContentPane(p);
            
            f.show();
    }
    
}
