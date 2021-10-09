
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
        int Count_BlocksX = f.getPanelWidth() / Block_Sides_Length;
        int Count_BlocksY = (f.getPanelHight() - 15) / Block_Sides_Length; // מורידים 15 שכן כ15 פיקסלים מהפאנל מוקדשים לכותרת

        int Count_BlocksY_Left = 0;

        while (RunningFrameX > 0 && Count_BlocksY_Left < Count_BlocksY && Count_BlocksX > 0)
        {
            int i = 0;
            for (i = 0; i < Count_BlocksX; i++)
            {
                f.addBlock(i * Block_Sides_Length +
                        (f.getWidth() % Block_Sides_Length)/2 + (f.getWidth() - RunningFrameX)/2,
                        Count_BlocksY_Left * Block_Sides_Length);
            }
            RunningFrameX -= Block_Sides_Length;
            Count_BlocksY_Left++;
            Count_BlocksX--;
        }
        f.showFrame();
    }
    
}
