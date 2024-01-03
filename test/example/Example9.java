import java.awt.*;
import javax.swing.*;

class Example9 {
    Example9() {
        JFrame jfrm = new JFrame("Example 9");
        jfrm.setLayout(new BorderLayout());
        jfrm.setSize(400, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] data = new String[100]; // Creating an array for JComboBox data
        for (int i = 0; i < 100; i++) {
            data[i] = "Random Text " + i;
        }

        JComboBox<String> comboBox = new JComboBox<>(data); // Creating a JComboBox with the data array
        jfrm.add(comboBox, BorderLayout.CENTER);

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Example9();
            }
        });
    }
}
