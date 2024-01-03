import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YourClass {
    private static JTextArea receiptArea;
    private static int[][] cart;  // Assuming cart is a 2D array
    private static String[] fMenu;  // Assuming fMenu is an array of strings
    private static int[] pMenu;  // Assuming pMenu is an array of integers

    public static void main(String[] args) {
        // Initialize your variables (fMenu, pMenu, etc.)
        fMenu = new String[]{"Item1", "Item2", "Item3"};
        pMenu = new int[]{10, 20, 30};
        cart = new int[fMenu.length][2];  // Initialize cart with the same length as fMenu

        // Initialize receiptArea (assuming it's a JTextArea)
        receiptArea = new JTextArea();

        // Add receiptArea to a JScrollPane if needed
        JScrollPane scrollPane = new JScrollPane(receiptArea);

        // Create a button
        JButton updateButton = new JButton("Update Receipt");

        // Add an ActionListener to the button
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button click event
                updateReceipt();
            }
        });

        // Create a panel to hold the button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(updateButton);

        // Create a frame to hold the components
        JFrame frame = new JFrame("Receipt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); // Set layout to BorderLayout
        frame.add(scrollPane, BorderLayout.CENTER); // Add scrollPane to the center
        frame.add(buttonPanel, BorderLayout.PAGE_END); // Add button panel to the bottom
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private static void updateReceipt() {
        // Your existing code to update the receiptArea
        for (int i = 0; i < cart.length; i++) {
            if (cart[i][1] > 0) {
                receiptArea.append(fMenu[i] + " - x" + cart[i][1] + " * " + pMenu[i] + " = " + (cart[i][1] * pMenu[i]) + "\n");
            }
        }

        // Display all array data after updating the receipt
        displayArrayData();
    }

    private static void displayArrayData() {
        // Display all array data
        // Modify this part based on your array structures
        receiptArea.append("\nArray Data:\n");
        for (int i = 0; i < cart.length; i++) {
            receiptArea.append("Item: " + fMenu[i] + ", Quantity: " + cart[i][1] + ", Price: " + pMenu[i] + "\n");
        }
        receiptArea.append("\n");
    }
}
