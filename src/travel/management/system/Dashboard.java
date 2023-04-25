package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkPackages,bookPackages;
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(33, 35, 122));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(33, 35, 122));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        //Buttons
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(33, 35, 122));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(33, 35, 122));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(33, 35, 122));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewPersonalDetails.setMargin(new Insets(0,0,0,30));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        JButton deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(33, 35, 122));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetails);
        
        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0,200,300,50);
        checkPackages.setBackground(new Color(33, 35, 122));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma",Font.PLAIN,15));
        checkPackages.setMargin(new Insets(0,0,0,110));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        bookPackages = new JButton("Book Package");
        bookPackages.setBounds(0,250,300,50);
        bookPackages.setBackground(new Color(33, 35, 122));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma",Font.PLAIN,15));
        bookPackages.setMargin(new Insets(0,0,0,120));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);
        
        JButton viewPackages = new JButton("View Package");
        viewPackages.setBounds(0,300,300,50);
        viewPackages.setBackground(new Color(33, 35, 122));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewPackages.setMargin(new Insets(0,0,0,120));
        p2.add(viewPackages);
        
        JButton viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,350,300,50);
        viewHotels.setBackground(new Color(33, 35, 122));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewHotels.setMargin(new Insets(0,0,0,130));
        p2.add(viewHotels);
        
        JButton bookHotels = new JButton("Book Hotel");
        bookHotels.setBounds(0,400,300,50);
        bookHotels.setBackground(new Color(33, 35, 122));
        bookHotels.setForeground(Color.WHITE);
        bookHotels.setFont(new Font("Tahoma",Font.PLAIN,15));
        bookHotels.setMargin(new Insets(0,0,0,140));
        p2.add(bookHotels);
        
        JButton viewbookedkHotel = new JButton("View Booked Hotel");
        viewbookedkHotel.setBounds(0,450,300,50);
        viewbookedkHotel.setBackground(new Color(33, 35, 122));
        viewbookedkHotel.setForeground(Color.WHITE);
        viewbookedkHotel.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewbookedkHotel.setMargin(new Insets(0,0,0,90));
        p2.add(viewbookedkHotel);
        
        JButton destinations = new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(33, 35, 122));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,15));
        destinations.setMargin(new Insets(0,0,0,135));
        p2.add(destinations);
        
        JButton payments = new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(33, 35, 122));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,15));
        payments.setMargin(new Insets(0,0,0,150));
        p2.add(payments);
         
        JButton calculator = new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(33, 35, 122));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,15));
        calculator.setMargin(new Insets(0,0,0,150));
        p2.add(calculator);
        
        JButton notepad = new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(33, 35, 122));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,15));
        notepad.setMargin(new Insets(0,0,0,155));
        p2.add(notepad);
        
        JButton about = new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(33, 35, 122));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,15));
        about.setMargin(new Insets(0,0,0,175));
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setForeground(new Color(168, 50, 80));
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        text.setBounds(400,70,1200,70);
        image.add(text);

        setVisible(true);
       
    }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == addPersonalDetails){
                new AddCustomer(username);
            }else if(ae.getSource() == viewPersonalDetails){
                new ViewCustomer(username);
            }else if(ae.getSource() == updatePersonalDetails){
                new UpdateCustomer(username);
            }else if(ae.getSource() == checkPackages){
                new CheckPackages();
            }else if(ae.getSource() == bookPackages){
                new BookPackage(username);
            }
        }
    public static void main(String args[]){
        new Dashboard("");
    }
}
