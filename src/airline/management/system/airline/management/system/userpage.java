package airline.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class userpage extends JFrame{
  JFrame f=new JFrame();
  public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public userpage() {
        super("User Page");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

	JButton b1=new JButton("Sign UP");
	b1.setBounds(450, 250, 100, 30);
	f.add(b1);
	JButton b2=new JButton("Login");
	b2.setBounds(750, 250, 100, 30);
	f.add(b2);
	b1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
          try {
             Registration r=new Registration();
             r.setVisible(true);
             
	} catch (Exception e) {
              e.printStackTrace();
	} 
      }
});
	b2.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent ae){
	          try {
	              userlogin u=new  userlogin();
	              u.setVisible(true);
		} catch (Exception e) {
	              e.printStackTrace();
		} 
	      }
	});

        f.setSize(1950,1090);
    f.setLayout(null);    
	f.setVisible(true);
    }
}

