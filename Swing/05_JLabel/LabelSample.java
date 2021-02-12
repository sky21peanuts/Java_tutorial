import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelSample extends Frame implements ActionListener{
    JFrame frame;
    JTextField tf;
    JLabel label;
    JButton button;

    LabelSample(){
        tf = new JTextField();
        tf.setBounds(200, 50, 200, 20);
        label = new JLabel();
        label.setBounds(100, 100, 400, 20);
        button = new JButton("Find IP");
        button.setBounds(250, 150, 100, 30);
        frame = new JFrame("New Window");
        frame.setSize(600, 400);

        button.addActionListener(this);
        frame.add(button);
        frame.add(tf);
        frame.add(label);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        try{
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            label.setText("IP of " + host + " is : " + ip);
        }
        catch(Exception ex){
            System.out.println(ex);
                }   
    }

    public static void main(String[] args){
        new LabelSample();
    }
}
