// Final Project 
// April, 14th, 2024

import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.*; 

public class Main
{
    public static void main(String args[]) {
        LoginInfo test3 = new LoginInfo(); 
        LoginPage test2 = new LoginPage(test3.getInfo());
        //ReviewPageForAuth test1 = new ReviewPageForAuth(); 
        
        //test2.setVisible(true);
        //test2.setSize(1068, 628); 
        //test2.setResizable(false);
        
        //MainPage test1 = new MainPage(); 
        //test1.setVisible(true);
        //test1.setSize(1068, 628); 
        //test1.setResizable(false);
        
    }
}
