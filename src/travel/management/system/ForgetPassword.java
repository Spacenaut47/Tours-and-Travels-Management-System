package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener{
    JTextField tusername,tname,tquestion,tanswer,tpass;
    JButton search,retrieve,back;
    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ForgetPassword.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);
        
        JLabel username = new JLabel("Username: ");
        username.setBounds(40,20,100,25);
        username.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(username);
        
        tusername = new JTextField();
        tusername.setBounds(220,20,150,25);
        tusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tusername);
        
        search = new JButton("Search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
        search.setBounds(380,20,100,25);
        search.addActionListener(this);
        p1.add(search);
        
        JLabel name = new JLabel("Name: ");
        name.setBounds(40,60,100,25);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(name);
        
        tname = new JTextField();
        tname.setBounds(220,60,150,25);
        tname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tname);
        
        JLabel question = new JLabel("Your Security Question: ");
        question.setBounds(40,100,200,25);
        question.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(question);
        
        tquestion = new JTextField();
        tquestion.setBounds(220,100,150,25);
        tquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tquestion);
        
        JLabel answer = new JLabel("Your Answer: ");
        answer.setBounds(40,140,200,25);
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(answer);
        
        tanswer = new JTextField();
        tanswer.setBounds(220,140,150,25);
        tanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tanswer);
        
        retrieve = new JButton("Retrieve");
        retrieve.setBackground(Color.GRAY);
        retrieve.setForeground(Color.WHITE);
        retrieve.setBounds(380,140,100,25);
        retrieve.addActionListener(this);
        p1.add(retrieve);
        
        JLabel pass = new JLabel("Your Password: ");
        pass.setBounds(40,180,200,25);
        pass.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(pass);
        
        tpass = new JTextField();
        tpass.setBounds(220,180,150,25);
        tpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tpass);
        
        back = new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setBounds(150,230,100,25);
        back.addActionListener(this);
        p1.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            try{
                String query = "select * from account where username = '"+tusername.getText()+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tname.setText(rs.getString("name"));
                    tquestion.setText(rs.getString("security"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == retrieve){
            try{
                String query = "select * from account where answer = '"+tanswer.getText()+"' AND username = '"+tusername.getText()+"';";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tpass.setText(rs.getString("password"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[]){
        new ForgetPassword();
    }
}
