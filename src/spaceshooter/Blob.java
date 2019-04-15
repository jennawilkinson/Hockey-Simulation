/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Graphics;

/**
 *
 * @author jword
 */
public class Blob extends Creature {
    private int size;
    
    public Blob(int size) {
        super();
        this.size = size;
    }
    
    public Blob() {
        this(100);
    }
    
    @Override
    public void draw(Graphics g) {
        g.drawOval(x, y, size, size);
    }
}
