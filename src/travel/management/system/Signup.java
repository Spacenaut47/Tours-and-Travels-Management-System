package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {
    Signup(){
        setBounds(150,200,900,360);
        getContentPane().setBackground(Color.WHITE);
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
        
        JTextField tusername = new JTextField();
        tusername.setBounds(190,20,180,25);
        tusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tusername);
        
        
        //Name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        name.setBounds(50,60,125,25);
        p1.add(name); 
        
        JTextField tname = new JTextField();
        tname.setBounds(190,60,180,25);
        tname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tname);
        
        //Password
        JLabel password = new JLabel("Password:");
        password.setFont(new Font("Tahoma", Font.BOLD, 14));
        password.setBounds(50,100,125,25);
        p1.add(password); 
        
        JPasswordField tpassword = new JPasswordField();
        tpassword.setBounds(190,100,180,25);
        tpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tpassword);
        setVisible(true);
        
        //Confirm Password
        JLabel cpassword = new JLabel("Confirm Password:");
        cpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        cpassword.setBounds(50,140,150,25);
        p1.add(cpassword); 
        
        JPasswordField tcpassword = new JPasswordField();
        tcpassword.setBounds(190,140,180,25);
        tcpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tcpassword);
        
        //Security Question
        JLabel security = new JLabel("Security Question: ");
        security.setFont(new Font("Tahoma", Font.BOLD, 14));
        security.setBounds(50,180,150,25);
        p1.add(security);
        
        Choice tsecurity = new Choice();
        tsecurity.add("What is your mother's maiden name?");
        tsecurity.add("What is your High School's Name?");
        tsecurity.add("In what city did you meet your spouse/significant other?");
        tsecurity.add("What is the middle name of your youngest child?");
        tsecurity.add("Where were you when you had your first kiss?");
        tsecurity.add("What was the name of your first stuffed animal?");
        tsecurity.setBounds(190,180,200,25);
        p1.add(tsecurity);
        
        //Answer to the security question
        JLabel answer = new JLabel("Answer:");
        answer.setFont(new Font("Tahoma", Font.BOLD, 14));
        answer.setBounds(50,220,125,25);
        p1.add(answer); 
        
        JTextField tanswer = new JTextField();
        tanswer.setBounds(190,220,180,25);
        tanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tanswer);
        
        
        setVisible(true);
    }
    public static void main(String args[]){
        new Signup();
    }
}
