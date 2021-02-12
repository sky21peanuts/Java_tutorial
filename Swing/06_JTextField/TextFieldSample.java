import javax.swing.*;
import java.awt.event.*;

public class TextFieldSample implements ActionListener{
    JFrame frame;
    JTextField tf1, tf2, tf3;
    JButton button1, button2;

    TextFieldSample(){
        frame = new JFrame();

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);

        button1 = new JButton("+");
        button1.setBounds(50, 200, 50, 50);
        button2 = new JButton("-");
        button2.setBounds(120, 200, 50, 50);
        button1.addActionListener(this);
        button2.addActionListener(this);

        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(button1);
        frame.add(button2);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if(e.getSource() == button1)
            c = a + b;
        else if(e.getSource() == button2)
            c = a - b;
        String result = String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String[] args){
        new TextFieldSample();
    }
}
