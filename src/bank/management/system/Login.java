package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
  JButton Login, Signup, Clear;
  JTextField CardTextField;
  JPasswordField PinTextField;
    Login(){
        setTitle("Automated Teller Machine");
         setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10, 100, 100);
        add(label);
        JLabel text = new JLabel("Welcome To Atm");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40, 400, 40);
        add(text);
        JLabel Cardno = new JLabel("Card NO:");
         Cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        Cardno.setBounds(120,150, 150, 30);
        add(Cardno);
        CardTextField = new JTextField();
        CardTextField.setBounds(300, 150, 230, 30 );
        CardTextField.setFont(new Font ("Arial", Font.BOLD,28));
        add(CardTextField);
        JLabel Pin = new JLabel("Pin:");
        Pin.setFont(new Font("Raleway", Font.BOLD, 28));
        Pin.setBounds(120,220, 250, 30);
        add(Pin);
        PinTextField = new JPasswordField();
        PinTextField.setBounds(300, 220, 230, 30 );
        PinTextField.setFont(new Font ("Arial", Font.BOLD,28));
        add(PinTextField);
         Login = new JButton("Sign In");
        Login.setBounds(300, 300, 100, 30);
        Login.setBackground(Color.BLUE);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);
        Clear = new JButton("Clear");
        Clear.setBounds(430, 300, 100, 30);
        Clear.setBackground(Color.BLUE);
        Clear.setForeground(Color.WHITE);
         Clear.addActionListener(this);
        add(Clear);
        Signup = new JButton("Sign Up");
        Signup.setBounds(300, 350, 230, 30);
        Signup.setBackground(Color.BLUE);
        Signup.setForeground(Color.WHITE);
         Signup.addActionListener(this);
        add(Signup);
        getContentPane().setBackground(Color.WHITE);
      setSize(800,600);
      setVisible(true);
      setLocation(350, 200);
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == Clear){
           CardTextField.setText("");
           PinTextField.setText("");
       } 
       else if(ae.getSource() == Login){
           
       }
       else if(ae.getSource() == Signup){
           
       }
    }
    public static void main (String args[]){
        new Login();
    }
}
