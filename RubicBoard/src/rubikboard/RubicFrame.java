/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rubikboard;

/**
 *
 * @author argjira
 */

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class RubicFrame extends JFrame{
    /**
     * when this method is called a confirm dialog window will pop up to ask the user if it sure that he/she wants to quit the game
     * if yes it exits
     */
    protected void exit()
    {
        int clickedValue = JOptionPane.showConfirmDialog(this,"Are you sure you want to quit","Quit confirmation",JOptionPane.YES_NO_OPTION);
        if (clickedValue == JOptionPane.YES_OPTION) System.exit(0);
    }
    
    private WindowAdapter windowadap = new WindowAdapter(){
        /**
         * we call the exit method when we want to close the window
         */
        @Override
        public void windowClosing(WindowEvent e){
            exit();            
        }
    };
    
    public RubicFrame(){
        UIManager.put("OptionPane.yesButtonText", "Yes");
        UIManager.put("OptionPane.noButtonText", "No"); 
        
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(windowadap);
        setTitle("Rubik board");
        setSize(300,300);
        setResizable(false);
        
        setVisible(true);  
    }
    
}
