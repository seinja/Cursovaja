import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class mainWindowOne extends Frame {
        public static JTextField countFieldOne;
        public static JTextField poweFieldOne;
        public static JTextField kiFieldOne;
        public static JTextField cosfFieldOne;
        public static JTextField countFieldTwo;
        public static JTextArea descriptionArea;
        public static JTextField poweFieldTwo;
        public static JTextField kiFieldTwo;
        public static JTextField cosfFieldTwo;
        public static JTextField countFieldTree;
        public static JTextField poweFieldTree;
        public static JTextField kiFieldTree;
        public static JTextField cosfFieldTree;

        public static JTextField endcountTxt;
        public static JTextField endPniTxt;
        public static JTextField endPnTxt;
        public static JTextField endKiTxt;
        public static JTextField endcosfTxt;
        public static JTextField endtgnfTxt;
        public static JTextField endKiPnTxt;
        public static JTextField endKiPnTngfTxt;
        public static JTextField endNpipowtwoTxt;
        public static JTextField endCountEfectTxt;
        public static JTextField endKpTxt;
        public static JTextField endPpTxt;
        public static JTextField endQpTxt;
        public static JTextField endSpTxt;
        public static JTextField endIpTxt;


        public static void windowWithOneItem(int W, int H) {

            Font f = new Font("Arrial", Font.BOLD, 14);


            JPanel endLblPanel = new JPanel();
            endLblPanel.setSize(800,200);
            endLblPanel.setLayout(new BoxLayout(endLblPanel,BoxLayout.X_AXIS));

            JLabel itog = new JLabel("Итого");
            itog.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endcountLbl = new JLabel("∑n");
            endcountLbl.setBorder(BorderFactory.createEmptyBorder(5,40,5,20));

            JLabel endPniLbl = new JLabel("Pni");
            endPniLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endPnLbl = new JLabel("∑Pni");
            endPnLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endKiLbl = new JLabel("Ki");
            endKiLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endcosfLbl = new JLabel("CosF");
            endcosfLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endtgnfLbl = new JLabel("TngF");
            endtgnfLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endKiPnLbl = new JLabel("KiPn");
            endKiPnLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endKiPnTngfLbl = new JLabel("KiPnTngf");
            endKiPnTngfLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,15));

            JLabel endNpipowtwoLbl = new JLabel("Npi^2");
            endNpipowtwoLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endCountEfectLbl = new JLabel("Nэ");
            endCountEfectLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endKpLbl = new JLabel("Kp");
            endKpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endPpLbl = new JLabel("Pp");
            endPpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endQpLbl = new JLabel("Qp");
            endQpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endSpLbl = new JLabel("Sp");
            endSpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endIpLbl = new JLabel("Ip");
            endIpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));


            endLblPanel.add(endcountLbl);
            endLblPanel.add(endPniLbl);
            endLblPanel.add(endPnLbl);
            endLblPanel.add(endKiLbl);
            endLblPanel.add(endcosfLbl);
            endLblPanel.add(endtgnfLbl);
            endLblPanel.add(endKiPnLbl);
            endLblPanel.add(endKiPnTngfLbl);
            endLblPanel.add(endNpipowtwoLbl);
            endLblPanel.add(endCountEfectLbl);
            endLblPanel.add(endKpLbl);
            endLblPanel.add(endPpLbl);
            endLblPanel.add(endQpLbl);
            endLblPanel.add(endSpLbl);
            endLblPanel.add(endIpLbl);


            endcountTxt = new JTextField(5);
            endPniTxt = new JTextField(5);
            endPnTxt = new JTextField(5);
            endKiTxt = new JTextField(5);
            endcosfTxt = new JTextField(5);
            endtgnfTxt = new JTextField(5);
            endKiPnTxt = new JTextField(5);
            endKiPnTngfTxt = new JTextField(5);
            endNpipowtwoTxt = new JTextField(5);
            endCountEfectTxt = new JTextField(5);
            endKpTxt = new JTextField(5);
            endPpTxt = new JTextField(5);
            endQpTxt = new JTextField(5);
            endSpTxt = new JTextField(5);
            endIpTxt = new JTextField(5);


            JPanel endTxtFielfPanel = new JPanel();
            endTxtFielfPanel.setLayout(new BoxLayout(endTxtFielfPanel,BoxLayout.X_AXIS));
            endTxtFielfPanel.add(itog);
            endTxtFielfPanel.add(endcountTxt);
            endTxtFielfPanel.add(endPniTxt);
            endTxtFielfPanel.add(endPnTxt);
            endTxtFielfPanel.add(endKiTxt);
            endTxtFielfPanel.add(endcosfTxt);
            endTxtFielfPanel.add(endtgnfTxt);
            endTxtFielfPanel.add(endKiPnTxt);
            endTxtFielfPanel.add(endKiPnTngfTxt);
            endTxtFielfPanel.add(endNpipowtwoTxt);
            endTxtFielfPanel.add(endCountEfectTxt);
            endTxtFielfPanel.add(endKpTxt);
            endTxtFielfPanel.add(endPpTxt);
            endTxtFielfPanel.add(endQpTxt);
            endTxtFielfPanel.add(endSpTxt);
            endTxtFielfPanel.add(endIpTxt);






            JPanel endPanel = new JPanel();
            endPanel.setLayout(new BoxLayout(endPanel,BoxLayout.Y_AXIS));
            endPanel.add(endLblPanel);
            endPanel.add(endTxtFielfPanel);



            JButton calcButton = new JButton("Расчитать");
            JButton clearButton = new JButton("Отчистить");

            calcButton.addActionListener(new calcActionListenerOne());
            clearButton.addActionListener(new clearActionListener());

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
            buttonPanel.add(calcButton);
            buttonPanel.add(clearButton);
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));


            descriptionArea = new JTextArea(10, 10);
            descriptionArea.setBorder(BorderFactory.createEtchedBorder(2, Color.BLACK, Color.gray));
            descriptionArea.setFont(f);
            JScrollPane scrollPane = new JScrollPane(descriptionArea);
            scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


            JLabel nameOne = new JLabel("Станок 1");
            JLabel countLbl = new JLabel("Кол-во");
            countLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));
            JLabel poweLbl = new JLabel("Pn");
            poweLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));
            JLabel kiLbl = new JLabel("Ki");
            kiLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));
            JLabel cosfLbl = new JLabel("cosF");
            cosfLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));

            countFieldOne = new JTextField(15);
            countFieldOne.setSize(100, 100);
            countFieldOne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 100));
            countFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            poweFieldOne = new JTextField(15);
            poweFieldOne.setSize(100, 100);
            poweFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            kiFieldOne = new JTextField(15);
            kiFieldOne.setSize(100, 100);
            kiFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            cosfFieldOne = new JTextField(15);
            cosfFieldOne.setSize(100, 100);
            cosfFieldOne.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 10));
            cosfFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));


            JFrame mainFrame = new JFrame("Curs");

            JPanel inputPanel = new JPanel();
            inputPanel.setSize(800, 350);
            inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

            JPanel lblPanel = new JPanel();
            lblPanel.setLayout(new BoxLayout(lblPanel, BoxLayout.X_AXIS));
            lblPanel.add(countLbl);
            lblPanel.add(poweLbl);
            lblPanel.add(kiLbl);
            lblPanel.add(cosfLbl);


            JPanel txtPanel = new JPanel();
            lblPanel.setLayout(new BoxLayout(lblPanel, BoxLayout.X_AXIS));
            txtPanel.add(nameOne);
            txtPanel.add(countFieldOne);
            txtPanel.add(poweFieldOne);
            txtPanel.add(kiFieldOne);
            txtPanel.add(cosfFieldOne);

            inputPanel.add(lblPanel);
            inputPanel.add(txtPanel);

            mainFrame.getContentPane().add(BorderLayout.EAST, buttonPanel);
            mainFrame.getContentPane().add(BorderLayout.NORTH, inputPanel);
            mainFrame.getContentPane().add(BorderLayout.SOUTH,endPanel);
            mainFrame.getContentPane().add(BorderLayout.CENTER,scrollPane);

            mainFrame.setBackground(Color.gray);
            mainFrame.setFont(f);
            mainFrame.setSize(W, H);
            mainFrame.setVisible(true);
            mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        public static void windowWithTwoItem(int W, int H) {
            Font f = new Font("Arrial", Font.BOLD, 14);

            JPanel endLblPanel = new JPanel();
            endLblPanel.setSize(800,200);
            endLblPanel.setLayout(new BoxLayout(endLblPanel,BoxLayout.X_AXIS));

            JLabel itog = new JLabel("Итого");
            itog.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endcountLbl = new JLabel("∑n");
            endcountLbl.setBorder(BorderFactory.createEmptyBorder(5,50,5,20));

            JLabel endPniLbl = new JLabel("Pni");
            endPniLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endPnLbl = new JLabel("∑Pni");
            endPnLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endKiLbl = new JLabel("Ki");
            endKiLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endcosfLbl = new JLabel("CosF");
            endcosfLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endtgnfLbl = new JLabel("TngF");
            endtgnfLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endKiPnLbl = new JLabel("KiPn");
            endKiPnLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endKiPnTngfLbl = new JLabel("KiPnTngf");
            endKiPnTngfLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endNpipowtwoLbl = new JLabel("Npi^2");
            endNpipowtwoLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endCountEfectLbl = new JLabel("Nэ");
            endCountEfectLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endKpLbl = new JLabel("Kp");
            endKpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endPpLbl = new JLabel("Pp");
            endPpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endQpLbl = new JLabel("Qp");
            endQpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endSpLbl = new JLabel("Sp");
            endSpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endIpLbl = new JLabel("Ip");
            endIpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));


            endLblPanel.add(endcountLbl);
            endLblPanel.add(endPniLbl);
            endLblPanel.add(endPnLbl);
            endLblPanel.add(endKiLbl);
            endLblPanel.add(endcosfLbl);
            endLblPanel.add(endtgnfLbl);
            endLblPanel.add(endKiPnLbl);
            endLblPanel.add(endKiPnTngfLbl);
            endLblPanel.add(endNpipowtwoLbl);
            endLblPanel.add(endCountEfectLbl);
            endLblPanel.add(endKpLbl);
            endLblPanel.add(endPpLbl);
            endLblPanel.add(endQpLbl);
            endLblPanel.add(endSpLbl);
            endLblPanel.add(endIpLbl);


            endcountTxt = new JTextField(5);
            endPniTxt = new JTextField(5);
            endPnTxt = new JTextField(5);
            endKiTxt = new JTextField(5);
            endcosfTxt = new JTextField(5);
            endtgnfTxt = new JTextField(5);
            endKiPnTxt = new JTextField(5);
            endKiPnTngfTxt = new JTextField(5);
            endNpipowtwoTxt = new JTextField(5);
            endCountEfectTxt = new JTextField(5);
            endKpTxt = new JTextField(5);
            endPpTxt = new JTextField(5);
            endQpTxt = new JTextField(5);
            endSpTxt = new JTextField(5);
            endIpTxt = new JTextField(5);


            JPanel endTxtFielfPanel = new JPanel();
            endTxtFielfPanel.setLayout(new BoxLayout(endTxtFielfPanel,BoxLayout.X_AXIS));
            endTxtFielfPanel.add(itog);
            endTxtFielfPanel.add(endcountTxt);
            endTxtFielfPanel.add(endPniTxt);
            endTxtFielfPanel.add(endPnTxt);
            endTxtFielfPanel.add(endKiTxt);
            endTxtFielfPanel.add(endcosfTxt);
            endTxtFielfPanel.add(endtgnfTxt);
            endTxtFielfPanel.add(endKiPnTxt);
            endTxtFielfPanel.add(endKiPnTngfTxt);
            endTxtFielfPanel.add(endNpipowtwoTxt);
            endTxtFielfPanel.add(endCountEfectTxt);
            endTxtFielfPanel.add(endKpTxt);
            endTxtFielfPanel.add(endPpTxt);
            endTxtFielfPanel.add(endQpTxt);
            endTxtFielfPanel.add(endSpTxt);
            endTxtFielfPanel.add(endIpTxt);




            JPanel endPanel = new JPanel();
            endPanel.setLayout(new BoxLayout(endPanel,BoxLayout.Y_AXIS));
            endPanel.add(endLblPanel);
            endPanel.add(endTxtFielfPanel);

            JButton calcButton = new JButton("Расчитать");
            JButton clearButton = new JButton("Отчистить");

            calcButton.addActionListener(new calcActionListenerTwo());
            clearButton.addActionListener(new clearActionListener());


            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
            buttonPanel.add(calcButton);
            buttonPanel.add(clearButton);
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));


            descriptionArea = new JTextArea(10, 10);
            descriptionArea.setBorder(BorderFactory.createEtchedBorder(2, Color.BLACK, Color.gray));
            descriptionArea.setFont(f);
            JScrollPane scrollPane = new JScrollPane(descriptionArea);
            scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


            JLabel nameOne = new JLabel("Станок 1");
            JLabel nameTwo = new JLabel("Станок 2");
            JLabel countLbl = new JLabel("Кол-во");
            countLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));
            JLabel poweLbl = new JLabel("Pn");
            poweLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));
            JLabel kiLbl = new JLabel("Ki");
            kiLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));
            JLabel cosfLbl = new JLabel("cosF");
            cosfLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));

            countFieldOne = new JTextField(15);
            countFieldOne.setSize(100, 100);
            countFieldOne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 100));
            countFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            poweFieldOne = new JTextField(15);
            poweFieldOne.setSize(100, 100);
            poweFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            kiFieldOne = new JTextField(15);
            kiFieldOne.setSize(100, 100);
            kiFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            cosfFieldOne = new JTextField(15);
            cosfFieldOne.setSize(100, 100);
            cosfFieldOne.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 10));
            cosfFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));


            countFieldTwo = new JTextField(15);
            countFieldTwo.setSize(100, 100);
            countFieldTwo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 100));
            countFieldTwo.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            poweFieldTwo = new JTextField(15);
            poweFieldTwo.setSize(100, 100);
            poweFieldTwo.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            kiFieldTwo = new JTextField(15);
            kiFieldTwo.setSize(100, 100);
            kiFieldTwo.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            cosfFieldTwo = new JTextField(15);
            cosfFieldTwo.setSize(100, 100);
            cosfFieldTwo.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 10));
            cosfFieldTwo.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));


            JFrame mainFrame = new JFrame("Curs");

            JPanel inputPanel = new JPanel();
            inputPanel.setSize(800, 350);
            inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

            JPanel lblPanel = new JPanel();
            lblPanel.setLayout(new BoxLayout(lblPanel, BoxLayout.X_AXIS));
            lblPanel.add(countLbl);
            lblPanel.add(poweLbl);
            lblPanel.add(kiLbl);
            lblPanel.add(cosfLbl);


            JPanel txtPanelOne = new JPanel();
            txtPanelOne.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
            txtPanelOne.setLayout(new BoxLayout(txtPanelOne, BoxLayout.X_AXIS));
            txtPanelOne.add(nameOne);
            txtPanelOne.add(countFieldOne);
            txtPanelOne.add(poweFieldOne);
            txtPanelOne.add(kiFieldOne);
            txtPanelOne.add(cosfFieldOne);


            JPanel txtPanelTwo = new JPanel();
            txtPanelTwo.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
            txtPanelTwo.setLayout(new BoxLayout(txtPanelTwo, BoxLayout.X_AXIS));
            txtPanelTwo.add(nameTwo);
            txtPanelTwo.add(countFieldTwo);
            txtPanelTwo.add(poweFieldTwo);
            txtPanelTwo.add(kiFieldTwo);
            txtPanelTwo.add(cosfFieldTwo);

            inputPanel.add(lblPanel);
            inputPanel.add(txtPanelOne);
            inputPanel.add(txtPanelTwo);

            mainFrame.getContentPane().add(BorderLayout.EAST, buttonPanel);
            mainFrame.getContentPane().add(BorderLayout.NORTH, inputPanel);
            mainFrame.getContentPane().add(BorderLayout.SOUTH,endPanel);
            mainFrame.getContentPane().add(BorderLayout.CENTER,scrollPane);
            mainFrame.setBackground(Color.gray);
            mainFrame.setFont(f);
            mainFrame.setSize(W, H);
            mainFrame.setVisible(true);
            mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }

        public static void windowWithTreeItem(int W, int H) {
            Font f = new Font("Arrial", Font.BOLD, 14);

            JPanel endLblPanel = new JPanel();
            endLblPanel.setSize(800,200);
            endLblPanel.setLayout(new BoxLayout(endLblPanel,BoxLayout.X_AXIS));

            JLabel itog = new JLabel("Итого");
            itog.setBorder(BorderFactory.createEmptyBorder(5,5,5,20));

            JLabel endcountLbl = new JLabel("∑n");
            endcountLbl.setBorder(BorderFactory.createEmptyBorder(5,30,5,20));

            JLabel endPniLbl = new JLabel("Pni");
            endPniLbl.setBorder(BorderFactory.createEmptyBorder(5,10,5,20));

            JLabel endPnLbl = new JLabel("∑Pni");
            endPnLbl.setBorder(BorderFactory.createEmptyBorder(5,10,5,20));

            JLabel endKiLbl = new JLabel("Ki");
            endKiLbl.setBorder(BorderFactory.createEmptyBorder(5,10,5,20));

            JLabel endcosfLbl = new JLabel("CosF");
            endcosfLbl.setBorder(BorderFactory.createEmptyBorder(5,10,5,20));

            JLabel endtgnfLbl = new JLabel("TngF");
            endtgnfLbl.setBorder(BorderFactory.createEmptyBorder(5,10,5,20));

            JLabel endKiPnLbl = new JLabel("KiPn");
            endKiPnLbl.setBorder(BorderFactory.createEmptyBorder(5,10,5,20));

            JLabel endKiPnTngfLbl = new JLabel("KiPnTngf");
            endKiPnTngfLbl.setBorder(BorderFactory.createEmptyBorder(5,10,5,20));

            JLabel endNpipowtwoLbl = new JLabel("Npi^2");
            endNpipowtwoLbl.setBorder(BorderFactory.createEmptyBorder(5,10,5,20));

            JLabel endCountEfectLbl = new JLabel("Nэ");
            endCountEfectLbl.setBorder(BorderFactory.createEmptyBorder(5,10,5,20));

            JLabel endKpLbl = new JLabel("Kp");
            endKpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,10,20));

            JLabel endPpLbl = new JLabel("Pp");
            endPpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,10,20));

            JLabel endQpLbl = new JLabel("Qp");
            endQpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,10,20));

            JLabel endSpLbl = new JLabel("Sp");
            endSpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,10,20));

            JLabel endIpLbl = new JLabel("Ip");
            endIpLbl.setBorder(BorderFactory.createEmptyBorder(5,5,10,5));


            endLblPanel.add(endcountLbl);
            endLblPanel.add(endPniLbl);
            endLblPanel.add(endPnLbl);
            endLblPanel.add(endKiLbl);
            endLblPanel.add(endcosfLbl);
            endLblPanel.add(endtgnfLbl);
            endLblPanel.add(endKiPnLbl);
            endLblPanel.add(endKiPnTngfLbl);
            endLblPanel.add(endNpipowtwoLbl);
            endLblPanel.add(endCountEfectLbl);
            endLblPanel.add(endKpLbl);
            endLblPanel.add(endPpLbl);
            endLblPanel.add(endQpLbl);
            endLblPanel.add(endSpLbl);
            endLblPanel.add(endIpLbl);


            endcountTxt = new JTextField(5);
            endPniTxt = new JTextField(5);
            endPnTxt = new JTextField(5);
            endKiTxt = new JTextField(5);
            endcosfTxt = new JTextField(5);
            endtgnfTxt = new JTextField(5);
            endKiPnTxt = new JTextField(5);
            endKiPnTngfTxt = new JTextField(5);
            endNpipowtwoTxt = new JTextField(5);
            endCountEfectTxt = new JTextField(5);
            endKpTxt = new JTextField(5);
            endPpTxt = new JTextField(5);
            endQpTxt = new JTextField(5);
            endSpTxt = new JTextField(5);
            endIpTxt = new JTextField(5);


            JPanel endTxtFielfPanel = new JPanel();
            endTxtFielfPanel.setLayout(new BoxLayout(endTxtFielfPanel,BoxLayout.X_AXIS));
            endTxtFielfPanel.add(itog);
            endTxtFielfPanel.add(endcountTxt);
            endTxtFielfPanel.add(endPniTxt);
            endTxtFielfPanel.add(endPnTxt);
            endTxtFielfPanel.add(endKiTxt);
            endTxtFielfPanel.add(endcosfTxt);
            endTxtFielfPanel.add(endtgnfTxt);
            endTxtFielfPanel.add(endKiPnTxt);
            endTxtFielfPanel.add(endKiPnTngfTxt);
            endTxtFielfPanel.add(endNpipowtwoTxt);
            endTxtFielfPanel.add(endCountEfectTxt);
            endTxtFielfPanel.add(endKpTxt);
            endTxtFielfPanel.add(endPpTxt);
            endTxtFielfPanel.add(endQpTxt);
            endTxtFielfPanel.add(endSpTxt);
            endTxtFielfPanel.add(endIpTxt);



            JPanel endPanel = new JPanel();
            endPanel.setLayout(new BoxLayout(endPanel,BoxLayout.Y_AXIS));
            endPanel.add(endLblPanel);
            endPanel.add(endTxtFielfPanel);

            JButton calcButton = new JButton("Расчитать");
            JButton clearButton = new JButton("Отчистить");

            calcButton.addActionListener(new calcActionListenerTree());
            clearButton.addActionListener(new  clearActionListener());

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
            buttonPanel.add(calcButton);
            buttonPanel.add(clearButton);
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));


            descriptionArea = new JTextArea(5, 10);
            descriptionArea.setBorder(BorderFactory.createEtchedBorder(2, Color.BLACK, Color.gray));
            descriptionArea.setFont(f);
            JScrollPane scrollPane = new JScrollPane(descriptionArea);
            scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


            JLabel nameOne = new JLabel("Станок 1");
            nameOne.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            JLabel nameTwo = new JLabel("Станок 2");
            nameTwo.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            JLabel nameTree = new JLabel("Станок 3");
            nameTree.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            JLabel countLbl = new JLabel("Кол-во");
            countLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));
            JLabel poweLbl = new JLabel("Pn");
            poweLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));
            JLabel kiLbl = new JLabel("Ki");
            kiLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));
            JLabel cosfLbl = new JLabel("cosF");
            cosfLbl.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 100));

            countFieldOne = new JTextField(15);
            countFieldOne.setSize(100, 100);
            countFieldOne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 100));
            countFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            poweFieldOne = new JTextField(15);
            poweFieldOne.setSize(100, 100);
            poweFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            kiFieldOne = new JTextField(15);
            kiFieldOne.setSize(100, 100);
            kiFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            cosfFieldOne = new JTextField(15);
            cosfFieldOne.setSize(100, 100);
            cosfFieldOne.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 10));
            cosfFieldOne.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));


            countFieldTwo = new JTextField(15);
            countFieldTwo.setSize(100, 100);
            countFieldTwo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 100));
            countFieldTwo.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            poweFieldTwo = new JTextField(15);
            poweFieldTwo.setSize(100, 100);
            poweFieldTwo.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            kiFieldTwo = new JTextField(15);
            kiFieldTwo.setSize(100, 100);
            kiFieldTwo.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            cosfFieldTwo = new JTextField(15);
            cosfFieldTwo.setSize(100, 100);
            cosfFieldTwo.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 10));
            cosfFieldTwo.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));


            countFieldTree = new JTextField(15);
            countFieldTree.setSize(100, 100);
            countFieldTree.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 100));
            countFieldTree.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            poweFieldTree = new JTextField(15);
            poweFieldTree.setSize(100, 100);
            poweFieldTree.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            kiFieldTree = new JTextField(15);
            kiFieldTree.setSize(100, 100);
            kiFieldTree.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));
            cosfFieldTree = new JTextField(15);
            cosfFieldTree.setSize(100, 100);
            cosfFieldTree.setBorder(BorderFactory.createEmptyBorder(5, 100, 5, 10));
            cosfFieldTree.setBorder(BorderFactory.createEtchedBorder(1, Color.black, Color.gray));


            JFrame mainFrame = new JFrame("Curs");

            JPanel inputPanel = new JPanel();
            inputPanel.setSize(800, 400);
            inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

            JPanel lblPanel = new JPanel();
            lblPanel.setLayout(new BoxLayout(lblPanel, BoxLayout.X_AXIS));
            lblPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            lblPanel.add(countLbl);
            lblPanel.add(poweLbl);
            lblPanel.add(kiLbl);
            lblPanel.add(cosfLbl);


            JPanel txtPanelOne = new JPanel();
            txtPanelOne.setLayout(new BoxLayout(txtPanelOne, BoxLayout.X_AXIS));
            txtPanelOne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            txtPanelOne.add(nameOne);
            txtPanelOne.add(countFieldOne);
            txtPanelOne.add(poweFieldOne);
            txtPanelOne.add(kiFieldOne);
            txtPanelOne.add(cosfFieldOne);


            JPanel txtPanelTwo = new JPanel();
            txtPanelTwo.setLayout(new BoxLayout(txtPanelTwo, BoxLayout.X_AXIS));
            txtPanelTwo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            txtPanelTwo.add(nameTwo);
            txtPanelTwo.add(countFieldTwo);
            txtPanelTwo.add(poweFieldTwo);
            txtPanelTwo.add(kiFieldTwo);
            txtPanelTwo.add(cosfFieldTwo);

            JPanel txtPanelTree = new JPanel();
            txtPanelTree.setLayout(new BoxLayout(txtPanelTree, BoxLayout.X_AXIS));
            txtPanelTree.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            txtPanelTree.add(nameTree);
            txtPanelTree.add(countFieldTree);
            txtPanelTree.add(poweFieldTree);
            txtPanelTree.add(kiFieldTree);
            txtPanelTree.add(cosfFieldTree);


            inputPanel.add(lblPanel);
            inputPanel.add(txtPanelOne);
            inputPanel.add(txtPanelTwo);
            inputPanel.add(txtPanelTree);

            mainFrame.getContentPane().add(BorderLayout.EAST, buttonPanel);
            mainFrame.getContentPane().add(BorderLayout.NORTH, inputPanel);
            mainFrame.getContentPane().add(BorderLayout.SOUTH,endPanel);
            mainFrame.getContentPane().add(BorderLayout.CENTER,scrollPane);
            mainFrame.setBackground(Color.gray);
            mainFrame.setFont(f);
            mainFrame.setSize(W, H);
            mainFrame.setVisible(true);
            mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }

        static class calcActionListenerOne implements ActionListener {
            public void actionPerformed(ActionEvent ec) {
                int countOne = Integer.parseInt(countFieldOne.getText());
                double powerOne = Double.parseDouble(poweFieldOne.getText());
                double kiOne = Double.parseDouble(kiFieldOne.getText());
                double cosFOne = Double.parseDouble(cosfFieldOne.getText());
                Mashine stanokOne = new Mashine(countOne, powerOne, kiOne, cosFOne);
                Calc.calcOne(stanokOne);


            }
        }

        static class clearActionListener implements ActionListener {
            public void actionPerformed(ActionEvent ec) {
                descriptionArea.setText(" ");
            }
        }

        static class calcActionListenerTwo implements ActionListener {
            public void actionPerformed(ActionEvent ec) {
                int countOne = Integer.parseInt(countFieldOne.getText());
                double powerOne = Double.parseDouble(poweFieldOne.getText());
                double kiOne = Double.parseDouble(kiFieldOne.getText());
                double cosFOne = Double.parseDouble(cosfFieldOne.getText());

                int countTwo = Integer.parseInt(countFieldTwo.getText());
                double powerTwo = Double.parseDouble(poweFieldTwo.getText());
                double kiTwo = Double.parseDouble(kiFieldTwo.getText());
                double cosfTwo = Double.parseDouble(cosfFieldTwo.getText());


                Mashine stanokOne = new Mashine(countOne, powerOne, kiOne, cosFOne);
                Mashine stanokTwo = new Mashine(countTwo,powerTwo,kiTwo,cosfTwo);
                Calc.calcTwo(stanokOne, stanokTwo);
            }

        }

        static class calcActionListenerTree implements ActionListener{
            public void actionPerformed(ActionEvent ev){
                int countOne = Integer.parseInt(countFieldOne.getText());
                double powerOne = Double.parseDouble(poweFieldOne.getText());
                double kiOne = Double.parseDouble(kiFieldOne.getText());
                double cosFOne = Double.parseDouble(cosfFieldOne.getText());

                int countTwo = Integer.parseInt(countFieldTwo.getText());
                double powerTwo = Double.parseDouble(poweFieldTwo.getText());
                double kiTwo = Double.parseDouble(kiFieldTwo.getText());
                double cosfTwo = Double.parseDouble(cosfFieldTwo.getText());

                int countTree = Integer.parseInt(countFieldTree.getText());
                double powerTree = Double.parseDouble(poweFieldTree.getText());
                double kiTree = Double.parseDouble(kiFieldTree.getText());
                double cosfTree = Double.parseDouble(cosfFieldTree.getText());


                Mashine stanokOne = new Mashine(countOne, powerOne, kiOne, cosFOne);
                Mashine stanokTwo = new Mashine(countTwo,powerTwo,kiTwo,cosfTwo);
                Mashine stanokTree = new Mashine(countTree,powerTree,kiTree,cosfTree);
                Calc.calcTree(stanokOne, stanokTwo,stanokTree);

            }
        }
    }






