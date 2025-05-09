import java.util.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.Font; 

public class AdvancedSearch extends javax.swing.JFrame implements ActionListener {
                         
    private JLabel advancedSearch;
    private JButton backButton, refreshButton;
    private JLabel background, byAuthor, byEdition, byGenre, byVolume;
    
    private JTextField selectAuthor;
    private JComboBox<String> selectEdition, selectGenre, selectVolume; 
    
    private String selectedEdition, selectedVolume, selectedAuthor, selectedGenre; 
      
    
    public AdvancedSearch() {
        refreshButton = new JButton();
        backButton = new JButton();
        
        selectEdition = new JComboBox<>();
        selectVolume = new JComboBox<>();
        selectAuthor = new JTextField();
        selectGenre = new JComboBox<>();
        
        byEdition = new JLabel();
        byVolume = new JLabel();
        byAuthor = new JLabel();
        byGenre = new JLabel();
        
        advancedSearch = new JLabel();
        background = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1066, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        refreshButton.setFont(new Font("Segoe UI", 0, 18));
        refreshButton.setText("Refresh");
        getContentPane().add(refreshButton);
        refreshButton.setBounds(560, 490, 110, 32);
        refreshButton.addActionListener(this); 

        backButton.setFont(new Font("Segoe UI", 0, 18)); 
        backButton.setText("Back");
        getContentPane().add(backButton);
        backButton.setBounds(390, 490, 110, 30);
        backButton.addActionListener(this); 

        selectEdition.setFont(new Font("Segoe UI", 0, 18)); 
        selectEdition.setModel(new DefaultComboBoxModel<>(new String[] { "Ed 1", "Ed 2", "Ed 3 ", "Ed 4 ", "Ed 5", "Any" }));
        getContentPane().add(selectEdition);
        selectEdition.setBounds(610, 390, 190, 40);
        selectEdition.addActionListener(this); 

        selectVolume.setFont(new Font("Segoe UI", 0, 18)); 
        selectVolume.setModel(new DefaultComboBoxModel<>(new String[] { "Vol 8", "Vol 9", "Vol 10", "Vol 11", "Vol 12", "Vol 13" }));
        getContentPane().add(selectVolume);
        selectVolume.setBounds(260, 390, 190, 40);
        selectVolume.addActionListener(this); 

        selectAuthor.setFont(new Font("Segoe UI", 0, 18)); 
        selectAuthor.addActionListener(this); 
        getContentPane().add(selectAuthor);
        selectAuthor.setBounds(610, 210, 190, 40);
        selectAuthor.addActionListener(this); 

        selectGenre.setFont(new Font("Segoe UI", 0, 18)); 
        selectGenre.setModel(new DefaultComboBoxModel<>(new String[] { "Editorial", "Advice", "Reviews", "Sports", "Events", "Seasonal", "Teachers", "Creative Writing", "Games ", "Miscellaneous " }));
        selectGenre.addActionListener(this); 
        getContentPane().add(selectGenre);
        selectGenre.setBounds(260, 210, 190, 40);
        selectGenre.addActionListener(this); 

        byEdition.setFont(new Font("Garamond", 0, 24)); 
        byEdition.setText("By Edition");
        getContentPane().add(byEdition);
        byEdition.setBounds(650, 350, 110, 30);

        byVolume.setFont(new Font("Garamond", 0, 24)); 
        byVolume.setText("By Volume");
        getContentPane().add(byVolume);
        byVolume.setBounds(300, 350, 120, 40);

        byAuthor.setFont(new Font("Garamond", 0, 24)); 
        byAuthor.setText("By Author");
        getContentPane().add(byAuthor);
        byAuthor.setBounds(650, 170, 110, 30);

        byGenre.setFont(new Font("Garamond", 0, 24)); 
        byGenre.setText("By Genre");
        getContentPane().add(byGenre);
        byGenre.setBounds(310, 170, 100, 32);

        advancedSearch.setFont(new Font("Garamond", 0, 48)); 
        advancedSearch.setText("Advanced Search");
        getContentPane().add(advancedSearch);
        advancedSearch.setBounds(360, 70, 330, 55);

        background.setIcon(new ImageIcon(getClass().getResource("Each year editions background-resized.png"))); 
        getContentPane().add(background);
        background.setBounds(-3, 0, 1070, 600);

        pack();
        this.setVisible(true);
        this.setSize(1068, 628); 
        this.setResizable(false);
    }                    

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == backButton){
            MainPage test = new MainPage(); 
            this.dispose(); 
        }
        
        if (e.getSource() == refreshButton){
            selectedEdition = selectEdition.getSelectedItem().toString(); 
            selectedVolume = selectVolume.getSelectedItem().toString(); 
            selectedAuthor = selectAuthor.getText(); 
            selectedGenre = selectGenre.getSelectedItem().toString(); 
            
            SearchResults test = new SearchResults(); 
            this.dispose(); 
        }
        
    }



                    
}
