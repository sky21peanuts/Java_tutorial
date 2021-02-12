import javax.swing.*;

public class ExtendsSample extends JFrame{
    JFrame frame;

    ExtendsSample(){
        JButton button = new JButton("Click");
        button.setBounds(250, 150, 100, 50);

        add(button);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new ExtendsSample();
    }
}
