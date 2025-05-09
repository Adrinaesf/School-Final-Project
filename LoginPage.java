import java.util.HashMap;
import javax.swing.*;

public class LoginPage extends javax.swing.JFrame {
    private JButton loginButton;
    private JLabel backgroundPic;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel loginLabel;
    private JPasswordField PasswordField;
    private JTextField userIDField;
    
    HashMap<String, String> Data = new HashMap<String, String>(); 
    
    public LoginPage(HashMap<String, String> original) {
        Data = original; // Copying the HashMap in this class in order to use it
        userIDField = new JTextField();
        PasswordField = new JPasswordField();
        usernameLabel = new JLabel();
        passwordLabel = new JLabel();
        loginButton = new JButton();
        loginLabel = new JLabel();
        backgroundPic = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        userIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jTextField1ActionPerformed(e);
            }
        });
        getContentPane().add(userIDField);
        userIDField.setBounds(420, 210, 290, 30);

        getContentPane().add(PasswordField);
        PasswordField.setBounds(420, 270, 290, 30);

        usernameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        usernameLabel.setText("Username:");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(300, 210, 140, 30);

        passwordLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        passwordLabel.setText("Password: ");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(300, 270, 130, 30);

        loginButton.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        loginButton.setText("Login");
        getContentPane().add(loginButton);
        loginButton.setBounds(450, 350, 180, 29);
        
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jButton1ActionPerformed(e);
            }
        });

        loginLabel.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        loginLabel.setText("Login Page");
        getContentPane().add(loginLabel);
        loginLabel.setBounds(430, 80, 320, 70);

        backgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login page background.png"))); // NOI18N
        backgroundPic.setText("jLabel1");
        getContentPane().add(backgroundPic);
        backgroundPic.setBounds(0, 0, 1066, 600);

        pack();
        this.setVisible(true);
        this.setSize(1068, 628); 
        this.setResizable(false);
    }                       

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent e) {                                            
        // TODO add your handling code here:
    }     
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent e) {                                            
        // TODO add your handling code here:
        if(e.getSource() == loginButton){
            String userID = userIDField.getText(); // converting the username to a string 
            String password = String.valueOf(PasswordField.getPassword()); // converting the password to a string 
            
            if(Data.containsKey(userID)){
                if(Data.get(userID).equals(password)){ // if associeted pass for the user id is true and right
                    MainPage test1 = new MainPage();
                    this.dispose(); 
                }
            }
        }
    }    
    
}