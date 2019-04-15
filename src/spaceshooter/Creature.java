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
public abstract class Creature {
    
    //Fields
    protected int x;
    protected int y;
    protected int vx;
    protected int vy;
    

    //Constructor
    public Creature(int x, int y) {
        this.x = x;
        this.y = y;
        this.vx = 3;
        this.vy = 3;
    }

    public Creature() {
        this(100,100);
    }
    
    public abstract void draw(Graphics g);
    
    public void update() {
        move();
    }
    
    public void move() {
        x += vx;
        y += vy;
    }
}
