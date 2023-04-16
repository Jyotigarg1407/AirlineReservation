package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class all_info extends JFrame{
  JFrame f=new JFrame();
  public static void main(String[] args) {
        new all_info().setVisible(true);
    }
    
    public all_info() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/logo.jpg")));
	NewLabel.setBounds(0, 0, 1920, 990); 

	add(NewLabel); 
	JButton b1=new JButton("FLIGHT INFO");
	b1.setBounds(150, 150, 150, 50);
	f.add(b1);
	JButton b2=new JButton("ADD CUSTOMER DETAILS");
	b2.setBounds(380, 150, 150, 50);
	f.add(b2);
	JButton b3=new JButton("JOURNEY DETAILS");
	b3.setBounds(660, 150, 150, 50);
	f.add(b3);
	//JButton b4=new JButton("PAYMENT DETAILS");
//	b4.setBounds(700, 150, 150, 50);
	//f.add(b4);
	JButton b5=new JButton("CANCELLATION");
	b5.setBounds(890, 150, 150, 50);
	f.add(b5);
	
	b1.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent ae){
	          try {
	        	  Flight_Info fc=new Flight_Info();
	        	  fc.setVisible(true);
		} catch (Exception e) {
	              e.printStackTrace();
		} 
	      }
	});
	
	b2.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent ae){
	          try {
	        	  Add_Customer ac=new Add_Customer();
	        	  ac.setVisible(true);
		} catch (Exception e) {
	              e.printStackTrace();
		} 
	      }
	});
	b3.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent ae){
	          try {
	        	  Journey_Details jd=new Journey_Details();
	             jd.setVisible(true);
	             
		} catch (Exception e) {
	              e.printStackTrace();
		} 
	      }
	});
//	b4.addActionListener(new ActionListener(){
//	      public void actionPerformed(ActionEvent ae){
//	          try {
//	        	  Payment_Details pd=new Payment_Details();
//	             pd.setVisible(true);
//	             
//		} catch (Exception e) {
//	              e.printStackTrace();
//		} 
//	      }
//	});
	b5.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent ae){
	          try {
	        	  Cancel c=new Cancel();
	             c.setVisible(true);
	             
		} catch (Exception e) {
	              e.printStackTrace();
		} 
	      }
	});
	
//	
//        JLabel AirlineManagementSystem = new JLabel(" Airline Reservation ");
//	AirlineManagementSystem.setForeground(Color.BLUE);
//        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
//	AirlineManagementSystem.setBounds(700, 60, 1000, 55);
//	NewLabel.add(AirlineManagementSystem);
//		
//		
//        JMenuBar menuBar = new JMenuBar();
//	setJMenuBar(menuBar);
//		
//        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
//        AirlineSystem.setForeground(Color.BLUE);
//	menuBar.add(AirlineSystem);
//		
//        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFO");
//	AirlineSystem.add(FlightDetails);
//		
//	JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER_DETAILS");
//	AirlineSystem.add(ReservationDetails);
//		
//	JMenuItem PassengerDetails = new JMenuItem("JOURNEY_DETAILS");
//	AirlineSystem.add(PassengerDetails);
//		
//	JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
//	AirlineSystem.add(SectorDetails_1);
//		
//	JMenuItem Cancellation = new JMenuItem("CANCELLATION");
//	AirlineSystem.add(Cancellation);
//		

//	FlightDetails.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                new Flight_Info();
//            }
//	});
//        
//	ReservationDetails.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try {
//                    new Add_Customer();
//		} catch (Exception e) {
//                    e.printStackTrace();
//		} 
//            }
//	});
//		
//        PassengerDetails.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try {
//                    new Journey_Details();
//                } catch (Exception e) {
//                    e.printStackTrace();
//		}
//            }
//	});
//		
//        SectorDetails_1.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try {
//                    new Payment_Details();
//		} catch (Exception e) {
//                    e.printStackTrace();
//		}
//            }
//	});
//		
//        Cancellation.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                new Cancel();
//            }
//	});

	JLabel label = new JLabel(" ");
	label.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/front.png")));
	label.setBounds(15, -300, 1400, 1200);
	f.add(label);
        f.setSize(2000,2000);
    f.setLayout(null);    
	f.setVisible(true);
    }
}
