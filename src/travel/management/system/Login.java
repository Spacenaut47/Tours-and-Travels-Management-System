package travel.management.system;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton login,signup,for_pass;
    Login() {
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);

        getContentPane().setBackground(new Color(242, 243, 245));

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(32, 33, 36));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p1.add(image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);

        // USERNAME LABEL AND TEXTBOX
        JLabel username = new JLabel("Username:");
        username.setBounds(60, 20, 100, 25);
        username.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p2.add(username);

        JTextField tusername = new JTextField();
        tusername.setBounds(60, 60, 300, 30);
        tusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tusername);

        // PASSWORD LABEL AND TEXTBOX
        JLabel password = new JLabel("Password:");
        password.setBounds(60, 110, 100, 25);
        password.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p2.add(password);

        JPasswordField tpassword = new JPasswordField();
        tpassword.setBounds(60, 150, 300, 30);
        tpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tpassword);

        // BUTTONS
        login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(new Color(68, 189, 50));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(68, 189, 50)));
        login.addActionListener(this);
        p2.add(login);

        signup = new JButton("Signup");
        signup.setBounds(200, 200, 130, 30);
        signup.setBackground(new Color(36, 37, 42));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(36, 37, 42)));
        signup.addActionListener(this);
        p2.add(signup);

        for_pass = new JButton("Forgot Password?");
        for_pass.setBounds(130, 250, 170, 30);
        for_pass.setBackground(new Color(36, 37, 42));
        for_pass.setForeground(Color.WHITE);
        for_pass.setBorder(new LineBorder(new Color(36, 37, 42)));
        for_pass.addActionListener(this);
        p2.add(for_pass);

        JLabel text = new JLabel("Trouble logging in?");
        text.setBounds(300, 250, 150, 20);
        text.setForeground(new Color(68, 189, 50));
        p2.add(text);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            
        }else if(ae.getSource() == signup){
            setVisible(false);
            new Signup();
        }else {
            setVisible(false);
            new ForgetPassword();
        }
    }

    public static void main(String args[]) {
        new Login();
    }

}
