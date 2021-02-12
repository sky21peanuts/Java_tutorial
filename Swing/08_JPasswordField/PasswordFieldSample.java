import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldSample{
    public static void main(String[] args){
        JFrame frame = new JFrame("Password Field Sample");
        final JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);
        final JPasswordField value = new JPasswordField();
        value.setBounds(100, 75, 100, 30);
        JLabel label1 = new JLabel("Username : ");
        label1.setBounds(20, 20, 80, 30);
        JLabel label2 = new JLabel("Password : ");
        label2.setBounds(20, 75, 80, 30);
        JButton button = new JButton("Login");
        button.setBounds(100, 120, 80, 30);
        final JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        frame.add(value);
        frame.add(label1);
        frame.add(label2);
        frame.add(label);
        frame.add(button);
        frame.add(text);
        frame.setSize(300 ,300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String data = "Username : " + text.getText();
                    data += ", Password : " + new String(value.getPassword());
                    label.setText(data);
                } 
            });
    }
}
