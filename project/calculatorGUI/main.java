import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class main{
	JLabel resultlb;
	main() {
		JFrame framelb = new JFrame("Calculator");
		framelb.setLayout(new GridLayout(5, 2));
		JLabel num1lb = new JLabel("Number 1: ");
		JTextField num1Field = new JTextField();
		JLabel num2lb = new JLabel("Number 2: ");
		JTextField num2Field = new JTextField();
		resultlb = new JLabel(" Result: ");

		JButton addbtn = new JButton("+");
		JButton subbtn = new JButton("-");
		JButton mulbtn = new JButton("*");
		JButton divbtn = new JButton("/");
		JButton clsbtn = new JButton("CLS");

		addbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String num1Txt = num1Field.getText();
				String num2Txt = num2Field.getText();
				if (isValidNumber(num1Txt) && isValidNumber(num2Txt)){
					double num1 = Double.parseDouble(num1Txt);
					double num2 = Double.parseDouble(num2Txt);
					double result = num1 + num2;
					resultlb.setText(" Result: " + result);
				} else {
					resultlb.setText(" Invalid input. Please enter valid numbers.");
				}
			}
			private boolean isValidNumber(String str){
				return str.matches("-?\\d+(\\.\\d+)?");
			}
		});

		subbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String num1Txt = num1Field.getText();
				String num2Txt = num2Field.getText();
				if (isValidNumber(num1Txt) && isValidNumber(num2Txt)){
					double num1 = Double.parseDouble(num1Txt);
					double num2 = Double.parseDouble(num2Txt);
					double result = num1 - num2;
					resultlb.setText(" Result: " + result);
				} else {
					resultlb.setText(" Invalid input. Please enter valid numbers.");
				}
			}
			private boolean isValidNumber(String str){
				return str.matches("-?\\d+(\\.\\d+)?");
			}

		});

		mulbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String num1Txt = num1Field.getText();
				String num2Txt = num2Field.getText();
				if (isValidNumber(num1Txt) && isValidNumber(num2Txt)){
					double num1 = Double.parseDouble(num1Txt);
					double num2 = Double.parseDouble(num2Txt);
					double result = num1 * num2;
					resultlb.setText(" Result: " + result);
				} else {
					resultlb.setText(" Invalid input. Please enter valid numbers.");
				}
			}
			private boolean isValidNumber(String str){
				return str.matches("-?\\d+(\\.\\d+)?");
			}

		});

		divbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String num1Txt = num1Field.getText();
				String num2Txt = num2Field.getText();
				if (isValidNumber(num1Txt) && isValidNumber(num2Txt)){
					double num1 = Double.parseDouble(num1Txt);
					double num2 = Double.parseDouble(num2Txt);
					double result = num1 / num2;
					resultlb.setText(" Result: " + result);
				} else {
					resultlb.setText(" Invalid input. Please enter valid numbers.");
				}
			}
			private boolean isValidNumber(String str){
				return str.matches("-?\\d+(\\.\\d+)?");
			}
		});

		clsbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				num1Field.setText("");
				num2Field.setText("");
				resultlb.setText(" Result: ");
			}
		});

		framelb.add(num1lb);
		framelb.add(num1Field);
		framelb.add(num2lb);
		framelb.add(num2Field);
		framelb.add(addbtn);
		framelb.add(subbtn);
		framelb.add(mulbtn);
		framelb.add(divbtn);
		framelb.add(clsbtn);
		framelb.add(resultlb);
		framelb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framelb.setSize(300, 200);
		framelb.setLocationRelativeTo(null);
		framelb.setVisible(true);
	}

	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new main();
			}
		});
	}
}