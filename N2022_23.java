import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.Font; 

public class N2022_23 extends javax.swing.JFrame implements ActionListener{
    private JButton viewArticles1,viewArticles2, viewArticles3, viewArticles4;
    private JButton viewFullEd1, viewFullEd2, viewFullEd3,viewFullEd4; 
    private JButton backButton;
    private JLabel backImage, ed1, ed2, ed3, ed4;
    
    public N2022_23() {
        viewFullEd1 = new JButton();
        viewFullEd2 = new JButton();
        viewFullEd3 = new JButton();
        viewFullEd4 = new JButton(); 
        
        viewArticles1 = new JButton();
        viewArticles2 = new JButton();
        viewArticles3 = new JButton();
        viewArticles4 = new JButton(); 
        
        ed4 = new JLabel(); 
        ed3 = new JLabel(); 
        ed2 = new JLabel();
        ed1 = new JLabel();
        
        backButton = new JButton(); 
        backImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        viewArticles1.setText("Review Edition");
        getContentPane().add(viewArticles1);
        viewArticles1.setBounds(90, 480, 140, 23);
        viewArticles1.addActionListener(this); 
        
        viewArticles2.setText("Review Edition");
        getContentPane().add(viewArticles2);
        viewArticles2.setBounds(340, 480, 140, 23);
        viewArticles2.addActionListener(this); 

        viewArticles3.setText("Review Edition");
        getContentPane().add(viewArticles3);
        viewArticles3.setBounds(590, 480, 140, 23);
        viewArticles3.addActionListener(this); 
        
        viewArticles4.setText("Review Edition"); 
        getContentPane().add(viewArticles4); 
        viewArticles4.setBounds(830, 480, 140, 23); 
        viewArticles4.addActionListener(this); 

        viewFullEd1.setText("View Full Edition");
        getContentPane().add(viewFullEd1);
        viewFullEd1.setBounds(90, 440, 140, 23);
                // view FullEd3.addActionListener(this); 


        viewFullEd2.setText("View Full Edition");
        getContentPane().add(viewFullEd2);
        viewFullEd2.setBounds(340, 440, 140, 23);
                // view FullEd3.addActionListener(this); 


        viewFullEd3.setText("View Full Edition");
        getContentPane().add(viewFullEd3);
        viewFullEd3.setBounds(590, 440, 140, 23);
        // view FullEd3.addActionListener(this); 
        
        viewFullEd4.setText("View Full Edition"); 
        getContentPane().add(viewFullEd4); 
        viewFullEd4.setBounds(830, 440, 140, 23); 
        viewFullEd4.addActionListener(this); 
        
        backButton.setText("Back"); 
        getContentPane().add(backButton); 
        backButton.setBounds(500, 530, 72, 23);
        backButton.addActionListener(this); 

        
        ed4.setIcon(new ImageIcon(getClass().getResource("12.4 cover-resized.png"))); 
        getContentPane().add(ed4); 
        ed4.setBounds(830, 190, 170, 230); 
        
        
        ed3.setIcon(new ImageIcon(getClass().getResource("12.3 cover-resized.png"))); 
        getContentPane().add(ed3); 
        ed3.setBounds(580, 190, 170, 240); 

        ed2.setIcon(new ImageIcon(getClass().getResource("Torch-Cover-Art-Vol.-12-Ed.-2(1)-resized.jpg"))); // NOI18N
        getContentPane().add(ed2);
        ed2.setBounds(330, 190, 170, 230);

        ed1.setIcon(new ImageIcon(getClass().getResource("Torch Cover Vol. 12 Ed. 1(1)-resized.jpg"))); // NOI18N
        getContentPane().add(ed1);
        ed1.setBounds(80, 190, 170, 230);

        backImage.setIcon(new ImageIcon(getClass().getResource("Each Year Edition background(1)-resized.png"))); // NOI18N
        getContentPane().add(backImage);
        backImage.setBounds(0, 0, 1070, 600);

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
            ReviewPage test = new ReviewPage("Torch Cover Vol. 12 Ed. 1(1)-resized.jpg");
            this.dispose(); 
        } else if(e.getSource() == viewArticles2){
            ReviewPage test = new ReviewPage("Torch-Cover-Art-Vol.-12-Ed.-2(1)-resized.jpg"); 
            this.dispose(); 
        } else if(e.getSource() == viewArticles3){
            ReviewPage test = new ReviewPage("12.3 cover-resized.png"); 
            this.dispose(); 
        } else if (e.getSource() == viewArticles4)
        {
            ReviewPage test = new ReviewPage("12.4 cover-resized.png"); 
            this.dispose(); 
        }
    }
}
