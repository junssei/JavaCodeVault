import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class mainGUI {
  mainGUI(){
    JFrame frame = new JFrame();
    
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setSize(1000, 800);
		frame.setVisible(true);
  }
  public static void main(String args[]){
    SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new mainGUI();
			}
		});
  }
}
