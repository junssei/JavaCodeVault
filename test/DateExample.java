import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Date Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            // Create a JLabel to display the date
            JLabel dateLabel = new JLabel("Current Date: ");
            panel.add(dateLabel);

            // Create a JLabel to display the formatted date
            JLabel formattedDateLabel = new JLabel();
            panel.add(formattedDateLabel);

            // Create a button to update the date
            JButton updateButton = new JButton("Update Date");
            updateButton.addActionListener(e -> {
                // Get the current date
                Date currentDate = new Date();

                // Format the date using SimpleDateFormat
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedDate = dateFormat.format(currentDate);

                // Set the formatted date to the label
                formattedDateLabel.setText(formattedDate);
            });
            panel.add(updateButton);

            frame.getContentPane().add(panel);
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
