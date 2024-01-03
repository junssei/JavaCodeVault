import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Example1 {
    Example1() {
        JFrame jfrm = new JFrame("An Example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding a JButton with a String
        JButton jButton = new JButton("Click me!");
        jfrm.add(jButton);

        // JOptionPane triggered by JButton click
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(jfrm, "Button Clicked!", "Button Click Event", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Example1();
            }
        });
    }
}
