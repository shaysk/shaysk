package MyGraphics;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toby
 */
public class MyFrame extends JFrame  {
    private MyPanel panel;
    
    public MyFrame (){
        super();
        this.setTitle("My Block Program");
        this.setSize (500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.LIGHT_GRAY);
        this.panel = new MyPanel();
        this.panel.setSize(500,500);
        this.add (panel);
    }
    public void setWidth (int width){
        Block.setWidth (width);
    }
    public void setLength (int len){
        Block.setLength (len);
    }
    public int getPanelHight () { return this.panel.getHeight(); }
    public int getPanelWidth () { return this.panel.getWidth(); }
    public void addBlock (int x, int y){
        panel.addBlock (x,y);
    }
    public void showFrame (){
        this.setVisible(true);
    }
  
    
}
