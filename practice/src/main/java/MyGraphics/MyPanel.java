/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyGraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author toby
 */
public class MyPanel extends JPanel{
    private ArrayList<Block> blocks;
    public MyPanel (){
        super();
        blocks = new ArrayList<Block>();
       
    }
    public void addBlock (int x, int y){
        blocks.add (new Block (x,y));
    }
    @Override
    public void paint (Graphics g){
        for (Block b : blocks)
            b.Draw(g);
    }
    
}
