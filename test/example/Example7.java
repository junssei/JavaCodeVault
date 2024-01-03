import java.awt.*;
import javax.swing.*;

class Example7 {
    Example7() {
        JFrame jfrm = new JFrame("Example 6");
        jfrm.setLayout(new BorderLayout());
        jfrm.setSize(400, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 40); // Creating a JTextArea for random text
        for (int i = 0; i < 100; i++) {
            textArea.append("Random Text " + i + "\n");
        }

        JScrollPane scrollPane = new JScrollPane(textArea); // Creating a JScrollPane with the JTextArea
        jfrm.add(scrollPane, BorderLayout.CENTER);

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Example7();
            }
        });
    }
}
