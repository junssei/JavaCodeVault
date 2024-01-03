import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Example5 {
    Example5() {
        JFrame jfrm = new JFrame("An Example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300, 150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        jfrm.add(radioButton1);
        jfrm.add(radioButton2);
        jfrm.add(radioButton3);

        JButton submitButton = new JButton("Submit");
        jfrm.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                StringBuilder selectedOption = new StringBuilder("Hi: ");

                if (radioButton1.isSelected()) {
                    selectedOption.append("Option 1");
                } else if (radioButton2.isSelected()) {
                    selectedOption.append("Option 2");
                } else if (radioButton3.isSelected()) {
                    selectedOption.append("Option 3");
                } else {
                    selectedOption.append("None"); // No option selected
                }

                JOptionPane.showMessageDialog(jfrm, selectedOption.toString(), "", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Example5();
            }
        });
    }
}


