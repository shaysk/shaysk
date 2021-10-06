package MyGraphics;


import java.awt.Color;
import java.awt.Graphics;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toby
 */
public class Block {
    private static int wid = 50;
    private static int len = 50;

    public static void setWidth(int width) {
        Block.wid = width; 
    }
    static void setLength (int len){
        Block.len = len;
    }
    private int x_cord;
    private int y_cord;
    public Block (int x, int y){
        this.x_cord = x;
        this.y_cord = y;
    }
    public void Draw (Graphics g){
        g.setColor (Color.RED);
        g.fillRect (this.x_cord, this.y_cord, Block.wid, Block.len);
        g.setColor(Color.BLACK);
        g.drawRect(this.x_cord, this.y_cord, Block.wid, Block.len);
    }
    
}
