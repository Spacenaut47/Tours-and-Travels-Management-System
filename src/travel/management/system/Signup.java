package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField tname,tusername,tanswer;
    JPasswordField tcpassword,tpassword;
    Choice tsecurity;
    Signup(){
        setBounds(150,200,900,360);
        //getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setLayout(null);
        p1.setBounds(0,0,500,400);
        add(p1);
        
        //Username 
        JLabel username = new JLabel("Username:");
        username.setFont(new Font("Tahoma", Font.BOLD, 14));
        username.setBounds(50,20,125,25);
        p1.add(username); 
        
        tusername = new JTextField();
        tusername.setBounds(190,20,180,25);
        tusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tusername);
        
        
        //Name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        name.setBounds(50,60,125,25);
        p1.add(name); 
        
        tname = new JTextField();
        tname.setBounds(190,60,180,25);
        tname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tname);
        
        //Password
        JLabel password = new JLabel("Password:");
        password.setFont(new Font("Tahoma", Font.BOLD, 14));
        password.setBounds(50,100,125,25);
        p1.add(password); 
        
        tpassword = new JPasswordField();
        tpassword.setBounds(190,100,180,25);
        tpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tpassword);
        setVisible(true);
        
        //Confirm Password
        JLabel cpassword = new JLabel("Confirm Password:");
        cpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        cpassword.setBounds(50,140,150,25);
        p1.add(cpassword); 
        
        tcpassword = new JPasswordField();
        tcpassword.setBounds(190,140,180,25);
        tcpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tcpassword);
        
        //Security Question
        JLabel security = new JLabel("Security Question: ");
        security.setFont(new Font("Tahoma", Font.BOLD, 14));
        security.setBounds(50,180,140,25);
        p1.add(security);
        
        tsecurity = new Choice();
        tsecurity.add("Thor or Spider?");
        tsecurity.add("What is");
        tsecurity.add("In what city");
        tsecurity.add("What is the");
        tsecurity.add("Where were iss?");
        tsecurity.add("What wa?");
        tsecurity.setBounds(190,180,200,25);
        p1.add(tsecurity);
        
        //Answer to the security question
        JLabel answer = new JLabel("Answer:");
        answer.setFont(new Font("Tahoma", Font.BOLD, 14));
        answer.setBounds(50,220,125,25);
        p1.add(answer); 
        
        tanswer = new JTextField();
        tanswer.setBounds(190,220,180,25);
        tanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tanswer);
        
        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(250,250,100,30);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
            String username = tusername.getText();
            String name = tname.getText();
            char password[] = tpassword.getPassword();
            char cpassword[] = tcpassword.getPassword();
            String question = tsecurity.getSelectedItem();
            String answer = tanswer.getText();
            
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"');";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account created succesfully");
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[]){
        new Signup();
    }
}
