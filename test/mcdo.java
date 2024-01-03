import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    class mcdo {
            JLabel totalDisp = new JLabel();
            String itemname = null;
            double itemprice = 0.0;
        //ARRAY OF ITEMNAME
            String breakfast[]={"Cheesy Eggdesal", "Sausage Muffin", "Hash Browns", "Sausage Platter"};
            String burgers[]={"Big Mac", "Burger Deluxe", "Chicken Sandwich", "Cheese Burger"};
            String drinks[]={"Pineapple Juice Drink", "Orange Juice", "Coke McFloat", "Hot Caramel Sundae"};
            String fries[]={"Regular", "Medium", "Large", "BFF Fries"};

            int subtotal;
            int total;
            int number = 0;

        //ARRAY OF INVENTORY QUANTITY
            int bstock1[]={100, 100, 100, 100};
            int bfstock1[]={100, 100, 100, 100};
            int dstock1[]={100, 100, 100, 100};
            int fstock1[]={100, 100, 100, 100};

        //ARRAY OF MENU PRICES
            double bstock[]={42, 69, 70, 58};
            double bfstock[]={80, 105, 68, 60};
            double dprice[]={50, 45, 38, 60};
            double fstock[]={75, 90, 125, 155};

            private boolean isValidNumber(String str){
            return str.matches("-?\\d+(\\.\\d+)?");}

        mcdo() {
            JFrame frame = new JFrame("MCDONALD'S POINT OF SALES SYSTEM");
            frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.setVisible(true);
        //TABBEDPANE FOR CASHIER & KITCHEN
            JTabbedPane tabbedPane = new JTabbedPane();
        //TAB FOR CASHIER
            JPanel main = new JPanel();
            main.setLayout(new BorderLayout(5,0));
            tabbedPane.addTab("CASHIER", main);
        //TAB FOR KITCHEN
            JPanel main1 = new JPanel();
            main1.setLayout(new BorderLayout(5,0));
            tabbedPane.addTab("KITCHEN", main1);
        //PANEL FOR MENU
            JPanel tab1 = new JPanel();
            tab1.setLayout(null);
            tab1.setBackground(Color.red);
            tab1.setPreferredSize(new Dimension(500,0));
        //PANEL FOR 
            JPanel tab2 = new JPanel();
            tab2.setLayout(new BorderLayout(10,0));
            tab2.setPreferredSize(new Dimension(500,500));
        //PANEL FOR ORDER
            JPanel tab3 = new JPanel();
            tab3.setBackground(Color.green);
            tab3.setPreferredSize(new Dimension(250,250));

            JPanel tab4 = new JPanel();
            tab4.setPreferredSize(new Dimension(250,250));
        //PANEL FOR TOTAL/CASH/CHECKOUT
            JPanel tab5 = new JPanel();
            tab5.setBackground(Color.blue);
            tab5.setPreferredSize(new Dimension(80, 200));
        //LABEL FOR MENU
            JLabel label1 = new JLabel("[MENU]");
            label1.setBounds(205, 0, 150, 50);
            tab1.add(label1);
            label1.setFont(new Font("Arial Black", Font.PLAIN, 25));
        //LABEL FOR ORDER
            JLabel label2 = new JLabel("[ORDER]");
            tab4.add(label2);
            label2.setFont(new Font("Arial Black", Font.PLAIN, 25));
            tab4.setBackground(Color.yellow);
        //LABEL FOR MIX&MATCH
            JLabel label3 = new JLabel("MIX & MATCH");
            label3.setBounds(140, 380, 500, 50);
            tab1.add(label3);
            label3.setFont(new Font("Arial Black", Font.PLAIN, 25));
        //LABEL FOR STEP1
            JLabel label4 = new JLabel("STEP 1: MAIN");
            label4.setBounds(30, 450, 500, 50);
            tab1.add(label4);
            label4.setFont(new Font("Arial Black", Font.PLAIN, 20));
        //LABEL FOR STEP2
            JLabel label5 = new JLabel("STEP 2: ADD-ONS");
            label5.setBounds(270, 450, 500, 50);
            tab1.add(label5);
            label5.setFont(new Font("Arial Black", Font.PLAIN, 20));
        //LABEL FOR QUANTITY
            JLabel label6 = new JLabel("QUANTITY:");
            label6.setFont(new Font("Arial Black", Font.PLAIN, 20));
            tab1.add(label6);
            label6.setBounds(90, 655, 400, 50);
            JTextField tf = new JTextField();
            tab1.add(tf);
            tab1.setLayout(null);
            tf.setBounds(230, 670, 150, 25);
        //LABEL FOR CASH
            JLabel label7 = new JLabel("CASH:");
            label7.setFont(new Font("Arial Black", Font.PLAIN, 40));
            tab5.add(label7);
            label7.setBounds(660, 80, 150, 50);
            JTextField tf1 = new JTextField();
            tab5.add(tf1);
            tab5.setLayout(null);
            tf1.setBounds(800, 90, 150, 40);
        //LABEL FOR TOTAL
            JLabel label8 = new JLabel("TOTAL:");
            label8.setFont(new Font("Arial Black", Font.PLAIN, 40));
            tab5.add(label8);
            label8.setBounds(1150, 80, 200, 50);

        //BREAKFAST BUTTON
            JLabel label9 = new JLabel("BREAKFAST");
            label9.setFont(new Font("Arial Black", Font.PLAIN, 15));
            tab1.add(label9);
            label9.setBounds(65, 60, 130, 25);

            JButton button = new JButton("Cheezy Eggdesal");
            label1.add(button);
            button.setBounds(50, 90, 130, 25);
            tab1.add(button);
            button.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button1 = new JButton("Sausage Muffin");
            label1.add(button1);
            button1.setBounds(50, 120, 130, 25);
            tab1.add(button1);
            button1.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button2 = new JButton("Hash Browns");
            label1.add(button2);
            button2.setBounds(50, 150, 130, 25);
            tab1.add(button2);
            button2.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button3 = new JButton("Sausage Platter");
            label1.add(button3);
            button3.setBounds(50, 180, 130, 25);
            tab1.add(button3);
            button3.setFont(new Font("Arial Black", Font.PLAIN, 10));

        //BURGER BUTTON
            JLabel label10 = new JLabel("BURGERS");
            label10.setFont(new Font("Arial Black", Font.PLAIN, 15));
            tab1.add(label10);
            label10.setBounds(350, 60, 130, 25);

            JButton button4 = new JButton("Big Mac");
            label10.add(button4);
            button4.setBounds(326, 90, 130, 25);
            tab1.add(button4);
            button4.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button5 = new JButton("Burger Deluxe");
            label10.add(button5);
            button5.setBounds(326, 120, 130, 25);
            tab1.add(button5);
            button5.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button6 = new JButton("Chicken Sandwich");
            label10.add(button6);
            button6.setBounds(326, 150, 130, 25);
            tab1.add(button6);
            button6.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button7 = new JButton("Cheese Burger");
            label10.add(button7);
            button7.setBounds(326, 180, 130, 25);
            tab1.add(button7);
            button7.setFont(new Font("Arial Black", Font.PLAIN, 10));

        //DRINKS BUTTON
            JLabel label11 = new JLabel("DRINKS");
            label11.setFont(new Font("Arial Black", Font.PLAIN, 15));
            tab1.add(label11);
            label11.setBounds(80, 210, 130, 25);

            JButton button8 = new JButton("Pineapple Juice Drink");
            label11.add(button8);
            button8.setBounds(50, 240, 130, 25);
            tab1.add(button8);
            button8.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button9 = new JButton("Orange Juice");
            label11.add(button9);
            button9.setBounds(50, 270, 130, 25);
            tab1.add(button9);
            button9.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button10 = new JButton("Coke McFloat");
            label11.add(button10);
            button10.setBounds(50, 300, 130, 25);
            tab1.add(button10);
            button10.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button11 = new JButton("Hot Caramel Sundae");
            label11.add(button11);
            button11.setBounds(50, 330, 130, 25);
            tab1.add(button11);
            button11.setFont(new Font("Arial Black", Font.PLAIN, 10));    

        //FRIES BUTTON
            JLabel label12 = new JLabel("FRIES");
            label12.setFont(new Font("Arial Black", Font.PLAIN, 15));
            tab1.add(label12);
            label12.setBounds(370, 210, 130, 25);

            JButton button12 = new JButton("REGULAR");
            label12.add(button12);
            button12.setBounds(326, 240, 130, 25);
            tab1.add(button12);
            button12.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button13 = new JButton("LARGE");
            label12.add(button13);
            button13.setBounds(326, 270, 130, 25);
            tab1.add(button13);
            button13.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button14 = new JButton("EXTRA");
            label12.add(button14);
            button14.setBounds(326, 300, 130, 25);
            tab1.add(button14);
            button14.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button15 = new JButton("BFF FRIES");
            label12.add(button15);
            button15.setBounds(326, 330, 130, 25);
            tab1.add(button15);
            button15.setFont(new Font("Arial Black", Font.PLAIN, 10));

        //MIX & MATCH BUTTON
            JButton button16 = new JButton("Cheesy Burger Alaking");
            label12.add(button16);
            button16.setBounds(40, 500, 130, 25);
            tab1.add(button16);
            button16.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button17 = new JButton("McCrispy Chicken Alaking");
            label12.add(button17);
            button17.setBounds(40, 530, 130, 25);
            tab1.add(button17);
            button17.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button18 = new JButton("McSpaghetti");
            label12.add(button18);
            button18.setBounds(40, 560, 130, 25);
            tab1.add(button18);
            button18.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button19 = new JButton("Regular Fries");
            label12.add(button19);
            button19.setBounds(300, 500, 130, 25);
            tab1.add(button19);
            button19.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button20 = new JButton("Coke McFloat");
            label12.add(button20);
            button20.setBounds(300, 530, 130, 25);
            tab1.add(button20);
            button20.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button21 = new JButton("Iced Tea");
            label12.add(button21);
            button21.setBounds(300, 560, 130, 25);
            tab1.add(button21);
            button21.setFont(new Font("Arial Black", Font.PLAIN, 10));

            JButton button22 = new JButton("ADD");
            tab1.add(button22);
            button22.setBounds(190, 720, 100, 40);

            ButtonGroup step = new ButtonGroup();

            JRadioButton lrb = new JRadioButton("(L)");
            lrb.setFont(new Font("Arial Black", Font.PLAIN, 12));
            lrb.setBounds(410, 590, 45, 30);  
            lrb.setBackground(Color.red);
            tab1.add(lrb);           
            tab1.setSize(400, 500);
            step.add(lrb);

            JRadioButton mrb = new JRadioButton("(M)");
            mrb.setFont(new Font("Arial Black", Font.PLAIN, 12));
            mrb.setBounds(350, 590, 50, 30);  
            mrb.setBackground(Color.red);
            tab1.add(mrb);           
            tab1.setSize(400, 500);
            step.add(mrb);

            JRadioButton srb = new JRadioButton("(S)");
            srb.setFont(new Font("Arial Black", Font.PLAIN, 12));
            srb.setBounds(295, 590, 45, 30);  
            srb.setBackground(Color.red);
            tab1.add(srb);           
            tab1.setSize(400, 500);
            step.add(srb);

            JTextArea ta = new JTextArea();

            button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               itemname = breakfast[3];
               itemprice = bstock[3];
               String quantitytf = tf.getText();
               if(isValidNumber(quantitytf)){
                    int quantity = Integer.parseInt(quantitytf);
                        if (button.isSelected()) {
                            subtotal += itemprice*quantity;
                            totalDisp.setText("Total: " + subtotal);
                            ta.append(itemprice + " x " + quantity + " - " + itemname + " - Cheesy Eggdesal");
                        }else if (button1.isSelected()){
                            itemprice += 10;
                            subtotal += itemprice*quantity;
                            totalDisp.setText("Total: " + subtotal);
                            ta.append(itemprice + " x " + quantity + " - " + itemname + " - Sausage Muffin");
                        }else if(button2.isSelected()){
                            itemprice += 20;
                            subtotal += itemprice*quantity;
                            totalDisp.setText("Total: " + subtotal);
                            ta.append(itemprice + " x " + quantity + " - " + itemname + " - Hash Browns");   
                        }else if(button3.isSelected()){
                            itemprice += 30;
                            subtotal += itemprice*quantity;
                            totalDisp.setText("Total: " + subtotal);
                            ta.append(itemprice + " x " + quantity + " - " + itemname + " - Sausage Platter");    
                        } else {
                            JOptionPane.showMessageDialog(null, "Choose an Option");
                        }

                        itemname = null;
                        itemprice = 0.0;
                        
                        }else {
                            JOptionPane.showMessageDialog(null, "Please enter a quantity/select an item");
                        }step.clearSelection(); ta.requestFocus(); ta.setText(null);
                    }
                });   

                frame.add(tabbedPane, BorderLayout.CENTER);
                main.add(tab1, BorderLayout.WEST);
                main.add(tab2, BorderLayout.CENTER);
                tab2.add(tab4, BorderLayout.CENTER);
                main.add(tab5, BorderLayout.PAGE_END);
            }
            public static void main(String [] args) {
                SwingUtilities.invokeLater(new Runnable(){
                    public void run() {
                        new mcdo();
                    }
                });
            }
        }

        /*else if (button1.isSelected()) {
                    selectedOption.append("Sausage Muffin");
                } else if (button2.isSelected()) {
                    selectedOption.append("Hash Browns");
                } else if (button3.isSelected()) {
                    selectedOption.append("Sausage Platter");
                } else if (button4.isSelected()) {
                    selectedOption.append("Big Mac");
                } else if (button5.isSelected()) {
                    selectedOption.append("Burger Deluxe");
                } else if (button6.isSelected()) {
                    selectedOption.append("CheeseBurger");
                } else if (button7.isSelected()) {
                    selectedOption.append("Chicken Sandwich");
                } else if (button8.isSelected()) {
                    selectedOption.append("Pineapple Juice");
                } else if (button9.isSelected()) {
                    selectedOption.append("Orange Juice");
                } else if (button10.isSelected()) {
                    selectedOption.append("Coke McFloat");
                } else if (button11.isSelected()) {
                    selectedOption.append("Hot Caramel Sundae");
                } else if (button12.isSelected()) {
                    selectedOption.append("Regular");
                } else if (button13.isSelected()) {
                    selectedOption.append("Medium");
                } else if (button14.isSelected()) {
                    selectedOption.append("Large");
                } else if (button15.isSelected()) {
                    selectedOption.append("BFF Fries");
                }  else{*/
                   // No option selected