import java.awt.*;
import javax.swing.*;

class Example6 {
    Example6() {
        JFrame jfrm = new JFrame("Example 5");
        jfrm.setLayout(new BorderLayout());
        jfrm.setSize(400, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel tab1 = new JPanel();
        JLabel tabLabel1 = new JLabel("This is Tab 1");
        tab1.add(tabLabel1);

        JPanel tab2 = new JPanel();
        JLabel tabLabel2 = new JLabel("Text for Tab 2");
        tab2.add(tabLabel2);
        tabbedPane.addTab("Tab 2", tab2);

        jfrm.add(tabbedPane, BorderLayout.CENTER);

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Example6();
            }
        });
    }
}
