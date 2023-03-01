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

        JPanel1.setLayout(new BoxLayout(JPanel1, BoxLayout.Y_AXIS));
        JPanel2.setLayout(new BoxLayout(JPanel2, BoxLayout.Y_AXIS));

        add(JPanel1, BorderLayout.WEST);
        add(JPanel2, BorderLayout.EAST);

        JPanel1.setBackground(Color.BLUE);
        JPanel2.setBackground(Color.RED);

        setSize(400, 200);

        JButton1 = new JButton("Toggle Left");
        JButton1.setPreferredSize(new Dimension(150, 50));
        JPanel1.add(JButton1);

        JButton2 = new JButton("Toggle Right");
        JButton2.setPreferredSize(new Dimension(150, 50));
        JPanel2.add(JButton2);

        JLabel1 = new JLabel("This is the left Pane");
        JLabel2 = new JLabel("This is the right Pane");

        JPanel1.add(JLabel1);
        JPanel2.add(JLabel2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        Main m = new Main();
        m.setVisible(true);
    }
}