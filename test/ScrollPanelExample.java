import java.awt.Dimension;
import javax.swing.*;

public class ScrollPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200)); // Set preferred size for the panel

        JTextArea textArea = new JTextArea(10, 20); // Create a component to place inside the JScrollPane

        JScrollPane scrollPane = new JScrollPane(textArea); // Create the JScrollPane with the component

        panel.add(scrollPane); // Add the JScrollPane to the panel

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}