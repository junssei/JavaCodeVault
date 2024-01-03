import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Example2 {
    Example2() {
        JFrame jfrm = new JFrame("An Example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jtf = new JTextField(15);
        jfrm.add(jtf);

        jtf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(jfrm, jtf.getText(), "Entered Text", JOptionPane.INFORMATION_MESSAGE);
                
            }
        });

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Example2();
            }
        });
    }
}


