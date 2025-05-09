// N2018_19
// Each year's edition page: Year of 2018-2019
// 4 editions that year 

// Importing the needed modules 
import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.Font; 

public class N2018_19 extends javax.swing.JFrame implements ActionListener{ 
    // declaring JLabels and JButtons
    private JLabel background, ed1, ed2, ed3, ed4;
    private JButton viewArticles1, viewArticles2, viewArticles3, viewArticles4;
    private JButton viewFullEd1, viewFullEd2, viewFullEd3, viewFullEd4; 
    private JButton backButton;
    
    public N2018_19() {
        // creating JLabels and JButtons
        background = new JLabel();
        
        // ed# == label containing the image of the cover of the edition 
        //   # == number of that edition that year 
        ed4 = new JLabel(); // edition 4
        ed3 = new JLabel(); // edition 3
        ed2 = new JLabel(); // edition 2...
        ed1 = new JLabel();
        
        // viewFullEd#
        // button opens pdf of that edition 
        
        viewFullEd4 = new JButton();
        viewFullEd3 = new JButton();
        viewFullEd2 = new JButton();
        viewFullEd1 = new JButton();

        // viewArticles#
        // button leads to page with the list of that edition's articles

        viewArticles4 = new JButton();
        viewArticles1 = new JButton();
        viewArticles2 = new JButton();
        viewArticles3 = new JButton();
        
        // back button returns to Main Menu
        backButton = new JButton(); 
        
        // basic properties of the window 
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // --------------------------------------------------------
        // Changing the appearance, size, and location of buttons 
        // --------------------------------------------------------
        
        // =====View Full Edition Buttons 
        
        viewFullEd4.setText("View Full Edition");
        getContentPane().add(viewFullEd4);
        viewFullEd4.setBounds(850, 420, 160, 23);
        viewFullEd1.addActionListener(this);        
        // -- event handlers to all viewFullEd buttons to be added once merged with code 
                
        viewFullEd3.setText("View Full Edition");
        getContentPane().add(viewFullEd3);
        viewFullEd3.setBounds(580, 420, 160, 23);
                // viewFullEd1.addActionListener(this)
                
        viewFullEd2.setText("View Full Edition");
        getContentPane().add(viewFullEd2);
        viewFullEd2.setBounds(320, 420, 160, 23);
                // viewFullEd1.addActionListener(this)
                
        viewFullEd1.setText("View Full Edition");
        getContentPane().add(viewFullEd1);
        viewFullEd1.setBounds(60, 420, 160, 23);
                // viewFullEd1.addActionListener(this)
        
        // ======View Articles Buttons 

        viewArticles4.setText("Review Edition");
        getContentPane().add(viewArticles4);
        viewArticles4.setBounds(850, 460, 160, 23);
        viewArticles4.addActionListener(this); 

        viewArticles3.setText("Review Edition");
        getContentPane().add(viewArticles3);
        viewArticles3.setBounds(580, 460, 160, 23);
        viewArticles3.addActionListener(this); 

        viewArticles2.setText("Review Edition");
        getContentPane().add(viewArticles2);
        viewArticles2.setBounds(320, 460, 160, 23);
        viewArticles2.addActionListener(this); 

        viewArticles1.setText("Review Edition");
        getContentPane().add(viewArticles1);
        viewArticles1.setBounds(60, 460, 160, 23);
        viewArticles1.addActionListener(this); 
        
        // ===========Back Button
        
        backButton.setText("Back"); 
        getContentPane().add(backButton); 
        backButton.setBounds(500, 530, 72, 23);
        backButton.addActionListener(this);
        
        // --------------------------------------------------------
        // Images (cover page of the torch editions) + backround image 
        // --------------------------------------------------------

        ed4.setIcon(new ImageIcon(getClass().getResource("8.4 cover-resized.png"))); 
        getContentPane().add(ed4);
        ed4.setBounds(840, 180, 180, 230);

        ed3.setIcon(new ImageIcon(getClass().getResource("8.3 cover-resized.png"))); 
        getContentPane().add(ed3);
        ed3.setBounds(580, 180, 172, 220);

        ed2.setIcon(new ImageIcon(getClass().getResource("8.2 cover-resized.png"))); 
        getContentPane().add(ed2);
        ed2.setBounds(320, 180, 170, 220);

        ed1.setIcon(new ImageIcon(getClass().getResource("8.1 cover-resized.png"))); 
        getContentPane().add(ed1);
        ed1.setBounds(60, 170, 172, 230);

        background.setIcon(new ImageIcon(getClass().getResource("Each Year Edition background(1)-resized.png"))); // background image 
        getContentPane().add(background);
        background.setBounds(0, 0, 1066, 600);

        pack();
        this.setVisible(true);
        this.setSize(1068, 628); 
        this.setResizable(false);
    }                 
    
    // All Event Handlers 
    public void actionPerformed(ActionEvent e){
        // Returns to homepage when click on back 
        if(e.getSource() == backButton){
            MainPage test = new MainPage(); 
            this.dispose(); 
        }
        
        // View Articles Buttons lead to template page with the list of all articles in that edition 
        if(e.getSource() == viewArticles1){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");
            this.dispose(); 
        } else if(e.getSource() == viewArticles2){
            ReviewPage test = new ReviewPage("8.2 cover-resized.png"); 
            this.dispose(); 
        } else if(e.getSource() == viewArticles3){
            ReviewPage test = new ReviewPage("8.3 cover-resized.png"); 
            this.dispose(); 
        } else if (e.getSource() == viewArticles4) {
            ReviewPage test = new ReviewPage("8.4 cover-resized.png"); 
            this.dispose(); 
        }
    }
}
