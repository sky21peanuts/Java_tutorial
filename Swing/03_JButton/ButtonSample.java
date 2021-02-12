import javax.swing.*;
public class ButtonSample{
    public static void main(String[] args){
        JFrame frame = new JFrame("New Window");
        JButton button = new JButton("Click Here");
        button.setBounds(250, 150, 100, 50);
        frame.add(button);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
