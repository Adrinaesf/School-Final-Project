import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.Font; 

public class SearchResults extends javax.swing.JFrame implements ActionListener {

    private JLabel background;

    private JButton advancedSearchButton; 
    
    private JButton download1, download2, download3, download4, download5, download6, download7, download8, download9, download10; 
    
    private JButton reviewButton1, reviewButton2, reviewButton3, reviewButton4, reviewButton5, reviewButton6, reviewButton7, 
    reviewButton8, reviewButton9, reviewButton10; 
    
    private JButton backButton; 
    
    private JScrollPane jScrollPane1;
    
    private JTextArea resultsList;
    private JTextField youSearchedText;

    private JLabel searchResults, youSearched;
    
    public SearchResults() {
        searchResults = new JLabel();
        background = new JLabel();
        
        reviewButton1 = new JButton();
        reviewButton2 = new JButton();
        reviewButton3 = new JButton();
        reviewButton4 = new JButton();
        reviewButton5 = new JButton();
        reviewButton6 = new JButton();
        reviewButton7 = new JButton();
        reviewButton8 = new JButton();
        reviewButton9 = new JButton();
        reviewButton10 = new JButton();
        
        download1 = new JButton();
        download2 = new JButton();
        download3 = new JButton();
        download4 = new JButton();
        download5 = new JButton();
        download6 = new JButton();
        download7 = new JButton();
        download8 = new JButton();
        download9 = new JButton();
        download10 = new JButton();
        
        backButton = new JButton(); 
        
        jScrollPane1 = new JScrollPane();
        resultsList = new JTextArea();
        
        youSearchedText = new JTextField();
        youSearched = new JLabel();
        
        advancedSearchButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1066, 600));
        getContentPane().setLayout(null);

        reviewButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton1.setText("Review");
        getContentPane().add(reviewButton1);
        reviewButton1.setBounds(970, 500, 72, 20);
        reviewButton1.addActionListener(this); 

        reviewButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton2.setText("Review");
        getContentPane().add(reviewButton2);
        reviewButton2.setBounds(970, 60, 72, 20);
        reviewButton2.addActionListener(this); 

        reviewButton3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton3.setText("Review");
        getContentPane().add(reviewButton3);
        reviewButton3.setBounds(970, 110, 72, 20);
        reviewButton3.addActionListener(this); 

        reviewButton4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton4.setText("Review");
        getContentPane().add(reviewButton4);
        reviewButton4.setBounds(970, 150, 72, 20);
        reviewButton4.addActionListener(this); 

        reviewButton5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton5.setText("Review");
        getContentPane().add(reviewButton5);
        reviewButton5.setBounds(970, 200, 72, 20);
        reviewButton5.addActionListener(this); 

        reviewButton6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton6.setText("Review");
        getContentPane().add(reviewButton6);
        reviewButton6.setBounds(970, 250, 72, 20);
        reviewButton6.addActionListener(this); 

        reviewButton7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton7.setText("Review");
        getContentPane().add(reviewButton7);
        reviewButton7.setBounds(970, 300, 72, 20);
        reviewButton7.addActionListener(this); 

        reviewButton8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton8.setText("Review");
        getContentPane().add(reviewButton8);
        reviewButton8.setBounds(970, 350, 72, 20);
        reviewButton8.addActionListener(this); 

        reviewButton9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton9.setText("Review");
        getContentPane().add(reviewButton9);
        reviewButton9.setBounds(970, 400, 72, 20);
        reviewButton9.addActionListener(this); 

        reviewButton10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reviewButton10.setText("Review");
        getContentPane().add(reviewButton10);
        reviewButton10.setBounds(970, 450, 72, 20);
        reviewButton10.addActionListener(this); 

        download1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download1.setText("Download");
        getContentPane().add(download1);
        download1.setBounds(880, 60, 80, 21);
        download1.addActionListener(this); 

        download2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download2.setText("Download");
        getContentPane().add(download2);
        download2.setBounds(880, 110, 80, 21);
        download2.addActionListener(this); 

        download3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download3.setText("Download");
        getContentPane().add(download3);
        download3.setBounds(880, 150, 80, 21);
        download3.addActionListener(this); 

        download4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download4.setText("Download");
        getContentPane().add(download4);
        download4.setBounds(880, 200, 80, 21);
        download4.addActionListener(this); 

        download5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download5.setText("Download");
        getContentPane().add(download5);
        download5.setBounds(880, 250, 80, 21);
        download5.addActionListener(this); 

        download6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download6.setText("Download");
        getContentPane().add(download6);
        download6.setBounds(880, 300, 80, 21);
        download6.addActionListener(this); 

        download7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download7.setText("Download");
        getContentPane().add(download7);
        download7.setBounds(880, 350, 80, 21);
        download7.addActionListener(this); 

        download8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download8.setText("Download");
        getContentPane().add(download8);
        download8.setBounds(880, 400, 80, 21);
        download8.addActionListener(this); 

        download9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download9.setText("Download");
        getContentPane().add(download9);
        download9.setBounds(880, 450, 80, 21);
        download9.addActionListener(this); 

        download10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        download10.setText("Download");
        getContentPane().add(download10);
        download10.setBounds(880, 500, 80, 21);
        download10.addActionListener(this); 

        resultsList.setEditable(false);
        resultsList.setColumns(20);
        resultsList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultsList.setRows(5);
        resultsList.setText("1. {article} | {edition} {year} \n\n2. {article} | {edition} {year} \n\n3. {article} | {edition} {year} \n\n4. {article} | {edition} {year} \n\n5. {article} | {edition} {year} \n\n6. {article} | {edition} {year} \n\n7. {article} | {edition} {year} \n\n8. {article} | {edition} {year} \n\n9. {article} | {edition} {year} \n\n10. {article} | {edition} {year}");
        jScrollPane1.setViewportView(resultsList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 50, 490, 500);

        backButton.setText("Back"); 
        getContentPane().add(backButton); 
        backButton.setBounds(150,360, 75, 23); 
        backButton.addActionListener(this); 
        
        // searchButton.setText("Search");
        // getContentPane().add(searchButton);
        // searchButton.setBounds(20, 360, 75, 23);
        // getContentPane().add(searchBar);
        // searchBar.setBounds(130, 360, 210, 22);

        youSearchedText.setEditable(false);
        youSearchedText.setText("salt events");
        getContentPane().add(youSearchedText);
        youSearchedText.setBounds(130, 310, 210, 22);

        youSearched.setText("You Searched: ");
        getContentPane().add(youSearched);
        youSearched.setBounds(20, 310, 80, 16);

        searchResults.setFont(new java.awt.Font("Garamond", 0, 48)); // NOI18N
        searchResults.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchResults.setText("Search Results");
        getContentPane().add(searchResults);
        searchResults.setBounds(60, 190, 270, 80);

        advancedSearchButton.setText("Click for Advanced Search");
        getContentPane().add(advancedSearchButton);
        advancedSearchButton.setBounds(100, 270, 190, 23);
        advancedSearchButton.addActionListener(this); 

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("Each year editions background-resized.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1066, 600);

        pack();
        this.setVisible(true);
        this.setSize(1068, 628); 
        this.setResizable(false);
    }
                                        
    // add actionhandlers here     
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == backButton){
            MainPage test = new MainPage(); 
            this.dispose(); 
        }
        
        if (e.getSource() == advancedSearchButton){
            AdvancedSearch test = new AdvancedSearch(); 
            this.dispose(); 
        }
        
        
        // download the pdf file 
        
        if (e.getSource() == download1){
            // downloads the file 
        }
        else if (e.getSource() == download2){
            // downloads file 2 
        }
        else if (e.getSource() == download3){
            // downloads file 3
        }
        else if (e.getSource() == download4){
            // downloads file 4
        }
        else if (e.getSource() == download5){
            // downloads file 5
        }
        else if (e.getSource() == download6){
            // downloads file 6
        }
        else if (e.getSource() == download7){
            // downloads file 7
        }
        else if (e.getSource() == download8)
        {
            // downloads file 8
        }
        else if (e.getSource() == download9)
        {
            // downloads file 9
        }
        else if (e.getSource() == download10)
        {
            // downloads file 10
        }
        
        // send to view article page 
        if (e.getSource() == reviewButton1){
            
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        else if (e.getSource() == reviewButton2){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        else if (e.getSource() == reviewButton3){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        else if (e.getSource() == reviewButton4){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        else if (e.getSource() == reviewButton5){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        else if (e.getSource() == reviewButton6){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        else if (e.getSource() == reviewButton7){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        else if (e.getSource() == reviewButton8){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        else if (e.getSource() == reviewButton9){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        else if (e.getSource() == reviewButton10){
            ReviewPage test = new ReviewPage("8.1 cover-resized.png");  // <--- this is a placeholder image
            this.dispose(); 
        }
        
    }
}
