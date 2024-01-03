import java.awt.*;
import javax.swing.*;

class Example8 {
    Example8() {
        JFrame jfrm = new JFrame("Example 8");
        jfrm.setLayout(new BorderLayout());
        jfrm.setSize(400, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] data = new String[100]; // Creating an array for JList data
        for (int i = 0; i < 100; i++) {
            data[i] = "Random Text " + i;
        }

        JList<String> list = new JList<>(data); // Creating a JList with the data array
        JScrollPane scrollPane = new JScrollPane(list); // Creating a JScrollPane with the JList
        jfrm.add(scrollPane, BorderLayout.CENTER);

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Example8();
            }
        });
    }
}
