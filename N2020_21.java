import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.Font; 
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class N2020_21 extends javax.swing.JFrame implements ActionListener{
    private JLabel background, ed1, ed2, ed3;
    private JButton viewArticles1, viewArticles2, viewArticles3;
    private JButton viewFullEd1, viewFullEd2, viewFullEd3; 
    private JButton backButton; 
    
    public N2020_21() {
        viewFullEd1 = new JButton();
        viewFullEd2 = new JButton();
        viewFullEd3 = new JButton();
        
        viewArticles1 = new JButton();
        viewArticles2 = new JButton();
        viewArticles3 = new JButton();
        
        backButton = new JButton(); 
        
        ed3 = new JLabel();
        ed1 = new JLabel();
        ed2 = new JLabel();
        
        background = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        viewFullEd1.setText("View Full Edition");
        getContentPane().add(viewFullEd1);
        viewFullEd1.setBounds(126, 452, 178, 23);
        // viewFullEd1.addActionListener(this)

        viewFullEd2.setText("View Full Edition");
        getContentPane().add(viewFullEd2);
        viewFullEd2.setBounds(447, 452, 172, 23);
        // viewFullEd1.addActionListener(this)


        viewFullEd3.setText("View Full Edition");
        getContentPane().add(viewFullEd3);
        viewFullEd3.setBounds(766, 452, 169, 23);
        // viewFullEd1.addActionListener(this)

        viewArticles1.setText("Review Edition");
        getContentPane().add(viewArticles1);
        viewArticles1.setBounds(126, 487, 178, 23);
        viewArticles1.addActionListener(this);

        viewArticles2.setText("Review Edition");
        getContentPane().add(viewArticles2);
        viewArticles2.setBounds(447, 487, 172, 23);
        viewArticles2.addActionListener(this);

        viewArticles3.setText("Review Edition");
        getContentPane().add(viewArticles3);
        viewArticles3.setBounds(766, 487, 169, 23);
        viewArticles3.addActionListener(this);
        
        backButton.setText("Back"); 
        getContentPane().add(backButton); 
        backButton.setBounds(500, 530, 72, 23);
        backButton.addActionListener(this);

        ed3.setIcon(new ImageIcon(getClass().getResource("10.3-2020-21-resized.png"))); // NOI18N
        getContentPane().add(ed3);
        ed3.setBounds(770, 190, 170, 230);

        ed1.setIcon(new ImageIcon(getClass().getResource("10.1-2020-21-resized.png"))); // NOI18N
        getContentPane().add(ed1);
        ed1.setBounds(130, 180, 180, 240);

        ed2.setIcon(new ImageIcon(getClass().getResource("10.2-2020-21-resized.png"))); // NOI18N
        getContentPane().add(ed2);
        ed2.setBounds(450, 190, 180, 230);

        background.setIcon(new ImageIcon(getClass().getResource("Each Year Edition background(1)-resized.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1060, 600);

        pack();
        this.setVisible(true);
        this.setSize(1068, 628); 
        this.setResizable(false);
    }// </editor-fold>      
    
    private void downloadFile(String fileName) {
    try {
        File sourceFile = new File(fileName);

        if (!sourceFile.exists()) {
            JOptionPane.showMessageDialog(this, "File not found: " + sourceFile.getAbsolutePath());
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(sourceFile.getName()));
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File destination = fileChooser.getSelectedFile();
            Files.copy(sourceFile.toPath(), destination.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(this, "File downloaded successfully!");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Download error: " + ex.getMessage());
    }
}


    public void actionPerformed(ActionEvent e){                                            
       if(e.getSource() == backButton){
           MainPage test = new MainPage(); 
           this.dispose(); 
       }
       
       if (e.getSource() == viewFullEd1) {
            downloadFile("10.1 (1).pdf");
        } else if (e.getSource() == viewFullEd2) {
            downloadFile("10.1 (1).pdf");
        } else if (e.getSource() == viewFullEd3) {
            downloadFile("10.1 (1).pdf");
        }

       if(e.getSource() == viewArticles1){
            ReviewPage test = new ReviewPage("10.1-2020-21-resized.png");
            this.dispose(); 
        } else if(e.getSource() == viewArticles2){
            ReviewPage test = new ReviewPage("10.2-2020-21-resized.png"); 
            this.dispose(); 
        } else if(e.getSource() == viewArticles3){
            ReviewPage test = new ReviewPage("10.3-2020-21-resized.png"); 
            this.dispose(); 
        } 
    }
}