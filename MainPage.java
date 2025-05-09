import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.Font; 

public class MainPage extends JFrame implements ActionListener{
    private JButton ed13Button, ed12Button, ed11Button, backButton; 
    private JButton ed10Button, ed9Button, ed8Button, searchButton;
    private JLabel SearchTxt; 
    private JLabel backGImage, ntcsLabel;
    private JTextField searchBar; 
    
    public MainPage() {
        backGImage = new JLabel();
        ntcsLabel = new JLabel();
        searchBar = new JTextField();
        ed13Button = new JButton();
        ed12Button = new JButton();
        ed11Button = new JButton();
        ed10Button = new JButton();
        ed9Button = new JButton();
        ed8Button = new JButton();
        searchButton = new JButton();
        SearchTxt = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ntcsLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        ntcsLabel.setText("Torch Carrying System ");
        getContentPane().add(ntcsLabel);
        ntcsLabel.setBounds(420, 90, 280, 90);

        getContentPane().add(searchBar);
        searchBar.setBounds(430, 180, 240, 23);

        ed13Button.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        ed13Button.setText("2023-2024");
        getContentPane().add(ed13Button);
        ed13Button.setBounds(110, 210, 170, 35);
        ed13Button.addActionListener(this); 
        
        ed12Button.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        ed12Button.setText("2022-2023");
        getContentPane().add(ed12Button);
        ed12Button.setBounds(110, 250, 170, 35);
        ed12Button.addActionListener(this); 
        
        ed11Button.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        ed11Button.setText("2021-2022");
        getContentPane().add(ed11Button);
        ed11Button.setBounds(110, 290, 170, 35);
        ed11Button.addActionListener(this); 
        
        ed10Button.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        ed10Button.setText("2020-2021");
        getContentPane().add(ed10Button);
        ed10Button.setBounds(790, 200, 170, 35);
        ed10Button.addActionListener(this); 
        
        ed9Button.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        ed9Button.setText("2019-2020");
        getContentPane().add(ed9Button);
        ed9Button.setBounds(790, 240, 170, 35);
        ed9Button.addActionListener(this); 

        ed8Button.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        ed8Button.setText("2018-2019");
        getContentPane().add(ed8Button);
        ed8Button.setBounds(790, 280, 170, 35);
        ed8Button.addActionListener(this); 
        
        searchButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        searchButton.setText("Search");
        getContentPane().add(searchButton);
        searchButton.setBounds(680, 180, 76, 24);
        searchButton.addActionListener(this); 


        SearchTxt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        SearchTxt.setHorizontalAlignment(JTextField.CENTER);
        SearchTxt.setText("Search Bar :");
        SearchTxt.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); 
        getContentPane().add(SearchTxt);
        SearchTxt.setBounds(298, 180, 100, 24);

        backGImage.setIcon(new ImageIcon(getClass().getResource("/IntroImage-2.jpeg"))); // NOI18N
        getContentPane().add(backGImage);
        backGImage.setBounds(0, 0, 1070, 600);

        pack();
        this.setVisible(true);
        this.setSize(1068, 628); 
        this.setResizable(false);
    }// </editor-fold>    // </editor-fold>  
    // AP stands for ActionPerformed
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == searchButton)
        {
            SearchResults test = new SearchResults(); 
            this.dispose(); 
        }

        // TODO add your handling code here:
        if(e.getSource() == ed13Button){
            N2023_24v2 test = new N2023_24v2();
            this.dispose(); 
        } else if(e.getSource() == ed12Button){
            N2022_23 test = new N2022_23(); 
            this.dispose(); 
        } else if(e.getSource() == ed11Button){
            N2021_22 test = new N2021_22(); 
            this.dispose(); 
        } else if(e.getSource() == ed10Button){
            N2020_21 test = new N2020_21(); 
            this.dispose(); 
        } else if(e.getSource() == ed9Button){
            N2019_20 test = new N2019_20(); 
            this.dispose(); 
        } else if(e.getSource() == ed8Button){
            N2018_19 test = new N2018_19(); 
            this.dispose(); 
        } 
    }                                      

       
    // Different methods and ideas that did not worked
    //______________________________________________________
    // Declaring a button so that we can add it to the switch statment 
        /*JButton Button = new JButton(); 
        switch(Button){
            case ed13Button: 
                N2023_24v2 test1 = new N2023_24v2();
                this.dispose(); 
                break; 
            
        }*/
}
