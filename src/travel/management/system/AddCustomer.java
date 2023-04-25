package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener {
    
    JLabel lblusername,labelname;
    JComboBox comboid;
    JTextField tnumber,tcountry,taddress,temail,tphone;
    JRadioButton rmale,rfemale,rnonbinary;
    JButton add,back;
    
    AddCustomer(String username){
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel pusername = new JLabel("Username: ");
        pusername.setBounds(30,50,150,25);
        add(pusername);
        
        lblusername = new JLabel("");
        lblusername.setBounds(220,50,150,25);
        add(lblusername);
        
        JLabel id = new JLabel("ID: ");
        id.setBounds(30,90,150,25);
        add(id);
        
        comboid = new JComboBox(new String[] {"Passport","Aadhar Card","Ration Card","Pan Card","Voter Card"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        JLabel number = new JLabel("ID Number: ");
        number.setBounds(30,130,150,25);
        add(number);
        
        tnumber = new JTextField();
        tnumber.setBounds(220,130,150,25);
        add(tnumber);
        
        JLabel name = new JLabel("Name: ");
        name.setBounds(30,170,150,25);
        add(name);
        
        labelname = new JLabel("");
        labelname.setBounds(220,170,150,25);
        add(labelname);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(30,210,150,25);
        add(gender);
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        rnonbinary = new JRadioButton("Non-Binary");
        rnonbinary.setBounds(380,210,90,25);
        rnonbinary.setBackground(Color.WHITE);
        add(rnonbinary);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        bg.add(rnonbinary);
        
        JLabel country = new JLabel("Country: ");
        country.setBounds(30,250,150,25);
        add(country);
        
        tcountry = new JTextField();
        tcountry.setBounds(220,250,150,25);
        add(tcountry);
        
        JLabel address = new JLabel("Address: ");
        address.setBounds(30,290,150,25);
        add(address);
        
        taddress = new JTextField();
        taddress.setBounds(220,290,150,25);
        add(taddress);
        
        JLabel email = new JLabel("Email: ");
        email.setBounds(30,330,150,25);
        add(email);
        
        temail = new JTextField();
        temail.setBounds(220,330,150,25);
        add(temail);
        
        JLabel phone = new JLabel("Phone: ");
        phone.setBounds(30,370,150,25);
        add(phone);
        
        tphone = new JTextField();
        tphone.setBounds(220,370,150,25);
        add(tphone);
        
        add = new JButton("Add");
        add.setBackground(new Color(48, 207, 85));
        add.setForeground(Color.WHITE);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        
        back = new JButton("Back");
        back.setBackground(new Color(48, 207, 85));
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,40,400,500);
        add(image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
            while(rs.next()){
                lblusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String username = lblusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if(rmale.isSelected()){
                gender = "Male";
            }else if(rfemale.isSelected()){
                gender = "Female";
            }else {
                gender = "Non-Binary";
            }
            String country = tcountry.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            
            try{
                Conn c = new Conn();
                String query = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"');";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Customer Details added Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new AddCustomer("Soham");
    }
}
