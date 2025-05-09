import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.Font; 
 
public class N2021_22 extends javax.swing.JFrame implements ActionListener{
    private JLabel background;
    private JLabel ed1, ed2, ed3, ed4, ed5;
    private JButton viewArticles1, viewArticles2, viewArticles3, viewArticles4, viewArticles5;
    private JButton viewFullEd1, viewFullEd2, viewFullEd3, viewFullEd4, viewFullEd5; 
    private JButton backButton;
    
    public N2021_22() {
        viewArticles5 = new JButton();
        viewArticles4 = new JButton();
        viewArticles3 = new JButton();
        viewArticles2 = new JButton();
        viewArticles1 = new JButton();
        
        viewFullEd5 = new JButton();
        viewFullEd4 = new JButton();
        viewFullEd3 = new JButton();
        viewFullEd2 = new JButton();
        viewFullEd1 = new JButton();
        
        backButton = new JButton(); 
        
        ed5 = new JLabel();
        ed4 = new JLabel();
        ed3 = new JLabel();
        ed2 = new JLabel();
        ed1 = new JLabel();
        
        background = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        viewArticles5.setText("Review Edition");
        getContentPane().add(viewArticles5);
        viewArticles5.setBounds(890, 470, 140, 23);
        viewArticles5.addActionListener(this); 

        viewArticles4.setText("Review Edition");
        getContentPane().add(viewArticles4);
        viewArticles4.setBounds(680, 470, 140, 23);
        viewArticles4.addActionListener(this); 

        viewArticles3.setText("Review Edition");
        getContentPane().add(viewArticles3);
        viewArticles3.setBounds(460, 470, 140, 23);
        viewArticles3.addActionListener(this); 

        viewArticles2.setText("Review Edition");
        getContentPane().add(viewArticles2);
        viewArticles2.setBounds(250, 470, 140, 23);
        viewArticles2.addActionListener(this); 

        viewArticles1.setText("Review Edition");
        getContentPane().add(viewArticles1);
        viewArticles1.setBounds(40, 470, 140, 23);
        viewArticles1.addActionListener(this); 

        viewFullEd5.setText("View Full Edition");
        getContentPane().add(viewFullEd5);
        viewFullEd5.setBounds(890, 430, 140, 23);
        // viewFullEd5.addActionListener(this); 

        viewFullEd4.setText("View Full Edition");
        getContentPane().add(viewFullEd4);
        viewFullEd4.setBounds(680, 430, 140, 23);
                // viewFullEd5.addActionListener(this); 


        viewFullEd3.setText("View Full Edition");
        getContentPane().add(viewFullEd3);
        viewFullEd3.setBounds(460, 430, 140, 23);
                // viewFullEd5.addActionListener(this); 


        viewFullEd2.setText("View Full Edition");
        getContentPane().add(viewFullEd2);
        viewFullEd2.setBounds(250, 430, 140, 23);
                // viewFullEd5.addActionListener(this); 


        viewFullEd1.setText("View Full Edition");
        getContentPane().add(viewFullEd1);
        viewFullEd1.setBounds(40, 430, 130, 23);
                // viewFullEd5.addActionListener(this); 
                
        backButton.setText("Back"); 
        getContentPane().add(backButton); 
        backButton.setBounds(500, 530, 72, 23);
        backButton.addActionListener(this); 


        ed5.setIcon(new ImageIcon(getClass().getResource("11.6-2021-22-resized.png"))); // NOI18N
        getContentPane().add(ed5);
        ed5.setBounds(870, 190, 180, 220);
        
        ed4.setIcon(new ImageIcon(getClass().getResource("11.5-2021-22-resized.png"))); // NOI18N
        getContentPane().add(ed4);
        ed4.setBounds(660, 190, 170, 220);

        ed3.setIcon(new ImageIcon(getClass().getResource("11.4-2021-22-resized.png"))); // NOI18N
        getContentPane().add(ed3);
        ed3.setBounds(450, 190, 170, 217);

        ed2.setIcon(new ImageIcon(getClass().getResource("11.2-2021-22-resized.png"))); // NOI18N
        getContentPane().add(ed2);
        ed2.setBounds(230, 190, 172, 222);

        ed1.setIcon(new ImageIcon(getClass().getResource("11.1-2021-22-resized.png"))); // NOI18N
        getContentPane().add(ed1);
        ed1.setBounds(20, 190, 170, 220);

        

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
            ReviewPage test = new ReviewPage("11.1-2021-22-resized.png");
            this.dispose(); 
        } else if(e.getSource() == viewArticles2){
            ReviewPage test = new ReviewPage("11.2-2021-22-resized.png"); 
            this.dispose(); 
        } else if(e.getSource() == viewArticles3){
            ReviewPage test = new ReviewPage("11.4-2021-22-resized.png"); 
            this.dispose(); 
        } else if (e.getSource() == viewArticles4){
            ReviewPage test = new ReviewPage("11.5-2021-22-resized.png"); 
            this.dispose(); 
        } else if (e.getSource() == viewArticles5) {
            ReviewPage test = new ReviewPage("11.6-2021-22-resized.png"); 
            this.dispose(); 
        }
    }                                               
}
