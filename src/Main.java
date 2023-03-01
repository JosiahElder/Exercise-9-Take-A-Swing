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

        add(JPanel1, BorderLayout.WEST);
        add(JPanel2, BorderLayout.EAST);

        JPanel1.setBackground(Color.BLUE);
        JPanel2.setBackground(Color.RED);
    }

    public static void main(String[] args)
    {
        Main m = new Main();
        m.setVisible(true);
    }
}