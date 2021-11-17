/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAK3;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.event.*;
public class Aplikasiswing3 implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public static void CreatedAndShowGUI() {
        JFrame frame = new JFrame("i am JFrame");frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 30, 300, 100);
        frame.getContentPane().setLayout(null);
        
        JButton butt = new JButton("Tekan Tombol");
        frame.getContentPane().add(butt);
        butt.setBounds(20, 20, 200, 20);
        
        Aplikasiswing3 app = new Aplikasiswing3() {};
        
        app.label = new JLabel("nama saya merupakan");
        app.label.setBounds(20, 40, 200, 20);
        frame.getContentPane().add(app.label);
        
        butt.addActionListener(app);
        frame.setVisible(true);
    }
      public void actionPerformed(ActionEvent e){
		label.setText("Andi ishak jelek");
        }
        
        public static void main (String[] args){
            
         SwingUtilities.invokeLater(new Runnable() {
           public void run() {
                createAndShowGUI();
           }
         });     
            
        }
        
        JLabel label;
    }
    

