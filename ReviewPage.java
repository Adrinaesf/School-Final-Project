import javax.swing.*;
import java.awt.*;
import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class ReviewPage extends JFrame {
    // Variables declaration
    /** Notes:
     * pReview == personal Review
     * oReview == overall Review
     * HTS == How To Submit
     * VAB == View Article Button
     * ToA == Title of Article
     * A == Author
     * C == Category
     * E == Edition
     * Y == Year
     * IoA == Image of Article
     * UN == User's Name
     * UReview == User's Review
     */
    private JButton pReview, pReview2, pReview3, pReview4, pReview5, backButton;
    private JLabel ToA, A, C, E, Y, IoA, UN, Background, HTS;
    private JLabel oReview, oReview2, oReview3, oReview4, oReview5;
    private JTextField jTextField1;
    private int avgReview, UReview;
    private String title, author, category, edition, year, imageLocation, name, LeftReview, IoAImage;
    
    public ReviewPage(String i) {
        pReview = new JButton();
        pReview2 = new JButton();
        pReview3 = new JButton();
        pReview4 = new JButton();
        pReview5 = new JButton();
        
        backButton = new JButton();
        
        ToA = new JLabel();
        A = new JLabel();
        C = new JLabel();
        E = new JLabel();
        Y = new JLabel();
        HTS = new JLabel();
        IoA = new JLabel();
        UN = new JLabel();
        Background = new JLabel();
        jTextField1 = new JTextField();
        oReview = new JLabel();
        oReview2 = new JLabel();
        oReview3 = new JLabel();
        oReview4 = new JLabel();
        oReview5 = new JLabel();
        UReview = 0;
        title = "title";
        author = "author";
        category = "category";
        edition = "edition"; 
        year = "year";
        imageLocation = "image";
        name = "name";
        IoAImage = i;
        
        backButton.setText("Back"); 
        getContentPane().add(backButton); 
        backButton.setBounds(500, 530, 72, 23);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backButtonActionPerformed(e);
            }
        });
        
        // a random set value for the reviews
        avgReview = 3;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1075, 635));
        getContentPane().setLayout(null);
        
        pReview.setIcon(new ImageIcon("White Star.jpg"));
        pReview.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt1) {
                pReviewActionPerformed(evt1);
            }
        });
        getContentPane().add(pReview);
        pReview.setBounds(560, 370, 80, 76);

        pReview2.setIcon(new ImageIcon("White Star.jpg"));
        pReview2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt2) {
                pReview5ActionPerformed(evt2);
            }
        });
        getContentPane().add(pReview2);
        pReview2.setBounds(920, 370, 80, 76);
        
        pReview3.setIcon(new ImageIcon("White Star.jpg"));
        pReview3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt3) {
                pReview4ActionPerformed(evt3);
            }
        });
        getContentPane().add(pReview3);
        pReview3.setBounds(830, 370, 80, 76);
        
        pReview4.setIcon(new ImageIcon("White Star.jpg"));
        pReview4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt4) {
                pReview3ActionPerformed(evt4);
            }
        });
        getContentPane().add(pReview4);
        pReview4.setBounds(740, 370, 80, 76);
        
        pReview5.setIcon(new ImageIcon("White Star.jpg"));
        pReview5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt5) {
                pReview2ActionPerformed(evt5);
            }
        });
        getContentPane().add(pReview5);
        pReview5.setBounds(650, 370, 80, 76);
        
        ToA.setText(title);
        getContentPane().add(ToA);
        ToA.setBounds(755, 140, 80, 16);

        A.setText(author);
        getContentPane().add(A);
        A.setBounds(750, 160, 37, 16);

        C.setText(category);
        getContentPane().add(C);
        C.setBounds(743, 178, 60, 20);

        E.setText(edition);
        getContentPane().add(E);
        E.setBounds(750, 200, 43, 16);
        
        Y.setText(year);
        getContentPane().add(Y);
        Y.setBounds(755, 220, 30, 16);

        HTS.setText("Press Enter To Submit");
        getContentPane().add(HTS);
        HTS.setBounds(732, 535, 120, 16);

        IoA.setIcon(new ImageIcon(IoAImage));
        getContentPane().add(IoA);
        IoA.setBounds(80, 90, 172, 246);
        
        
        UN.setText(name);
        getContentPane().add(UN);
        UN.setBounds(765, 460, 90, 16);
        
        
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt8) {
                jTextField1ActionPerformed(evt8);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(610, 490, 342, 40);
        
        oReview.setIcon(new ImageIcon("White Star Small.jpg"));
        getContentPane().add(oReview);
        oReview.setBounds(10, 370, 57, 60);

        oReview2.setIcon(new ImageIcon("White Star Small.jpg"));
        getContentPane().add(oReview2);
        oReview2.setBounds(70, 370, 57, 60);

        oReview3.setIcon(new ImageIcon("White Star Small.jpg"));
        getContentPane().add(oReview3);
        oReview3.setBounds(130, 370, 57, 60);

        oReview4.setIcon(new ImageIcon("White Star Small.jpg"));
        getContentPane().add(oReview4);
        oReview4.setBounds(190, 370, 57, 60);

        oReview5.setIcon(new ImageIcon("White Star Small.jpg"));
        getContentPane().add(oReview5);
        oReview5.setBounds(250, 370, 57, 60);
        
        switch (avgReview) {
            case 1:
                oReview.setIcon(new ImageIcon("Yellow Star Small.jpg")); break;
                
            case 2:
                oReview.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview2.setIcon(new ImageIcon("Yellow Star Small.jpg")); break;
                
            case 3:
                oReview.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview2.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview3.setIcon(new ImageIcon("Yellow Star Small.jpg")); break;
                
            case 4:
                oReview.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview2.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview3.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview4.setIcon(new ImageIcon("Yellow Star Small.jpg")); break;
                
            case 5:
                oReview.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview2.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview3.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview4.setIcon(new ImageIcon("Yellow Star Small.jpg"));
                oReview5.setIcon(new ImageIcon("Yellow Star Small.jpg")); break;
                
            default:
        }
        
        Background.setIcon(new ImageIcon("Green Watercolor Floral Art Simple Background Desktop Wallpaper (1).png"));
        Background.setNextFocusableComponent(pReview);
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1066, 600);
        
        pack();
        this.setVisible(true);
        this.setSize(1066, 600); 
        this.setResizable(false);
    }
    
    private void pReviewActionPerformed(ActionEvent evt1) {                                         
        pReview.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview5.setIcon(new ImageIcon("White Star.jpg"));
        pReview4.setIcon(new ImageIcon("White Star.jpg"));
        pReview3.setIcon(new ImageIcon("White Star.jpg"));
        pReview2.setIcon(new ImageIcon("White Star.jpg"));
        UReview = 1;
    }
    private void pReview2ActionPerformed(ActionEvent evt2) {                                         
        pReview.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview5.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview4.setIcon(new ImageIcon("White Star.jpg"));
        pReview3.setIcon(new ImageIcon("White Star.jpg"));
        pReview2.setIcon(new ImageIcon("White Star.jpg"));
        UReview = 2;
    }
    private void pReview3ActionPerformed(ActionEvent evt3) {                                         
        pReview.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview5.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview4.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview3.setIcon(new ImageIcon("White Star.jpg"));
        pReview2.setIcon(new ImageIcon("White Star.jpg"));
        UReview = 3;
    }
    private void pReview4ActionPerformed(ActionEvent evt4) {                                         
        pReview.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview5.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview4.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview3.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview2.setIcon(new ImageIcon("White Star.jpg"));
        UReview = 4;
    }
    private void pReview5ActionPerformed(ActionEvent evt5) {                                         
        pReview.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview5.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview4.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview3.setIcon(new ImageIcon("Yellow Star.jpg"));
        pReview2.setIcon(new ImageIcon("Yellow Star.jpg"));
        UReview = 5;
    }
    
    
    private void VABActionPerformed(ActionEvent evt7) {
        
    }
    private void jTextField1ActionPerformed(ActionEvent evt8) {                                            
        LeftReview = jTextField1.getText();
        jTextField1.setText("");
    }
    
    private void backButtonActionPerformed(ActionEvent e) {
        MainPage test = new MainPage();
        this.dispose(); 
    }  
}
