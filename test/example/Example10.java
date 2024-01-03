import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

class Example10 {
    Example10() {
        JFrame jfrm = new JFrame("Example 10");
        jfrm.setLayout(new BorderLayout());
        jfrm.setSize(400, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object[][] data = new Object[10][5]; // Creating data for JTable
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                data[i][j] = "Row " + i + " Col " + j; // Sample data for JTable
            }
        }

        Object[] columnNames = new Object[5]; // Creating column names
        for (int j = 0; j < 5; j++) {
            columnNames[j] = "Column " + j; // Sample column names for JTable
        }

        JTable table = new JTable(data, columnNames); // Creating a JTable with data and column names
        JScrollPane scrollPane = new JScrollPane(table); // Wrapping JTable inside a JScrollPane
        jfrm.add(scrollPane, BorderLayout.CENTER);

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Example10();
            }
        });
    }
}




