package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame{
  JFrame f=new JFrame();
	
		
  public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

    

	JButton b1=new JButton("Admin");
	b1.setBounds(450, 100, 100, 30);
	f.add(b1);
	JButton b2=new JButton("User");
	b2.setBounds(750, 100, 100, 30);
	f.add(b2);
	
                
	b1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
          try {
             Login l=new Login();
             l.setVisible(true);
             
	} catch (Exception e) {
              e.printStackTrace();
	} 
      }
});
	b2.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent ae){
	          try {
	             userpage u=new userpage();
	             u.setVisible(true);
		} catch (Exception e) {
	              e.printStackTrace();
		} 
	      }
	});


	JLabel label = new JLabel(" ");
	label.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/front.png")));
	label.setBounds(15, -300, 1400, 1200);
	f.add(label);
		
        f.setSize(1950,1090);
    f.setLayout(null);    
	f.setVisible(true);
    }
}
