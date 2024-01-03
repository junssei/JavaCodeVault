import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.*;
import java.awt.*;

class main {
    private boolean isValidNumber(String str){
        return str.matches("-?\\d+(\\.\\d+)?");}

    private static JButton createColoredButton(String text, Color color, Color foreground) {
        JButton button = new JButton(text);
        button.setBackground(color);
        button.setForeground(foreground);

        return button;
    }

    private static JLabel fontNforeground(String text, String font,  int size, String weights, Color foreground){
        JLabel label = new JLabel(text);

        if(weights == "BOLD")
            label.setFont(new Font(font, Font.BOLD, size));
        else
            label.setFont(new Font(font, Font.PLAIN, size));

        label.setForeground(foreground);

        return label;
    }

    //Decleration
        JTextArea receiptArea;
        JTextArea orderedArea;
        JTextArea textARB;
        double itmTotal;
        JLabel totalDisp;
        String itemName = null;
        int customer = 1, counter = 0;
        Double itemPrice = 0.0, subtotal = 0.0;
        String fMenu[] = { //Menu Food
            "RM Siomai", "RM Beef Hotdog", "RM Pancit Canton", "RM Chicken Hotdog", //0, 1, 2, 3
            "Pan-Q Isaw", "Pan-Q Beef Hotdog", "Pan-Q Chicken Hotdog", //4, 5, 6
            "CI Pecho", "CI Paa", //7, 8
            "FS Mango", "FS Durian", //9, 10, 11 ,12, 13, 14
            "Coke", "Sprite", "Cobra", "Water"};
        Double pMenu[] = {  //Menu Price
            60.0, 59.0, 69.0, 59.0,
            20.0, 30.0, 30.0,
            120.0, 95.0,
            50.0, 50.0,
            25.0, 25.0, 25.0, 20.0};

        // Get the current date
            Date currentDate = new Date();

        // Format the date using SimpleDateFormat
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = dateFormat.format(currentDate);
    //Colors
        String hexColor1 = "#8C2F39", hexColor2 = "#B23A48", hexColor3 = "#FCB9B2", hexColor4 = "#2E4052", hexColor5 = "#611C35";
        String hexColor6 = "#FFFFFF";
        Color bgColor1 = Color.decode(hexColor1);
        Color bgColor2 = Color.decode(hexColor2);
        Color bgColor3 = Color.decode(hexColor3);
        Color bgColor4 = Color.decode(hexColor4);
        Color bgColor5 = Color.decode(hexColor5);
        Color bgColor6 = Color.decode(hexColor6);

    main(){
        JFrame frame = new JFrame("PANQ CPARK");
    //Frame Tabs
        frame.setLayout(new BorderLayout(5, 0));
        JTabbedPane frameTabs = new JTabbedPane();
        JPanel tab1 = new JPanel(); JPanel tab2 = new JPanel();
        frameTabs.addTab("Front", tab1); frameTabs.addTab("Receipt", tab2);
        tab1.setLayout(new GridLayout(1,0)); tab2.setLayout(null);
        frameTabs.setFont(new Font("Roboto Mono",Font.BOLD,20));
    //Tab 1 Panels
        JPanel main1 = new JPanel();
        JPanel main2 = new JPanel();
        JPanel panelTop = new JPanel();
        JPanel panelMenu = new JPanel();
        JPanel panelOrder = new JPanel();
        JPanel panelOrderAdd = new JPanel();
        JPanel panelOrderList = new JPanel();
    //Tab 1 Set Size
        panelMenu.setPreferredSize(new Dimension(450,100));
        panelTop.setPreferredSize(new Dimension(300, 100));
        panelOrderAdd.setPreferredSize(new Dimension(0,250));
        panelOrderList.setPreferredSize(new Dimension(0,100));
    //Tab 1 Setting Layout
        main1.setLayout(new BorderLayout(1,0));
        panelOrderAdd.setLayout(null);
        panelTop.setLayout(new GridLayout(1,0));
        panelOrder.setLayout(new BorderLayout(1,0));
        panelOrderList.setLayout(new BorderLayout(1,0));
    //Tab 1 Layout Position
        tab1.add(main1);
        main1.add(panelMenu, BorderLayout.WEST);
        main1.add(panelOrder, BorderLayout.CENTER);
        main1.add(panelTop, BorderLayout.PAGE_START);
        panelOrder.add(panelOrderList, BorderLayout.CENTER);
        panelOrder.add(panelOrderAdd, BorderLayout.PAGE_END);
    //Tab 1 Top Panel
        JLabel ts = new JLabel("CASHIER");
            ts.setForeground(bgColor3);
            ts.setHorizontalAlignment(JLabel.CENTER);
            ts.setFont(new Font("Roboto Mono",Font.BOLD,50)); panelTop.add(ts);
    //Tab 1 List Panel
        JPanel panelOrderedList1 = new JPanel(); //left top page start
            panelOrderedList1.setLayout(null);
            panelOrderedList1.setOpaque(false);
            panelOrderedList1.setPreferredSize(new Dimension(450,100));
        JPanel panelOrderedList2 = new JPanel(); //left
            panelOrderedList2.setOpaque(false);
            panelOrderedList2.setLayout(new BorderLayout(1,0));
            panelOrderedList2.setPreferredSize(new Dimension(690,100));
        JPanel panelOrderedList3 = new JPanel(); //right
            panelOrderedList3.setOpaque(false);
            panelOrderedList3.setLayout(new BorderLayout(1,0));
            panelOrderedList3.setPreferredSize(new Dimension(450,100));
        JPanel panelOrderedList4 = new JPanel(); //right top page start
            panelOrderedList4.setLayout(null);
            panelOrderedList4.setOpaque(false);
            panelOrderedList4.setPreferredSize(new Dimension(450,100));

        JLabel orderedTxt = fontNforeground("FOOD ORDER", "Roboto Mono", 50, "BOLD", bgColor3);
            orderedTxt.setBounds(50, 15, 500, 50);
        orderedArea = new JTextArea();
            orderedArea.setFont(new Font("Roboto Mono",Font.PLAIN,25));
            orderedArea.setBackground(bgColor2);
            orderedArea.setEditable(false);
        JScrollPane orderedScroll = new JScrollPane(orderedArea);
            orderedScroll.setBorder(new LineBorder(bgColor2));
            orderedScroll.setPreferredSize(new Dimension(605,0));
            orderedScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        JLabel receiptTxt = fontNforeground("CHANGE", "Roboto Mono", 50, "BOLD", bgColor3);
            receiptTxt.setBounds(40, 15, 500, 50);
        receiptArea = new JTextArea();
            receiptArea.setFont(new Font("Roboto Mono",Font.PLAIN,25));
            receiptArea.setBackground(bgColor2);
            receiptArea.setEditable(false);
        JScrollPane receiptScroll = new JScrollPane(receiptArea);
            receiptScroll.setBorder(new LineBorder(bgColor2));
            receiptScroll.setPreferredSize(new Dimension(690,0));
            receiptScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            
        panelOrderedList2.add(panelOrderedList1, BorderLayout.PAGE_START); panelOrderedList1.add(orderedTxt); 
        panelOrderedList3.add(panelOrderedList4, BorderLayout.PAGE_START); panelOrderedList4.add(receiptTxt);
        panelOrderList.add(panelOrderedList2, BorderLayout.WEST); panelOrderedList2.add(orderedScroll, BorderLayout.EAST);
        panelOrderList.add(panelOrderedList3, BorderLayout.CENTER); panelOrderedList3.add(receiptScroll, BorderLayout.EAST);
    //Tab 2 Sections
            JPanel panelR = new JPanel(); //Tab2 Receipt
                panelR.setBorder(new LineBorder(bgColor2, 5));
                panelR.setLayout(new BorderLayout(1,0));
                panelR.setBounds(660, 100, 600, 800);
            JLabel labelRH = new JLabel("PAN-Q C.PARK"); //Label for Receipt Header
                labelRH.setFont(new Font("Roboto Mono",Font.BOLD,50));
                labelRH.setBounds(120, 10, 500, 100);
            JLabel labelRH1 = new JLabel("SAN MIGUEL CHILDREN'S PARK, ILIGAN CITY"); //Label for Receipt Header
                labelRH1.setFont(new Font("Roboto Mono",Font.BOLD,20));
                labelRH1.setBounds(65, 60, 500, 100); 
            JLabel labelRH2 = new JLabel("+63 997 341 5934"); //Label for Receipt Header
                labelRH2.setFont(new Font("Roboto Mono",Font.BOLD,20));
                labelRH2.setBounds(200, 90, 500, 100);
            JPanel panelRH = new JPanel(); //Receipt Header
                panelRH.setPreferredSize(new Dimension(0,200));
                panelRH.setBorder(new LineBorder(bgColor2, 0));
                panelRH.setBackground(bgColor3);
                panelRH.setLayout(null);
            JPanel panelRB = new JPanel(); //Receipt Body
                panelRB.setPreferredSize(new Dimension(450,100));
                panelRB.setBorder(new LineBorder(bgColor3, 0));
                panelRB.setBackground(bgColor3);
                panelRB.setLayout(null);
            JPanel panelIB = new JPanel();  //Inside the body
                panelIB.setBounds(45, 30, 500, 530);
                panelIB.setLayout(new BorderLayout(1,0));
            textARB = new JTextArea(); //Text Area for Receipt Body
                textARB.setFont(new Font("Roboto Mono",Font.PLAIN,20));
                textARB.setBackground(bgColor3);
                textARB.setWrapStyleWord(true);
                textARB.setEditable(false);
                textARB.setLineWrap(true);
            JScrollPane scrollRB = new JScrollPane(textARB); //Scroll for Receipt Body
                scrollRB.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                scrollRB.setBorder(new LineBorder(bgColor5, 0));
    //Tab 2 Layout Position
        tab2.add(panelR);
        panelR.add(panelRH, BorderLayout.PAGE_START);
        panelR.add(panelRB, BorderLayout.CENTER);
        panelRH.add(labelRH); panelRH.add(labelRH1); panelRH.add(labelRH2);
        panelRB.add(panelIB);
        panelIB.add(scrollRB, BorderLayout.CENTER);
    //Tab 1 - Tab 2 Adding Panel
        //quantity
        JLabel qnty = fontNforeground("QUANTITY", "Roboto Mono", 50, "BOLD", bgColor4);
            qnty.setBounds(50, 20, 1000, 100);
        JTextField qntyFld = new JTextField();
            qntyFld.setBounds(50, 125, 400, 40);
            qntyFld.setFont(new Font("Roboto Mono",Font.BOLD,20));
            totalDisp = fontNforeground("TOTAL: ", "Roboto Mono", 50, "BOLD", bgColor4);
            totalDisp.setBounds(740, 20, 1000, 100);
        //cash
        JLabel cash = fontNforeground("Cash", "Roboto Mono", 30, "BOLD", bgColor3);
            cash.setBounds(750, 120, 500, 50);
        JTextField cashFld = new JTextField();
            //cashFld.setPreferredSize(new Dimension(250, 40));
            cashFld.setBounds(860, 125, 400, 40);
            cashFld.setFont(new Font("Roboto Mono",Font.BOLD,20));
        JButton chckOut = new JButton("CHECKOUT");
            chckOut.setBounds(1290, 70, 150, 150);
            chckOut.setFont(new Font("Roboto Mono",Font.BOLD,20));
            chckOut.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String cashNum = cashFld.getText();
                    if(isValidNumber(cashNum) && counter!=0){
                        double cash = Double.parseDouble(cashNum);
                        if(cash >= subtotal){
                            double change = cash-subtotal;
                            receiptArea.setText("");
                            orderedArea.setText("");
                            receiptArea.append("Cash Amount Given: " + cash + "\n");
                            receiptArea.append("Change: P" + change + "\n");
                            
                            textARB.append("\n\nCash Amount Given: P" + cash + "\n");
                            textARB.append("Total Amount: P" + subtotal + "\n");
                            textARB.append("Change: P" + change + "\n\n\n");
                            textARB.append("\t\tCustomer " + customer + "\n");
                            textARB.append("\t\t Thank you\n");
                            textARB.append("\t    Please come again\n\n\n\t  X");
                            textARB.append(formattedDate + "X");
                            subtotal = 0.0;
                            counter = 0;
                            customer++;
                        } else {
                            JOptionPane.showMessageDialog(null, "- NOT ENOUGH MONEY -");
                        } cashFld.setText(null);
                    } else {
                        JOptionPane.showMessageDialog(null, "- CASH INPUT NEEDED/NO ORDER YET -");
                    } cashFld.setText(null);
                }
            });
            panelOrderAdd.add(totalDisp); panelOrderAdd.add(qnty);
            panelOrderAdd.add(qntyFld);   panelOrderAdd.add(cash);
            panelOrderAdd.add(cashFld);   panelOrderAdd.add(chckOut);
    //Main Whole Frame Background Color
        tab1.setBackground(bgColor5);
        tab2.setBackground(bgColor4);
        panelTop.setBackground(bgColor4);
        panelMenu.setBackground(bgColor2);
        panelOrderAdd.setBackground(bgColor2);
        panelOrderList.setBackground(bgColor2);
        panelOrderList.setBorder(new LineBorder(bgColor5, 5));
        panelMenu.setBorder(new LineBorder(bgColor5, 5));
        panelTop.setBorder(new LineBorder(bgColor5, 5));
        panelOrderAdd.setBorder(new LineBorder(bgColor5, 5));

    //Label Menu
        JLabel mn = fontNforeground("MENU", "Roboto Mono",  50, "BOLD", bgColor4);
            mn.setPreferredSize(new Dimension(400,80));
    //Rice Meal
        JLabel rm = fontNforeground("Rice Meal", "Roboto Mono",  30, "BOLD", bgColor3);
            rm.setPreferredSize(new Dimension(400,50));  
        JButton rm1 = createColoredButton("Siomai", bgColor3, bgColor4);
            rm1.setPreferredSize(new Dimension(200,40));
            rm1.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            rm1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemName = fMenu[0];
                    itemPrice = pMenu[0];
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        counter++;
                        int quantity = Integer.parseInt(sqntyFld);
                        subtotal += itemPrice*quantity;
                        totalDisp.setText("TOTAL: P" + subtotal);
                        itmTotal = itemPrice*quantity;
                        String size = "";
                        appending(size, itemName, itemPrice, quantity, itmTotal);
                        itmTotal = 0.0;
                        itemPrice = null;                     
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        JButton rm2 = createColoredButton("Beef Hotdog", bgColor3, bgColor4);
            rm2.setPreferredSize(new Dimension(200,40));
            rm2.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            rm2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemName = fMenu[1];
                    itemPrice = pMenu[1];

                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        counter++;
                        int quantity = Integer.parseInt(sqntyFld);
                        subtotal += itemPrice*quantity;
                        totalDisp.setText("TOTAL: P" + subtotal);
                        itmTotal = itemPrice*quantity;
                        String size = "";
                        appending(size, itemName, itemPrice, quantity, itmTotal);
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        JButton rm3 = createColoredButton("Pancit Canton", bgColor3, bgColor4);
            rm3.setPreferredSize(new Dimension(200,40));
            rm3.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            rm3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemPrice = pMenu[2];
                    itemName = fMenu[2];
                    
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        counter++;
                        int quantity = Integer.parseInt(sqntyFld);
                        subtotal += itemPrice*quantity;
                        totalDisp.setText("TOTAL: P" + subtotal);
                        itmTotal = itemPrice*quantity;
                        String size = "";
                        appending(size, itemName, itemPrice, quantity, itmTotal);
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } qntyFld.requestFocus();
                    qntyFld.setText(null);
                }
            });
        JButton rm4 = createColoredButton("Chicken Hotdog", bgColor3, bgColor4);
            rm4.setPreferredSize(new Dimension(200,40));
            rm4.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            rm4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemName = fMenu[3];
                    itemPrice = pMenu[3];
                    
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        counter++;
                        int quantity = Integer.parseInt(sqntyFld);
                        subtotal += itemPrice*quantity;
                        totalDisp.setText("TOTAL: P" + subtotal);
                        itmTotal = itemPrice*quantity;
                        String size = "";
                        appending(size, itemName, itemPrice, quantity, itmTotal);
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        panelMenu.add(mn);  panelMenu.add(rm);
        panelMenu.add(rm1); panelMenu.add(rm2);
        panelMenu.add(rm3); panelMenu.add(rm4);
    //Pan-Q
        JLabel pq = fontNforeground("Pan-Q", "Roboto Mono",  30, "BOLD", bgColor3);
            pq.setPreferredSize(new Dimension(400,50));
        JButton pq1 = createColoredButton("Isaw", bgColor3, bgColor4);
            pq1.setPreferredSize(new Dimension(200,40));
            pq1.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            pq1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemPrice = pMenu[4];
                    itemName = fMenu[4];
                    
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        counter++;
                        int quantity = Integer.parseInt(sqntyFld);
                        subtotal += itemPrice*quantity;
                        totalDisp.setText("TOTAL: P" + subtotal);
                        itmTotal = itemPrice*quantity;
                        String size = "";
                        appending(size, itemName, itemPrice, quantity, itmTotal);
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        JButton pq2 = createColoredButton("Beef Hotdog", bgColor3, bgColor4);
            pq2.setPreferredSize(new Dimension(200,40));
            pq2.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            pq2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemName = fMenu[5];
                    itemPrice = pMenu[5];
                    
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        counter++;
                        int quantity = Integer.parseInt(sqntyFld);
                        subtotal += itemPrice*quantity;
                        totalDisp.setText("TOTAL: P" + subtotal);
                        itmTotal = itemPrice*quantity;
                        String size = "";
                        appending(size, itemName, itemPrice, quantity, itmTotal);
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        JButton pq3 = createColoredButton("Chicken Hotdog", bgColor3, bgColor4);
            pq3.setPreferredSize(new Dimension(200,40));
            pq3.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            pq3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemName = fMenu[6];
                    itemPrice = pMenu[6];
                    
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        counter++;
                        int quantity = Integer.parseInt(sqntyFld);
                        subtotal += itemPrice*quantity;
                        totalDisp.setText("TOTAL: P" + subtotal);
                        itmTotal = itemPrice*quantity;
                        String size = "";
                        appending(size, itemName, itemPrice, quantity, itmTotal);
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        panelMenu.add(pq);  panelMenu.add(pq1);
        panelMenu.add(pq2); panelMenu.add(pq3);
    //Chicken Inasal
        ButtonGroup ciG = new ButtonGroup();
            JRadioButton cis = new JRadioButton("Solo"), ciu = new JRadioButton("Unli-Rice");
            ciG.add(cis); cis.setBackground(bgColor2); ciG.add(ciu); ciu.setBackground(bgColor2);
            cis.setFont(new Font("Roboto Mono",Font.BOLD,20)); ciu.setFont(new Font("Roboto Mono",Font.BOLD,20));
            cis.setForeground(bgColor4); ciu.setForeground(bgColor4);
        JLabel ci = fontNforeground("Chicken Inasal", "Roboto Mono",  30, "BOLD", bgColor3);
            ci.setFont(new Font("Roboto Mono",Font.BOLD,30));
            ci.setPreferredSize(new Dimension(400,50));
        JButton ci1 = createColoredButton("Pecho", bgColor3, bgColor4);
            ci1.setPreferredSize(new Dimension(200,40));
            ci1.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            ci1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemName = fMenu[7];
                    itemPrice = pMenu[7];
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        int quantity = Integer.parseInt(sqntyFld);
                            if(cis.isSelected()){
                                counter++;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Solo ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                                
                            } else if (ciu.isSelected()){
                                counter++;
                                itemPrice += 20;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Unli ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else {
                                JOptionPane.showMessageDialog(null, "- OPTION NEEDED -");
                            }
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } ciG.clearSelection(); qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        JButton ci2 = createColoredButton("Paa", bgColor3, bgColor4);
            ci2.setPreferredSize(new Dimension(200,40));
            ci2.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            ci2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemPrice = pMenu[8];
                    itemName = fMenu[8];
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        int quantity = Integer.parseInt(sqntyFld);
                            if(cis.isSelected()){
                                counter++;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Solo ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (ciu.isSelected()){
                                counter++;
                                itemPrice += 25;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Unli ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else {
                                JOptionPane.showMessageDialog(null, "- OPTION NEEDED -");
                            }
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } ciG.clearSelection(); qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        panelMenu.add(ci);
        panelMenu.add(ci1); panelMenu.add(ci2);
        panelMenu.add(cis); panelMenu.add(ciu);
    //Fruit Shake
        ButtonGroup fsG = new ButtonGroup();
            JRadioButton fsz1 = new JRadioButton("Short"); fsG.add(fsz1); fsz1.setBackground(bgColor2);
            JRadioButton fsz2 = new JRadioButton("Grande"); fsG.add(fsz2); fsz2.setBackground(bgColor2);
            JRadioButton fsz3 = new JRadioButton("Trenta"); fsG.add(fsz3); fsz3.setBackground(bgColor2);
            fsz1.setFont(new Font("Roboto Mono",Font.BOLD,20));
            fsz2.setFont(new Font("Roboto Mono",Font.BOLD,20));
            fsz3.setFont(new Font("Roboto Mono",Font.BOLD,20));
            fsz1.setForeground(bgColor4); fsz2.setForeground(bgColor4); fsz3.setForeground(bgColor4);
        JLabel fs = fontNforeground("Fruit Shake", "Roboto Mono",  30, "BOLD", bgColor3);
            fs.setFont(new Font("Roboto Mono",Font.BOLD,30));
            fs.setPreferredSize(new Dimension(400,50));
        JButton fs1 = createColoredButton("Mango", bgColor3, bgColor4);
            fs1.setPreferredSize(new Dimension(200,40));
            fs1.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            fs1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemName = fMenu[9];
                    itemPrice = pMenu[9];
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        int quantity = Integer.parseInt(sqntyFld);
                            if(fsz1.isSelected()){
                                counter++;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Short ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (fsz2.isSelected()){
                                counter++;
                                itemPrice += 10;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Grande ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (fsz3.isSelected()){
                                counter++;
                                itemPrice += 20;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Trenta ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else {
                                JOptionPane.showMessageDialog(null, "- OPTION NEEDED -");
                            }
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } fsG.clearSelection(); qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        JButton fs2 = createColoredButton("Durian", bgColor3, bgColor4);
            fs2.setPreferredSize(new Dimension(200,40));
            fs2.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            fs2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemPrice = pMenu[10];
                    itemName = fMenu[10];
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        int quantity = Integer.parseInt(sqntyFld);
                            if(fsz1.isSelected()){
                                counter++;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Short ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (fsz2.isSelected()){
                                counter++;
                                itemPrice += 10;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Grande ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (fsz3.isSelected()){
                                counter++;
                                itemPrice += 20;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "Trenta ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else {
                                JOptionPane.showMessageDialog(null, "- OPTION NEEDED -");
                            }
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } fsG.clearSelection(); qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        panelMenu.add(fs);   panelMenu.add(fs1);
        panelMenu.add(fs2);  panelMenu.add(fsz1);
        panelMenu.add(fsz2); panelMenu.add(fsz3);    
    //Drinks
        ButtonGroup nkz = new ButtonGroup();
            JRadioButton nkz1 = new JRadioButton("12oz"); nkz.add(nkz1); nkz1.setBackground(bgColor2);
            JRadioButton nkz2 = new JRadioButton("16oz"); nkz.add(nkz2); nkz2.setBackground(bgColor2);
            JRadioButton nkz3 = new JRadioButton("22oz"); nkz.add(nkz3); nkz3.setBackground(bgColor2);
            nkz1.setFont(new Font("Roboto Mono",Font.BOLD,20));
            nkz2.setFont(new Font("Roboto Mono",Font.BOLD,20));
            nkz3.setFont(new Font("Roboto Mono",Font.BOLD,20));
            nkz1.setForeground(bgColor4); nkz2.setForeground(bgColor4); nkz3.setForeground(bgColor4);
        JLabel nk = fontNforeground("Drinks", "Roboto Mono",  30, "BOLD", bgColor3);
            nk.setFont(new Font("Roboto Mono",Font.BOLD,30));
            nk.setPreferredSize(new Dimension(400,50));
        JButton nk1 = createColoredButton("Coke", bgColor3, bgColor4);
            nk1.setPreferredSize(new Dimension(200,40));
            nk1.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            nk1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemName = fMenu[11];
                    itemPrice = pMenu[11];
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        int quantity = Integer.parseInt(sqntyFld);
                            if(nkz1.isSelected()){
                                counter++;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "12oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (nkz2.isSelected()){
                                counter++;
                                itemPrice += 10;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "16oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (nkz3.isSelected()){
                                counter++;
                                itemPrice += 15;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "22oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else {
                                JOptionPane.showMessageDialog(null, "- OPTION NEEDED -");
                            }
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } nkz.clearSelection(); qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        JButton nk2 = createColoredButton("Sprite", bgColor3, bgColor4);
            nk2.setPreferredSize(new Dimension(200,40));
            nk2.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            nk2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemPrice = pMenu[12];
                    itemName = fMenu[12];
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        int quantity = Integer.parseInt(sqntyFld);
                            if(nkz1.isSelected()){
                                counter++;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "12oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (nkz2.isSelected()){
                                counter++;
                                itemPrice += 10;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "16oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (nkz3.isSelected()){
                                counter++;
                                itemPrice += 15;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "22oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else {
                                JOptionPane.showMessageDialog(null, "- OPTION NEEDED -");
                            }
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } nkz.clearSelection(); qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        JButton nk3 = createColoredButton("Cobra", bgColor3, bgColor4);
            nk3.setPreferredSize(new Dimension(200,40));
            nk3.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            nk3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemPrice = pMenu[13];
                    itemName = fMenu[13];
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        int quantity = Integer.parseInt(sqntyFld);
                            if(nkz1.isSelected()){
                                counter++;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "12oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (nkz2.isSelected()){
                                counter++;
                                itemPrice += 10;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "16oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (nkz3.isSelected()){
                                counter++;
                                itemPrice += 15;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "22oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else {
                                JOptionPane.showMessageDialog(null, "- OPTION NEEDED -");
                            }
                        itmTotal = 0.0;
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } nkz.clearSelection(); qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        JButton nk4 = createColoredButton("Water", bgColor3, bgColor4);
            nk4.setPreferredSize(new Dimension(200,40));
            nk4.setFont(new Font("Roboto Mono",Font.PLAIN,15));
            nk4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    itemName = fMenu[14];
                    itemPrice = pMenu[14];
                    String sqntyFld = qntyFld.getText();
                    if(isValidNumber(sqntyFld)){
                        int quantity = Integer.parseInt(sqntyFld);
                            if(nkz1.isSelected()){
                                counter++;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "12oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (nkz2.isSelected()){
                                counter++;
                                itemPrice += 10;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "16oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else if (nkz3.isSelected()){
                                counter++;
                                itemPrice += 15;
                                subtotal += itemPrice*quantity;
                                totalDisp.setText("TOTAL: P" + subtotal);
                                itmTotal = itemPrice*quantity;
                                String size = "22oz ";
                                appending(size, itemName, itemPrice, quantity, itmTotal);
                            } else {
                                JOptionPane.showMessageDialog(null, "- OPTION NEEDED -");
                            }
                        itemPrice = null;
                        itemName = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "- QUANTITY INPUT NEEDED -");
                    } nkz.clearSelection(); qntyFld.requestFocus(); qntyFld.setText(null);
                }
            });
        panelMenu.add(nk);   panelMenu.add(nk1);
        panelMenu.add(nk2);  panelMenu.add(nk3); 
        panelMenu.add(nk4);  panelMenu.add(nkz1);
        panelMenu.add(nkz2); panelMenu.add(nkz3);

        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(frameTabs);}

    private void appending(String size, String name, Double price, int quantity, double total){
        if(counter == 1){
            textARB.setText("");
            receiptArea.setText("");
        }
        orderedArea.append(size + name + " - P" + price + "\n");
        receiptArea.append(" x " + quantity  + " = P" + total + "\n");
        textARB.append(name + " - " + "P" + price + " x " + quantity + " = " + total + "\n");
        orderedArea.setCaretPosition(orderedArea.getDocument().getLength());
        receiptArea.setCaretPosition(receiptArea.getDocument().getLength());}

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new main();
            }
        });}}

