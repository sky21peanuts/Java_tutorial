import javax.swing.*;
import java.awt.event.*;

public class CheckBoxSample extends JFrame implements ActionListener{
    JFrame frame;
    JLabel label;
    JCheckBox cb1, cb2, cb3;
    JButton button;

    CheckBoxSample(){
        frame = new JFrame("CheckBoxSample");
        frame.setSize(400, 400);
        label = new JLabel("Food Ordering System");
        label.setBounds(50, 50, 300, 20);
        cb1 = new JCheckBox("Pizza @ 100");
        cb1.setBounds(100, 100, 150, 20);
        cb2 = new JCheckBox("Burger @ 30");
        cb2.setBounds(100, 150, 150, 20);
        cb3 = new JCheckBox("Tea @ 10");
        cb3.setBounds(100, 200, 150, 20);
        button = new JButton("Order");
        button.setBounds(100, 250, 80, 30);
        button.addActionListener(this);
        frame.add(label);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);
        frame.add(button);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        float amount = 0;
        String msg = "";
        if(cb1.isSelected()){
            amount += 100;
            msg += "Pizza : 100\n";
        }
        if(cb2.isSelected()){
            amount += 30;
            msg += "Burger : 30\n";
        }
        if(cb3.isSelected()){
            amount += 10;
            msg += "Tea : 10\n";
        }
        msg += "-----------------\n";
        JOptionPane.showMessageDialog(this, msg + "Total : " + amount);
    }

    public static void main(String[] args){
        new CheckBoxSample();
    }
}
