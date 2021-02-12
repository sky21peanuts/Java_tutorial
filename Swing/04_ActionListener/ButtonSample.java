import java.awt.event.*;
import javax.swing.*;

public class ButtonSample{
    public static void main(String[] args){
        JFrame frame = new JFrame("New Window");

        final JTextField textfield = new JTextField();
        textfield.setBounds(50, 50, 150, 20);

        JButton button = new JButton("Click Here");
        button.setBounds(50, 100, 95, 30);
        button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    textfield.setText("Input here.");
                } 
            });
        frame.add(button);
        frame.add(textfield);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
