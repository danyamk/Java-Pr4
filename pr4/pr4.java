package pr4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Test extends JFrame {
    JTextField win1 = new JTextField(20);
    JTextArea win2 = new JTextArea();
    Font tex = new Font("Times new roman", Font.BOLD, 28);
    JButton bt1 = new JButton("Heads");
    JButton bt2 = new JButton("Tails");
    JLabel lb1 = new JLabel("Result: 0 x 0 ");
    JLabel lb2 = new JLabel("Last Scorer: N/A");
    Label lb3 = new Label("Winner: DRAW");
    int Tails = 0;
    int Heads = 0;

    Test() {
        super("Heads and Tails");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500, 150);
        setVisible(true);
        add(bt1);
        add(bt2);
        add(lb1);
        add(lb2);
        add(lb3);
        
        bt1.addActionListener(ae ->
        {
            Heads++;
            lb2.setText("Last Flip: Heads");
            lb1.setText("Result " + Tails + " x " + Heads);
            if (Heads > Tails) {
                lb3.setText("Winner: Heads");
            } else if (Heads == Tails) {
                lb3.setText("Draw");
            } else
                lb3.setText("Winner: Tails");
        });

        bt2.addActionListener(ae -> {
            Tails++;
            lb2.setText("Last Flip: Tails");
            lb1.setText("Result " + Tails + " x " + Heads);
            if (Heads > Tails) {
                lb3.setText("Winner: Heads");
            } else if (Heads == Tails) {
                lb3.setText("Draw");
            } else
                lb3.setText("Winner: Tails");
        });
    }


    public static void main(String[] args) {
        new Test();
    }
}
