/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAK4;

import javax.swing.*;
import java.awt.event.*;

public class Aplikasiswing4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("i am JFrame");frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 30, 300, 100);
        frame.getContentPane().setLayout(null);
        
        JButton butt = new JButton("Tekan Tombol");
        frame.getContentPane().add(butt);
        butt.setBounds(20, 20, 200, 20);
        
        Aplikasiswing4 app = new Aplikasiswing4() {};
        
        app.label = new JLabel("nama saya merupakan");
        app.label.setBounds(20, 40, 200, 20);
        frame.getContentPane().add(app.label);
        
        butt.addActionListener(app);
        frame.setVisible(true);
    }
        public void actionPerformed(ActionEvent e)
     {
    clickCount++;
    label.setText("Clicks ="clickCount);
    }
    public static void main(String[]args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run (){
                createAndShowGUI();
                
            }
        });
    }
    int clickCount=0;
    JLabel label;
    
}
