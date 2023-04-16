package airline.management.system;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * User Registration using Swing
 * @author javaguides.net
 *
 */
public class Registration extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registration frame = new Registration();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public Registration() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        firstname.setBounds(214, 151, 228, 50);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lastname.setBounds(214, 235, 228, 50);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();

        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        email.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(707, 151, 228, 50);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mob.setBounds(707, 320, 228, 50);
        contentPane.add(mob);
        mob.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(707, 235, 228, 50);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
                String password = passwordField.getText();

                String msg = "" + firstName;
                msg += " \n";
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "root");

                    String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        password + "','" + emailId + "','" + mobileNumber + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                btnNewButton.addActionListener(new ActionListener(){
          	      public void actionPerformed(ActionEvent ae){
          	          try {
          	        	  all_info ai=new all_info();
          	        	  ai.setVisible(true);
          		} catch (Exception e) {
          	              e.printStackTrace();
          		} 
          	      }
          	});
                
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 259, 74);
        contentPane.add(btnNewButton);
    }
}
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//
//public class Registration extends JDialog {
//    private static Frame parent;
//	private JTextField tfName;
//    private JTextField tfEmail;
//    private JTextField tfPhone;
//    private JTextField tfAddress;
//    private JPasswordField pfPassword;
//    private JPasswordField pfConfirmPassword;
//    private JButton btnRegister;
//    private JButton btnCancel;
//    private JPanel Panel1;
//    //frame.setContentPane(new View().registerPanel);
//
//    public Registration() {
//        super(parent);
//        setTitle("Create a new account");
//        setContentPane(Panel1);
//        setMinimumSize(new Dimension(450, 474));
//        setModal(true);
//        setLocationRelativeTo(parent);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//
//        btnRegister.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                registerUser();
//            }
//        });
//        btnCancel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//            }
//        });
//
//        setVisible(true);
//    }
//
//    private void registerUser() {
//        String name = tfName.getText();
//        String email = tfEmail.getText();
//        String phone = tfPhone.getText();
//        String address = tfAddress.getText();
//        String password = String.valueOf(pfPassword.getPassword());
//        String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());
//
//        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()) {
//            JOptionPane.showMessageDialog(this,
//                    "Please enter all fields",
//                    "Try again",
//                    JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        if (!password.equals(confirmPassword)) {
//            JOptionPane.showMessageDialog(this,
//                    "Confirm Password does not match",
//                    "Try again",
//                    JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        user = addUserToDatabase(name, email, phone, address, password);
//        if (user != null) {
//            dispose();
//        }
//        else {
//            JOptionPane.showMessageDialog(this,
//                    "Failed to register new user",
//                    "Try again",
//                    JOptionPane.ERROR_MESSAGE);
//        }
//    }
//
//    public User user;
//    private User addUserToDatabase(String name, String email, String phone, String address, String password) {
//        User user = null;
//        final String DB_URL = "jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
//        final String USERNAME = "root";
//        final String PASSWORD = "";
//
//        try{
//            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//            // Connected to database successfully...
//
//            Statement stmt = conn.createStatement();
//            String sql = "INSERT INTO users (name, email, phone, address, password) " +
//                    "VALUES (?, ?, ?, ?, ?)";
//            PreparedStatement preparedStatement = conn.prepareStatement(sql);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, email);
//            preparedStatement.setString(3, phone);
//            preparedStatement.setString(4, address);
//            preparedStatement.setString(5, password);
//
//            //Insert row into the table
//            int addedRows = preparedStatement.executeUpdate();
//            if (addedRows > 0) {
//                user = new User();
//                user.name = name;
//                user.email = email;
//                user.phone = phone;
//                user.address = address;
//                user.password = password;
//            }
//
//            stmt.close();
//            conn.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//        return user;
//    }
//    
//
//    public static void main(String[] args) {
//        Registration myForm = new Registration();
//        User user = myForm.user;
//        if (user != null) {
//            System.out.println("Successful registration of: " + user.name);
//        }
//        else {
//            System.out.println("Registration canceled");
//        }
//    }
//}
