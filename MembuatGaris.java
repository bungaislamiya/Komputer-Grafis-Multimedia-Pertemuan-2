/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
/**
 *
 * @author lenovo
 */
public class MembuatGaris extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    public void paint(Graphics g) {
        g.drawLine (50,50,250,60);
        g.drawLine (50,50,250,80);
        g.drawLine (50,50,250,100);
        g.drawLine (50,50,250,120);
        g.drawLine (50,50,250,140);
        //g.drawLine(x1,y1,x2,y2);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
