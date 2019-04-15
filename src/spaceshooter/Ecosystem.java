/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author jword
 */
public class Ecosystem extends JPanel {

    private Timer timer;
    private Creature blob;
        
    public Ecosystem() {
        super();
        setSize(1200, 960);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/24);
        blob = new Blob();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        blob.draw(g);
    }
    
    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            blob.update();
            repaint();
        }
    }

    
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            
            
        if (e.getKeyCode() == KeyEvent.VK_UP)
            
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            
        }
            
    }   
    
    
    
    
    
}