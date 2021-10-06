
import MyGraphics.MyFrame;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toby
 */
public class Program {

    public static void main (String [] args){
        Scanner Sc = new Scanner(System.in);
        int Block_Sides_Length = Sc.nextInt();

        MyFrame f = new MyFrame();

        f.setWidth(Block_Sides_Length);
        f.setLength(Block_Sides_Length);

        int RunningFrameX = f.getPanelWidth();
        int RunningFrameY = f.getPanelHight() - Block_Sides_Length;
        int Count_Blocks = f.getPanelWidth()/Block_Sides_Length;

        while (RunningFrameX > 0 && RunningFrameY > 0 && Count_Blocks != 0)
        {
            int i;
            for (i = 0; i < Count_Blocks; i++)
            {
                f.addBlock(i*Block_Sides_Length +
                        (f.getWidth()%Block_Sides_Length)/2 + (f.getWidth() - RunningFrameX)/2,
                        f.getPanelHight() - RunningFrameY - Block_Sides_Length);
            }
            RunningFrameX -= Block_Sides_Length;
            RunningFrameY -= Block_Sides_Length;
            Count_Blocks--;
        }


        f.showFrame();
    }
    
}
