import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class mainGUI {
  mainGUI(){
    JFrame frame = new JFrame();

    
  }
  public static void main(String args[]){
    SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new mainGUI();
			}
		});
  }
}
