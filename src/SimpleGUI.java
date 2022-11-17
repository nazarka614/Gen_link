import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;

class SimpleGUI extends JFrame {
    Random rnd = new Random();
    ListData listData = new ListData();
    ListHost listHost = new ListHost();
    ListEntry listEntry = new ListEntry();
    public JComboBox<String> comboBox = new JComboBox<>(listData.getlistSelect());
    private JComboBox<String> comboBox2 = new JComboBox<>(listData.getBrands());
    private JComboBox<String> comboBox3 = new JComboBox<>(listData.getNames());
    private JComboBox<String> comboBox4 = new JComboBox<>(listData.getTestData());
    private JComboBox<String> comboBox5 = new JComboBox<>(listData.getCountry());
    private JComboBox<String> comboBox6 = new JComboBox<>(listData.getDirectDebitEU());
    private JComboBox<String> comboBox7 = new JComboBox<>(listData.getDirectDebitUK());
    private JComboBox<String> comboBox8 = new JComboBox<>(listData.getVat());
    private JComboBox<String> comboBox9 = new JComboBox<>(listData.getSalesAgent());
    private JComboBox<String> comboBox10 = new JComboBox<>(listEntry.getSelectPlan());
    private JComboBox<String> comboBox11 = new JComboBox<>();
    private JComboBox<String> comboBox13 = new JComboBox<>();
    private JComboBox<String> comboBox14 = new JComboBox<>();
    private JButton button2 = new JButton("Generate unique stressmail");
    private JButton button3 = new JButton("Generate unique ab-soft");
    private JButton button = new JButton("Copy link");
    private JButton button4 = new JButton("Clear");
    private JButton button5 = new JButton("Logs ES copy link");
    private JButton button6 = new JButton("QA Tool copy link");
    private JButton button7 = new JButton("Phone number");
    private JButton button8 = new JButton("Street address");
    private JButton button10 = new JButton("City");
    private JButton button11 = new JButton("Zip code");
    private JButton button12 = new JButton("Copy entry link");
    private JTextField input = new JTextField("", 6);

    public SimpleGUI() {
        super("BuildLink");
        this.setBounds(100, 100, 900, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(null);
                button4.setBackground(Color.pink);
            }
        });
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 2, 3, 3));
        container.add(comboBox2);
        container.add(comboBox);
        container.add(button6);
        container.add(button2);
        container.add(comboBox3);
        container.add(input);
        container.add(button);
        container.add(button5);
        container.add(button3);
        container.add(button4);
        container.add(comboBox5);
        container.add(button7);
        container.add(button8);
        container.add(button10);
        container.add(button11);
        container.add(comboBox4);
        container.add(comboBox6);
        container.add(comboBox7);
        container.add(comboBox8);
        container.add(comboBox9);
        container.add(comboBox10);
        container.add(button12);
        container.add(comboBox11);
        container.add(comboBox13);
        container.add(comboBox14);
        comboBox2.addActionListener(new Combo());
        comboBox4.addActionListener(new Combo1());
        comboBox6.addActionListener(new Combo2());
        comboBox7.addActionListener(new Combo3());
        comboBox8.addActionListener(new Combo4());
        comboBox9.addActionListener(new Combo5());
        comboBox2.addActionListener(new Combo6());
        button.addActionListener(new ActtionButton());
        button2.addActionListener(new ButtonEventListener2());
        button3.addActionListener(new ButtonEventListener3());
        button6.addActionListener(new ButtonEventListener6());
        button5.addActionListener(new ButtonEventListener5());
        button7.addActionListener(new ButtonEventListener7());
        button8.addActionListener(new ButtonEventListener8());
        button10.addActionListener(new ButtonEventListener9());
        button11.addActionListener(new ButtonEventListener10());
        button12.addActionListener(new ButtonEventListener12());
    }

    class ActtionButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (input.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your ID", "Error", JOptionPane.PLAIN_MESSAGE);
            } else {
                String message2 = comboBox.getSelectedItem() + "/rc-web/confirmation/default.html?" + input.getText() + ":2BDE2472710882FD33156CA67B9E2E30";
                StringSelection stringSelection2 = new StringSelection(message2);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection2, null);
            }
        }

        public boolean equals(Object object) {
            JTextField jTextField = (JTextField) object;
            return input.getText() == jTextField.getText();
        }
    }

    class Combo6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String brands = comboBox2.getSelectedItem().toString();
            switch (brands) {
                case "US":
                    updateList2(listEntry.getPlanBrandUS());
                    break;
                case "CA":
                    updateList2(listEntry.getPlanBrandCA());
                    break;
                case "VERIZON":
                case "EASTLINK":
                case "MCM":
                case "Charter":
                case "ECOTEL":
                case "FRONTIER":
                case "DT_ATOS":
                case "VERSATEL":
                case "SUNRISE":
                case "VODAFONE":
                case "TELEKOM":
                case "FEDRAMP":
                case "TELUS":
                case "CharterSMB":
                    updateList2(listEntry.getNoEntry());
                    break;
                case "BT":
                    updateList2(listEntry.getSalesBrandBT());
                    break;
                case "EU":
                    updateList2(listEntry.getPlanBrandEU());
                    break;
                case "UK":
                    updateList2(listEntry.getPlanBrandUK());
                    break;
                case "AU":
                    updateList2(listEntry.getPlanBrandAU());
                    break;
                case "RAINBOW":
                case "ATOS":
                case "AVAYA":
                    updateList2(listEntry.getNoEntrySA());
                    break;
            }
        }
    }

    class ButtonEventListener12 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            String brands = comboBox2.getSelectedItem().toString();
            switch (brands) {
                case "US":
                    if (comboBox10.getSelectedItem().toString() == "Buy plan entry points Office 7.0") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=0&plan=1&paidPackage=1952.2";
                    } else if (comboBox10.getSelectedItem().toString() == "Trial 15 days plan entry points") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=1&plan=1&paidPackage=1952.2&trialPackage=101.1";
                    } else if (comboBox10.getSelectedItem().toString() == "Fax 1500") {
                        message = comboBox.getSelectedItem() + "/fax-v1.0/?offerType=0&plan=15";
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select Plan", "Error", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "CA":
                    if (comboBox10.getSelectedItem().toString() == "Buy plan entry points Office 7.0") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=0&plan=1&paidPackage=1961.1";
                    } else if (comboBox10.getSelectedItem().toString() == "Trial 15 days plan entry points") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=1&plan=1&paidPackage=1961.1&trialPackage=121.1";
                    } else if (comboBox10.getSelectedItem().toString() == "Fax 1500") {
                        message = comboBox.getSelectedItem() + "/fax-v1.0/?offerType=0&plan=15";
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select Plan", "Error", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "VERIZON":
                case "EASTLINK":
                case "MCM":
                case "Charter":
                case "ECOTEL":
                case "FRONTIER":
                case "DT_ATOS":
                case "VERSATEL":
                case "SUNRISE":
                case "VODAFONE":
                case "TELEKOM":
                case "FEDRAMP":
                case "TELUS":
                case "CharterSMB":
                    JOptionPane.showMessageDialog(null, "App not support please use Postman", "App not support", JOptionPane.PLAIN_MESSAGE);
                    break;
                case "BT":
                    message = "https://test-bt.lab.nordigy.ru/test.html";
                    break;
                case "EU":
                    if (comboBox10.getSelectedItem().toString() == "Buy plan entry points Office 7.0 nl") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=0&plan=1&country=nl";
                    } else if (comboBox10.getSelectedItem().toString() == "Trial 15 days plan entry nl") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=1&plan=1&country=nl";
                    } else if (comboBox10.getSelectedItem().toString() == "Buy plan entry points fr") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=0&plan=1&country=fr";
                    } else if (comboBox10.getSelectedItem().toString() == "Trial 15 days plan entry fr") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=1&plan=1&country=fr";
                    } else if (comboBox10.getSelectedItem().toString() == "Buy plan entry points ie") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=0&plan=1&country=nl";
                    } else if (comboBox10.getSelectedItem().toString() == "Trial 15 days plan entry ie") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=1&plan=1&country=ie";
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select Plan", "Error", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "AU":
                    if (comboBox10.getSelectedItem().toString() == "Buy plan entry points Office 7.0") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=0&plan=1&paidPackage=1983.1";
                    } else if (comboBox10.getSelectedItem().toString() == "Trial 15 days plan entry") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=1&plan=1&paidPackage=1983.1&trialPackage=141.1";
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select Plan", "Error", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "UK":
                    if (comboBox10.getSelectedItem().toString() == "Buy plan entry points Office 7.0") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=0&plan=1&paidPackage=1969.1";
                    } else if (comboBox10.getSelectedItem().toString() == "Trial 15 days plan entry") {
                        message = comboBox.getSelectedItem() + "/office-v7.0/?offerType=1&plan=1&paidPackage=1969.1&trialPackage=181.1";
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select Plan", "Error", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case "RAINBOW":
                case "ATOS":
                case "AVAYA":
                    JOptionPane.showMessageDialog(null, "Please use Sales agent from app", "Massage", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            StringSelection stringSelection = new StringSelection(message);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }

    class Combo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String brands = comboBox2.getSelectedItem().toString();
            switch (brands) {
                case "BT":
                    updateList(listHost.getHostBT());
                    break;
                case "CharterSMB":
                    updateList(listHost.getHostCharterSMB());
                    break;
                case "Charter":
                    updateList(listHost.getHostCharter());
                    break;
                case "US":
                    updateList(listHost.getHostUS());
                    break;
                case "CA":
                    updateList(listHost.getHostCA());
                    break;
                case "UK":
                    updateList(listHost.getHostUK());
                    break;
                case "EU":
                    updateList(listHost.getHostEU());
                    break;
                case "AU":
                    updateList(listHost.getHostAU());
                    break;
                case "TELUS":
                    updateList(listHost.getHostsTELUS());
                    break;
                case "AVAYA":
                    updateList(listHost.getHostsAVAYA());
                    break;
                case "ATOS":
                    updateList(listHost.getHostsATOS());
                    break;
                case "RAINBOW":
                    updateList(listHost.getHostsRAINBOW());
                    break;
                case "VERIZON":
                    updateList(listHost.getHostsVERIZON());
                    break;
                case "EASTLINK":
                    updateList(listHost.getHostsEASTLINK());
                    break;
                case "MCM":
                    updateList(listHost.getHostsMCM());
                    break;
                case "ECOTEL":
                    updateList(listHost.getHostsECOTEL());
                    break;
                case "FRONTIER":
                    updateList(listHost.getHostsFRONTIER());
                    break;
                case "DT_ATOS":
                    updateList(listHost.getHostsDT_ATOS());
                    break;
                case "VERSATEL":
                    updateList(listHost.getHostsVERSATEL());
                    break;
                case "SUNRISE":
                    updateList(listHost.getHostsSUNRISE());
                    break;
                case "VODAFONE":
                    updateList(listHost.getHostsVODAFONE());
                    break;
                case "TELEKOM":
                    updateList(listHost.getHostsTELEKOM());
                    break;
                case "FEDRAMP":
                    updateList(listHost.getHostsFEDRAMP());
                    break;
                case "ATT":
                    updateList(listHost.getHostsATT());
                    break;
            }
        }
    }

    class Combo5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String data = comboBox9.getSelectedItem().toString();
            String mess = "";
            switch (data) {
                case "DEV-GWS-AMS":
                    mess = "https://service-devgwsams-us.secure.lab.nordigy.ru/salesagent_v5/signup/emulator-v2/rbs/";
                    break;
                case "AMR-UP-AMS":
                    mess = "https://service-amrupams-us.secure.lab.nordigy.ru/salesagent_v5/signup/emulator-v2/";
                    break;
                case "PROD":
                    mess = "https://secure.ringcentral.com/salesagent_v5/signup/emulator-v2/";
                    break;
                case "SWT-UP-AMS":
                    mess = "https://service-swtupams-us.secure.lab.nordigy.ru/salesagent_v5/signup/emulator-v2/";
                    break;
                case "COOCIES_ON_PREPROD/PROD":
                    mess = "(function(){document.cookie='cnvr_fcf_ignore_closed_sf_record=any;path=/;';})();";
                    break;
            }
            StringSelection stringSelection = new StringSelection(mess);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }

    class Combo1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String data = comboBox4.getSelectedItem().toString();
            String mess = "";
            switch (data) {
                case "Mobile phone":
                    mess = "+78129363711";
                    break;
                case "Credit Card Number (Visa)":
                    mess = "4111111111111111";
                    break;
                case "Credit Card Number (Visa) 3ds":
                    mess = "4000 0000 0000 0044";
                    break;
                case "Credit Card Number (MC)":
                    mess = "5555555555554444";
                    break;
                case "Credit Card Number (Amex)":
                    mess = "378282246310005";
                    break;
            }
            StringSelection stringSelection = new StringSelection(mess);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }

    class Combo2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String data = comboBox6.getSelectedItem().toString();
            String mess = "";
            switch (data) {
                case "CountryCode":
                    mess = "France";
                    break;
                case "IBAN":
                    mess = "FR7610011000200012345678934";
                    break;
                case "BIC":
                    mess = "PSSTFRPPCNE";
                    break;
            }
            StringSelection stringSelection = new StringSelection(mess);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }

    class Combo3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String data = comboBox7.getSelectedItem().toString();
            String mess = "";
            switch (data) {
                case "CountryCode":
                    mess = "United Kingdom";
                    break;
                case "BBAN":
                    mess = "34697856";
                    break;
                case "Bank/building society Sort Code":
                    mess = "309136";
                    break;
            }
            StringSelection stringSelection = new StringSelection(mess);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }

    class Combo4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String data = comboBox8.getSelectedItem().toString();
            String mess = "";
            switch (data) {
                case "rctu":
                    mess = "rctu";
                    break;
                case "2calls4me":
                    mess = "2calls4me";
                    break;
                case "Something":
                    mess = "Something";
                    break;
                case "New":
                    mess = "New";
                    break;
                case "Bob":
                    mess = "Bob";
                    break;
                case "Morgan":
                    mess = "Morgan";
                    break;
                case "VAT Number":
                    mess = "vatushka!";
                    break;
            }
            StringSelection stringSelection = new StringSelection(mess);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }

    private void updateList(String[] items) {
        comboBox.removeAllItems();
        for (String item : items) {
            comboBox.addItem(item);
        }
    }

    private void updateList2(String[] items2) {
        comboBox10.removeAllItems();
        for (String item2 : items2) {
            comboBox10.addItem(item2);
        }
    }

    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int number = rnd.nextInt(99999999);
            String message2 = comboBox3.getSelectedItem() + "+" + number + "@stressmailams.lab.nordigy.ru";
            StringSelection stringSelection2 = new StringSelection(message2);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);

        }
    }

    class ButtonEventListener7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message3 = "";
            int number = rnd.nextInt(9999999);
            int number2 = rnd.nextInt(99999999);
            String country = comboBox5.getSelectedItem().toString();
            switch (country) {
                case "US":
                    message3 = "1405" + number + "";
                    break;
                case "CA":
                    message3 = "1506" + number + "";
                    break;
                case "UK":
                    message3 = "4420" + number2 + "";
                    break;
                case "AU":
                    message3 = "618" + number2 + "";
                    break;
                case "EU France":
                    message3 = "331" + number2 + "";
                    break;
                case "EU Netherlands":
                    message3 = "3115" + number2 + "";
                    break;
                case "EU Ireland":
                    message3 = "3531" + number + "";
                    break;
                case "EU Singapore":
                    message3 = "65" + number2 + "";
                    break;
                case "EU Switzerland":
                    message3 = "4131" + number + "";
                    break;
                case "Italy":
                    JOptionPane.showMessageDialog(null, "Italy not have number", "Error", JOptionPane.PLAIN_MESSAGE);
                    break;
                case "Select country":
                    JOptionPane.showMessageDialog(null, "Select country", "Error", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            StringSelection stringSelection2 = new StringSelection(message3);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);
        }
    }

    class ButtonEventListener8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message4 = "";
            String country = comboBox5.getSelectedItem().toString();
            switch (country) {
                case "US":
                    message4 = "114 West Hefner Road";
                    break;
                case "CA":
                    message4 = "44 Saint George Street";
                    break;
                case "UK":
                    message4 = "16 North End Road";
                    break;
                case "AU":
                    message4 = "23 Dampier Terrace";
                    break;
                case "EU France":
                    message4 = "4 Boulevard Haussmann";
                    break;
                case "EU Netherlands":
                    message4 = "6 Lindelaan";
                    break;
                case "EU Ireland":
                    message4 = "125 Abbey Street Upper";
                    break;
                case "EU Singapore":
                    message4 = "50 Raffles Place";
                    break;
                case "EU Switzerland":
                    message4 = "Kappelergasse 1";
                    break;
                case "Italy":
                    message4 = "Piazza Principe Umberto 119";
                    break;
                case "Select country":
                    JOptionPane.showMessageDialog(null, "Select country", "Error", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            StringSelection stringSelection2 = new StringSelection(message4);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);
        }
    }

    class ButtonEventListener10 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message5 = "";
            String country = comboBox5.getSelectedItem().toString();
            switch (country) {
                case "US":
                    message5 = "73114";
                    break;
                case "CA":
                    message5 = "E1C 1T1";
                    break;
                case "UK":
                    message5 = "NW11 7PS";
                    break;
                case "AU":
                    message5 = "6725";
                    break;
                case "EU France":
                    message5 = "75009";
                    break;
                case "EU Netherlands":
                    message5 = "2612 VK";
                    break;
                case "EU Ireland":
                    message5 = "D01 W3X5";
                    break;
                case "EU Singapore":
                    message5 = "048623";
                    break;
                case "EU Switzerland":
                    message5 = "8022";
                    break;
                case "Italy":
                    message5 = "50025";
                    break;
                case "Select country":
                    JOptionPane.showMessageDialog(null, "Select country", "Error", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            StringSelection stringSelection2 = new StringSelection(message5);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);
        }
    }

    class ButtonEventListener9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message5 = "";
            String country = comboBox5.getSelectedItem().toString();
            switch (country) {
                case "US":
                    message5 = "Oklahoma";
                    break;
                case "CA":
                    message5 = "Moncton";
                    break;
                case "UK":
                    message5 = "London";
                    break;
                case "AU":
                    message5 = "Broome";
                    break;
                case "EU France":
                    message5 = "Paris";
                    break;
                case "EU Netherlands":
                    message5 = "Delft";
                    break;
                case "EU Ireland":
                    message5 = "Dublin";
                    break;
                case "EU Singapore":
                    message5 = "Singapore";
                    break;
                case "EU Switzerland":
                    message5 = "Zurich";
                    break;
                case "Italy":
                    message5 = "Montagnana Val Di Pesa";
                    break;
                case "Default phone":
                case "Select country":
                    JOptionPane.showMessageDialog(null, "Select country", "Error", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            StringSelection stringSelection2 = new StringSelection(message5);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);
        }
    }

    class ButtonEventListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int number = rnd.nextInt(99999999);
            String message3 = comboBox3.getSelectedItem() + "+" + number + "@ab-soft.net";
            StringSelection stringSelection3 = new StringSelection(message3);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection3, null);
        }
    }

    class ButtonEventListener6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (comboBox.getSelectedItem().equals("First select Brands")) {
                JOptionPane.showMessageDialog(null, "Select domain and brands", "Error", JOptionPane.PLAIN_MESSAGE);
            } else {
                String message4 = comboBox.getSelectedItem() + "/web/setup/qa.html";
                StringSelection stringSelection3 = new StringSelection(message4);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection3, null);
            }
        }

        public boolean equals(Object object) {
            JComboBox<String> jTextField = (JComboBox<String>) object;
            return comboBox.getSelectedItem() == jTextField.getSelectedItem();
        }
    }

    class ButtonEventListener5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (comboBox.getSelectedItem().equals("First select Brands")) {
                JOptionPane.showMessageDialog(null, "Select domain and brands", "Error", JOptionPane.PLAIN_MESSAGE);
            } else {
                String message4 = comboBox.getSelectedItem() + "/web/setup/logviewer.html";
                StringSelection stringSelection3 = new StringSelection(message4);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection3, null);
            }
        }

        public boolean equals(Object object) {
            JComboBox<String> jTextField = (JComboBox<String>) object;
            return comboBox.getSelectedItem() == jTextField.getSelectedItem();
        }
    }
}

