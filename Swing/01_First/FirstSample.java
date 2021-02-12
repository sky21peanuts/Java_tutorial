import javax.swing.*;

public class FirstSample{
    public static void main(String[] args){
        JFrame frame = new JFrame();

        JButton button = new JButton("Click");
        button.setBounds(250, 150, 100, 50);

        frame.add(button);

        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
