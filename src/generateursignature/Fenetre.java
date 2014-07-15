/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generateursignature;

import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.Graphics2D;

/**
 *
 * @author a807087
 */
public class Fenetre extends JFrame {
    Panneau pan = new Panneau();
    int multi = 0;
    
    public Fenetre(){
        
        this.setTitle("Générateur de bannières aléatoires");
        this.setSize(350, 100);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pan);
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
        go();
    }
    
    public void go() {
        for(;;)
        {   
            pan.setType((int) (Math.random() * 10));
            pan.setCouleur((int) (Math.random() * 10));
            multi = (int) (Math.random() * 10);
            pan.setK((int)(Math.random() * 1000));
            pan.setTaillex1((int) (Math.random() * multi * 100));
            pan.setTaillex2((int) (Math.random() * multi * 1000));
            pan.setTailley1((int) (Math.random() * multi * 10));
            pan.setTailley2((int) (Math.random() * multi * 1000));
            pan.repaint();
            
        }
    }
        
}
