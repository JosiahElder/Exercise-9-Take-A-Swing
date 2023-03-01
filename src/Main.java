// "Exercise_9_Take_A_Swing, Ready for Marking"

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
    private JPanel JPanel1, JPanel2;
    private JButton JButton1, JButton2;
    private JLabel JLabel1, JLabel2;

    public Main()
    {
        JPanel1 = new JPanel();
        JPanel2 = new JPanel();

        setLayout(new BorderLayout());

        add(JPanel1, BorderLayout.NORTH);
        add(JPanel2, BorderLayout.CENTER);

        JButton1 = new JButton("Toggle Left");
        JButton1.setPreferredSize(new Dimension(150, 50));

        JButton2 = new JButton("Toggle Right");
        JButton2.setPreferredSize(new Dimension(150, 50));

        JLabel1 = new JLabel("This is the Left Pane");
        JLabel2 = new JLabel("This is the Right Pane");

        JPanel1.setBackground(Color.LIGHT_GRAY);
        JPanel2.setBackground(Color.RED);

        JPanel1.add(JButton1);
        JPanel1.add(JButton2);
        JPanel2.add(JLabel1);
        JPanel2.add(JLabel2);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        Main m = new Main();
        m.setVisible(true);
    }
}