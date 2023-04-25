package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateCustomer extends JFrame implements ActionListener {
    
    JLabel lblusername,labelname;
    JComboBox comboid;
    JTextField tnumber,tcountry,taddress,temail,tphone,tid,tgender;
    JRadioButton rmale,rfemale,rnonbinary;
    JButton add,back;
    
    UpdateCustomer(String username){
        setBounds(500,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("Update Customer Details");
        text.setBounds(50,10,300,25);
        text.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(text);
        
        JLabel pusername = new JLabel("Username: ");
        pusername.setBounds(30,50,150,25);
        add(pusername);
        
        lblusername = new JLabel("");
        lblusername.setBounds(220,50,150,25);
        add(lblusername);
        
        JLabel id = new JLabel("ID: ");
        id.setBounds(30,90,150,25);
        add(id);
        
        tid = new JTextField();
        tid.setBounds(220,90,150,25);
        add(tid);
        
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
        
        tgender = new JTextField();
        tgender.setBounds(220,210,150,25);
        add(tgender);
        
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
        
        add = new JButton("Update");
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
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/updateCustomer.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,40,400,500);
        add(image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                lblusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tid.setText(rs.getString("id"));
                tnumber.setText(rs.getString("number"));
                tgender.setText(rs.getString("gender"));
                tcountry.setText(rs.getString("country"));
                taddress.setText(rs.getString("address"));
                tphone.setText(rs.getString("phone"));
                temail.setText(rs.getString("email"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String username = lblusername.getText();
            String id = tid.getText();
            String number = tnumber.getText();
            String name = labelname.getText();
            String gender = tgender.getText();
            String country = tcountry.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            
            try{
                Conn c = new Conn();
                String query = "update customer set username = '"+username+"',id = '"+id+"',number = '"+number+"',name = '"+name+"',gender = '"+gender+"',country = '"+country+"',address = '"+address+"',phone = '"+phone+"',email = '"+email+"';";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Customer Details updated Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new UpdateCustomer("Soham");
    }
}
