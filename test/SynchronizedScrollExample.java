import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class SynchronizedScrollExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Synchronized Scroll Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel(new GridLayout(1, 2));

            // Create the first panel with scroll pane
            JTextArea textArea1 = new JTextArea();
            JScrollPane scrollPane1 = new JScrollPane(textArea1);
            mainPanel.add(scrollPane1);

            // Create the second panel with scroll pane
            JTextArea textArea2 = new JTextArea();
            JScrollPane scrollPane2 = new JScrollPane(textArea2);
            mainPanel.add(scrollPane2);

            // Synchronize the vertical scroll positions
            scrollPane1.getVerticalScrollBar().addAdjustmentListener(new ScrollSynchronizer(scrollPane2));
            scrollPane2.getVerticalScrollBar().addAdjustmentListener(new ScrollSynchronizer(scrollPane1));

            frame.getContentPane().add(mainPanel);
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static class ScrollSynchronizer implements AdjustmentListener {
        private final JScrollPane targetScrollPane;

        public ScrollSynchronizer(JScrollPane targetScrollPane) {
            this.targetScrollPane = targetScrollPane;
        }

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            // Synchronize the vertical scroll positions
            targetScrollPane.getVerticalScrollBar().setValue(e.getValue());
        }
    }
}
