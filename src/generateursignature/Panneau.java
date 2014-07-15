/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generateursignature;

/**
 *
 * @author a807087
 */
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Panneau extends JPanel {

    private int i = 0;
    private int k = 0;
    private int couleur = 0, taillex1 = 0, tailley1 = 0, taillex2 = 0, tailley2 = 0, multi = 0;
    private int type = 0;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public void paintComponent(Graphics g) {
     
            g.setColor(Color.white);
            g.drawRect(0, 0, 1500, 1500);
            if (couleur <= 9 && couleur >= 0) {
                switch (couleur) {
                    case 0:
                        g.setColor(Color.blue);
                        break;
                    case 1:
                        g.setColor(Color.CYAN);
                        break;
                    case 2:
                        g.setColor(Color.GREEN);
                        break;
                    case 3:
                        g.setColor(Color.MAGENTA);
                        break;
                    case 4:
                        g.setColor(Color.ORANGE);
                        break;
                    case 5:
                        g.setColor(Color.PINK);
                        break;
                    case 6:
                        g.setColor(Color.RED);
                        break;
                    case 7:
                        g.setColor(Color.GRAY);
                        break;
                    case 8:
                        g.setColor(Color.BLACK);
                        break;
                    case 9:
                        g.setColor(Color.YELLOW);
                        break;

                }
            }
            g.drawLine(taillex1 + k, tailley1, taillex2, tailley2);
            g.drawRect(taillex1 + k, tailley1, taillex2, tailley2);
            g.drawLine(taillex2+k/10, taillex1, tailley2, tailley1);
            g.drawLine(1000+k, 1000+k, 1000 - taillex2, 1000 - tailley2);
            g.drawOval(taillex1 * k/500, tailley1 * k/500, taillex2, tailley2);
            g.drawOval(taillex1+k , tailley1 , taillex2, tailley2);
            g.drawLine(400+k, 500, 200 - taillex2, 157 - tailley2);
            g.drawLine(400+k, 500+k, taillex2, tailley2);
            g.drawLine(400+k, 200 + k, 100 - taillex2, 200 - tailley2);
            g.drawRect(400+k, 500+k, 200 - taillex2, 157 - tailley2);
            g.drawLine(taillex1 + k, tailley1, taillex2, tailley2);
            g.drawRect(taillex1 , tailley1, taillex2, tailley2);
            g.drawLine(taillex2+k/10, taillex1, tailley2, tailley1);
            g.drawLine(1000+k, 1000+k, 1000 - taillex2, 1000 - tailley2);
            g.drawOval(taillex1 * k/500, tailley1 * k/500, taillex2, tailley2);
            g.drawOval(taillex1+k , tailley1 , taillex2, tailley2);
            g.drawLine(400+k, 500+k, 200 - taillex2, 157 - tailley2);
            g.drawLine(400+k, 500+k, taillex2, tailley2);
            g.drawLine(400+k, 200 + k, 100 - taillex2, 200 - tailley2);
            g.drawRect(400+k, 500+k, 200 - taillex2, 157 - tailley2);
            g.drawLine(taillex1 + k, tailley1, taillex2, tailley2);
            g.drawRect(taillex1 + k, tailley1, taillex2, tailley2);
            g.drawLine(taillex2+k/10, taillex1, tailley2, tailley1);
            g.drawLine(1000+k, 1000+k, 1000 - taillex2, 1000 - tailley2);
            g.drawOval(taillex1 * k/500, tailley1 * k/500, taillex2, tailley2);
            g.drawOval(taillex1+k , tailley1 , taillex2, tailley2);
            g.drawLine(400+k, 500+k, 200 - taillex2, 157 - tailley2);
            g.drawLine(400+k, 500+k, taillex2, tailley2);
            g.drawLine(400+k, 200 + k, 100 - taillex2, 200 - tailley2);
            g.drawRect(400+k, 500+k, 200 - taillex2, 157 - tailley2);
            g.drawLine(taillex1 + k, tailley1, taillex2, tailley2);
            g.drawRect(taillex1 + k, tailley1, taillex2, tailley2);
            g.drawLine(taillex2+k/10, taillex1, tailley2, tailley1);
            g.drawLine(1000+k, 1000, 1000 - taillex2, 1000 - tailley2);
            g.drawOval(taillex1 * k/500, tailley1 * k/500, taillex2, tailley2);
            g.drawOval(taillex1+k , tailley1 , taillex2, tailley2);
            g.drawLine(400+k, 500+k, 200 - taillex2, 157 - tailley2);
            g.drawLine(400+k, 500+k, taillex2, tailley2);
            g.drawLine(400+k, 200 + k, 100 - taillex2, 200 - tailley2);
            g.drawRect(400+k, 500+k, 200 - taillex2, 157 - tailley2);
            g.drawLine(taillex1 + k, tailley1, taillex2, tailley2);
            g.drawRect(taillex1 + k, tailley1, taillex2, tailley2);
            g.drawLine(taillex2+k/10, taillex1, tailley2, tailley1);
            g.drawLine(1000+k, 1000+k, 1000 - taillex2, 1000 - tailley2);
            g.drawOval(taillex1 * k/500, tailley1 * k/500, taillex2, tailley2);
            g.drawOval(taillex1+k , tailley1 , taillex2, tailley2);
            g.drawLine(400+k, 500+k, 200 - taillex2, 157 - tailley2);
            g.drawLine(400, 500+k, taillex2, tailley2);
            g.drawLine(400+k, 200 + k, 100 - taillex2, 200 - tailley2);
            g.drawRect(400+k, 500+k, 200 - taillex2, 157 - tailley2);
     
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getTaillex1() {
        return taillex1;
    }

    public void setTaillex1(int taillex1) {
        this.taillex1 = taillex1;
    }

    public int getTaillex2() {
        return taillex2;
    }

    public void setTaillex2(int taillex2) {
        this.taillex2 = taillex2;
    }

    public int getTailley1() {
        return tailley1;
    }

    public void setTailley1(int tailley1) {
        this.tailley1 = tailley1;
    }

    public int getTailley2() {
        return tailley2;
    }

    public void setTailley2(int tailley2) {
        this.tailley2 = tailley2;
    }
}
