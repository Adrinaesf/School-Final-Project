import java.util.*; 
import javax.swing.*;
import javax.swing.JLabel;

public class ReviewPageForAuth extends javax.swing.JFrame{
    private JLabel background; 
    private JButton backButton; 
    
    public ReviewPageForAuth(){
        background = new JLabel(); 
        backButton = new JButton(); 
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        background.setIcon(new ImageIcon(getClass().getResource("Brown and Cream Aesthetic Linktree Background (2) (1).png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1070, 690);
        LoginInfo info = new LoginInfo(); 
        boolean teacherAllow = info.isTeacher(); 
        
        if (teacherAllow == true){
            pack();
            this.setVisible(true);
            this.setSize(1060, 690); 
            this.setResizable(false);
        }
    }
}