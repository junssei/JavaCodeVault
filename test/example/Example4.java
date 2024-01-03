import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Example4 {
    Example4() {
        JFrame jfrm = new JFrame("An Example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300, 150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");

        jfrm.add(checkBox1);
        jfrm.add(checkBox2);
        jfrm.add(checkBox3);

        JButton submitButton = new JButton("Submit");
        jfrm.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                StringBuilder selectedOptions = new StringBuilder("Selected options: ");

                if (checkBox1.isSelected()) {
                    selectedOptions.append("Option 1, ");
                }
                if (checkBox2.isSelected()) {
                    selectedOptions.append("Option 2, ");
                }
                if (checkBox3.isSelected()) {
                    selectedOptions.append("Option 3");
                }

                JOptionPane.showMessageDialog(jfrm, selectedOptions.toString(), "Selected Options", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Example4();
            }
        });
    }
}



