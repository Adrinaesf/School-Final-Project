// N2019_20
// Each year's edition page: Year of 2019-2020
// 3 editions that year 

// Importing the needed modules 

import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.Font; 

public class N2019_20 extends javax.swing.JFrame implements ActionListener{
    // declaring JLabels and JButtons
    private JLabel background, ed1, ed2, ed3;
    private JButton viewArticles1, viewArticles2, viewArticles3;
    private JButton viewFullEd1, viewFullEd2, viewFullEd3;
    private JButton backButton;

    public N2019_20() {
        // creating JLabels and buttons 
        
        background = new JLabel();
        
        ed3 = new JLabel();
        ed2 = new JLabel();
        ed1 = new JLabel();
        
        viewFullEd3 = new JButton();
        viewFullEd1 = new JButton();
        viewFullEd2 = new JButton();
        
        viewArticles3 = new JButton();
        viewArticles1 = new JButton();
        viewArticles2 = new JButton();
        
        backButton = new JButton(); 

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        viewFullEd3.setText("View Full Edition");
        getContentPane().add(viewFullEd3);
        viewFullEd3.setBounds(780, 420, 160, 23);
        // viewFullEd3.addActionListener(this); 
        
        viewFullEd2.setText("View Full Edition");
        getContentPane().add(viewFullEd2);
        viewFullEd2.setBounds(460, 410, 160, 23);
                // viewFullEd3.addActionListener(this); 

        viewFullEd1.setText("View Full Edition");
        getContentPane().add(viewFullEd1);
        viewFullEd1.setBounds(110, 410, 160, 23);
                // viewFullEd3.addActionListener(this); 


        viewArticles3.setText("Review Edition");
        getContentPane().add(viewArticles3);
        viewArticles3.setBounds(780, 460, 160, 23);
        viewArticles3.addActionListener(this); 

        viewArticles2.setText("Review Edition");
        getContentPane().add(viewArticles2);
        viewArticles2.setBounds(460, 450, 160, 23);
        viewArticles2.addActionListener(this); 
        
        viewArticles1.setText("Review Edition");
        getContentPane().add(viewArticles1);
        viewArticles1.setBounds(110, 450, 160, 23);
        viewArticles1.addActionListener(this); 
        
        backButton.setText("Back"); 
        getContentPane().add(backButton); 
        backButton.setBounds(500, 530, 72, 23);
        backButton.addActionListener(this);

        ed3.setIcon(new ImageIcon(getClass().getResource("9.4 cover-resized.png"))); // NOI18N
        getContentPane().add(ed3);
        ed3.setBounds(780, 170, 172, 230);

        ed2.setIcon(new ImageIcon(getClass().getResource("9.2 cover-resized.png"))); // NOI18N
        getContentPane().add(ed2);
        ed2.setBounds(450, 160, 180, 240);

        ed1.setIcon(new ImageIcon(getClass().getResource("9.1 cover (2).png"))); // NOI18N
        getContentPane().add(ed1);
        ed1.setBounds(110, 170, 170, 220);

        background.setIcon(new ImageIcon(getClass().getResource("Each Year Edition background(1)-resized.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1070, 600);

        pack();
        this.setVisible(true);
        this.setSize(1068, 628); 
        this.setResizable(false);
    }                  
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == backButton){
            MainPage test = new MainPage(); 
            this.dispose(); 
        }
        if(e.getSource() == viewArticles1){
            ReviewPage test = new ReviewPage("9.1 cover (2).png");
            this.dispose(); 
        } else if(e.getSource() == viewArticles2){
            ReviewPage test = new ReviewPage("9.2 cover-resized.png"); 
            this.dispose(); 
        } else if(e.getSource() == viewArticles3){
            ReviewPage test = new ReviewPage("9.4 cover-resized.png"); 
            this.dispose(); 
        } 
    }
}
