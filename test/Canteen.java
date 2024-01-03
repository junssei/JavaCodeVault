import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.text.BadLocationException;
//import javax.swing.text.Document;

	class Canteen {
		JLabel resultLabel;
		int subtotal = 0;
		int total = 0;
		Canteen() {			
			JFrame frame = new JFrame("MCDONALD'S POINT OF SALES SYSTEM");
			frame.setLayout(new GridLayout());
			frame.setSize(500, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JTabbedPane tabbedPane = new JTabbedPane();
			/*private boolean isValidNumber(String str){
       			return str.matches("-?\\d+(\\.\\d+)?");
    		}*/

			JLabel tabLabel1 = new JLabel("MEALS:");
			tabLabel1.setPreferredSize(new Dimension(160, 20));
			JLabel tabLabel2 = new JLabel("DRINKS:");
			tabLabel2.setPreferredSize(new Dimension(171, 20));

			JPanel tab1 = new JPanel();
			JPanel tab2 = new JPanel();
			tab1.setLayout(new GridLayout());
			tab2.setLayout(new GridLayout());

			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
     	  	panel1.setLayout(new FlowLayout());
     	  	panel2.setLayout(new GridLayout());

     	  	TextField text = new TextField();

     	  	JTextArea area=new JTextArea("Costumer 1 \nORDERS:\n");  
     	  	JTextArea area2=new JTextArea("ORDERS:\n"); 
     	  	JTextArea area3=new JTextArea("ORDERS:\n");

			//FOODS
	     	JButton checkBox1 = new JButton("Fried Chicken");
	        JButton checkBox2 = new JButton("Bihon");
	        JButton checkBox3 = new JButton("Boiled Egg");
	        JButton checkBox4 = new JButton("Hot Dog");
	        JButton checkBox5 = new JButton("Longganisa");
	        JButton checkBox6 = new JButton("Champorado");
	        JButton checkBox7 = new JButton("Rice");
	        checkBox1.setPreferredSize(new Dimension(130, 20));
	        checkBox2.setPreferredSize(new Dimension(130, 20));
	        checkBox3.setPreferredSize(new Dimension(130, 20));
	        checkBox4.setPreferredSize(new Dimension(130, 20));
	        checkBox5.setPreferredSize(new Dimension(130, 20));
	        checkBox6.setPreferredSize(new Dimension(130, 20));
	        checkBox7.setPreferredSize(new Dimension(130, 20));
	        
	        //DRINKS
	        int price1 = 15;
	        JButton box1 = new JButton("Coke(Mismo)");
	        JButton box2 = new JButton("Lemon(Bottled)");
	        JButton box3 = new JButton("Orange(Bottled)");
	        JButton box4 = new JButton("C2");
	        JButton box5 = new JButton("Water(Bottled)");
	        JButton box6 = new JButton("Mountain Dew");
	        box1.setPreferredSize(new Dimension(130, 20));
	        box2.setPreferredSize(new Dimension(130, 20));
	        box3.setPreferredSize(new Dimension(130, 20));
	        box4.setPreferredSize(new Dimension(130, 20));
	        box5.setPreferredSize(new Dimension(130, 20));
	        box6.setPreferredSize(new Dimension(130, 20));	
	        JButton checkout = new JButton("Checkout");
	        checkout.setPreferredSize(new Dimension(171, 30));
       		
	    	//panels
	        {
	        frame.add(tabbedPane);
	        tabbedPane.addTab("Cashier",tab1);
	    	tabbedPane.addTab("Costumer",tab2);
	        tab1.add(panel1);
	        tab1.add(panel2);
			panel1.add(tabLabel1);
			panel1.add(checkBox1);
	        panel1.add(checkBox2);
	        panel1.add(checkBox3);
	        panel1.add(checkBox4);
	        panel1.add(checkBox5);
	        panel1.add(checkBox6);
			panel1.add(checkBox7);
			panel1.add(tabLabel2);
			panel1.add(box1);
	        panel1.add(box2);
	        panel1.add(box3);
	        panel1.add(box4);
	        panel1.add(box5);
			panel1.add(box6);
			panel1.add(checkout);
			panel2.add(area);
			tab2.add(area2);
		}
	        //Foods Events
	       	checkBox1.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
      
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);            		       		
            		String quantity = text.getText();  
            		counter =Integer.parseInt(quantity);
            	area.append("Fried Chicken x" + quantity + "\n");
            	area2.append("Fried Chicken x" + quantity + "\n");
            	area3.append("Fried Chicken x" + quantity + "\n");
  				subtotal = counter * price1;
          		  }	 
       		 });
			checkBox2.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {            		
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Bihon x" + quantity + "\n");
            	area2.append("Bihon x" + quantity + "\n");
            	area3.append("Bihon x" + quantity + "\n");
            	// counter +=Integer.parseInt(quantity);
          		  }
       		 });
			checkBox3.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Boiled Egg x" + quantity + "\n");
            	area2.append("Boiled Egg x" + quantity + "\n");
            	area3.append("Boiled Egg x" + quantity + "\n");
            	//counter +=Integer.parseInt(quantity);
          		  }
       		 });
			checkBox4.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Hot Dog x" + quantity + "\n");
            	area2.append("Hot Dog x" + quantity + "\n");
            	area3.append("Hot Dog x" + quantity + "\n");
          //  	counter +=Integer.parseInt(quantity);
          		  }
       		 });
			checkBox5.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Longganisa x" + quantity + "\n");
            	area2.append("Longganisa x" + quantity + "\n");
            	area3.append("Longganisa x" + quantity + "\n");

            	//counter +=Integer.parseInt(quantity);
          		  }
       		 });
			checkBox6.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Champorado x" + quantity + "\n");
            	area2.append("Champorado x" + quantity + "\n");
            	area3.append("Champorado x" + quantity + "\n");
            	//counter +=Integer.parseInt(quantity);
          		  }
       		 });
			checkBox7.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Rice x" + counter + "\n");
            	area2.append("Rice x" + counter + "\n");
            	area3.append("Rice x" + counter + "\n");
          		  }
       		 });
	        
	        //Drinks events
			box1.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Coke(Mismo)" + counter + "\n");
            	area2.append("Coke(Mismo)" + counter + "\n");
            	area3.append("Coke(Mismo)" + counter + "\n");
            	
          		  }
       		 });
			box2.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Lemon(Bottled) x" + counter + "\n");
            	area2.append("Lemon(Bottled) x" + counter + "\n");
            	area3.append("Lemon(Bottled) x" + counter + "\n");
          		  }
       		 });
			box3.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Orange(Bottled) x" + counter + "\n");
            	area2.append("Orange(Bottled) x" + counter + "\n");
            	area3.append("Orange(Bottled) x" + counter + "\n");
          		  }
       		 });
			box4.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("C2 x" + counter + "\n");
            	area2.append("C2 x" + counter + "\n");
            	area3.append("C2 x" + counter + "\n");
          		  }
       		 });
			box5.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Water(Bottled) x" + counter + "\n");
            	area2.append("Water(Bottled) x" + counter + "\n");
            	area3.append("Water(Bottled) x" + counter + "\n");
          		  }
       		 });
			box6.addActionListener(new ActionListener() {
				int counter = 0;
            	public void actionPerformed(ActionEvent ae) {
            		JOptionPane.showMessageDialog(frame, text, "Quantity", JOptionPane.INFORMATION_MESSAGE);           		
            		String quantity = text.getText();
            		counter =Integer.parseInt(quantity);
            	area.append("Mountain Dew x" + counter + "\n");
            	area2.append("Mountain Dew x" + counter + "\n");
            	area3.append("Mountain Dew x" + counter + "\n");
            
          		  }
       		 });
   			 
	        checkout.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
	            	int counter = 2;
	                StringBuilder selectedOptions = new StringBuilder("Selected options: ");
	               area.append("\nCostumer" + counter + "\nORDER:\n");
	               counter++;
	                JOptionPane.showMessageDialog(frame, area3, "Invoice", JOptionPane.INFORMATION_MESSAGE);
	                area2.setText(null);
	                area3.setText(null);
	            }
	        });

			

			frame.setVisible(true);
		}
		public static void main(String [] args) {
			SwingUtilities.invokeLater(new Runnable(){
				public void run() {
					new Canteen();
				}
			});
		}
	}