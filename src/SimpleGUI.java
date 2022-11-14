import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;
class SimpleGUI extends JFrame
{
    Random rnd = new Random();
    String[] hostsBT = {
            "https://setup.btcloudphone.bt.com",
            "https://secure-bt01-ol.lab.nordigy.ru",
            "https://service-devgwsams-bt.secure.lab.nordigy.ru",
            "https://service-amrupams-bt.secure.lab.nordigy.ru",
            "https://stage301-bt.ringcentral.com",
            "https://service-devgw2ams-bt.secure.lab.nordigy.ru",
            "https://setup-bt.eurouat.ringcentral.com"
    };

    String[] hostsCharter = {
            "https://secure.spectrumenterprise.ringcentral.com",
            "https://secure-spectrumenterprise.uat.ringcentral.com",
            "https://service-devgwsams-spectrumenterprise.secure.lab.nordigy.ru",
            "https://service-amrupams-spectrumenterprise.secure.lab.nordigy.ru",
            "https://service-devgw2ams-spectrumenterprise.secure.lab.nordigy.ru",
    };

    String[] hostsCharterSMB = {
            "https://secure.spectrumbusiness.ringcentral.com",
            "https://secure-spectrumbusiness.uat.ringcentral.com",
            "https://service-devgwsams-spectrumbusiness.secure.lab.nordigy.ru",
            "https://service-amrupams-spectrumbusiness.secure.lab.nordigy.ru",
            "https://service-devgw2ams-spectrumbusiness.secure.lab.nordigy.ru",
    };

    String[] hostsUS = {
            "https://secure.ringcentral.com",
            "https://secure-rc01-ol.lab.nordigy.ru",
            "https://stage101.secure.ringcentral.com",
            "https://service-devgwsams-us.secure.lab.nordigy.ru",
            "https://service-amrupams-us.secure.lab.nordigy.ru",
            "https://service-devgw2ams-us.secure.lab.nordigy.ru",
    };

    String[] hostsCA = {
            "https://secure.ringcentral.ca",
            "https://secure-ca01-ol.lab.nordigy.ru",
            "https://stage101.secure.ringcentral.ca",
            "https://service-devgwsams-ca.secure.lab.nordigy.ru",
            "https://service-amrupams-ca.secure.lab.nordigy.ru",
            "https://service-devgw2ams-ca.secure.lab.nordigy.ru",
    };

    String[] hostsUK = {
            "https://secure.ringcentral.co.uk",
            "https://secure-uk01-ol.lab.nordigy.ru",
            "https://stage301.secure.ringcentral.co.uk",
            "https://service-devgwsams-uk.secure.lab.nordigy.ru",
            "https://service-amrupams-uk.secure.lab.nordigy.ru",
            "https://service-devgw2ams-uk.secure.lab.nordigy.ru",
    };

    String[] hostsAU = {
            "https://secure.ringcentral.au/",
            "https://secure-au01-ol.lab.nordigy.ru",
            "https://service-devgwsams-au.secure.lab.nordigy.ru",
            "https://service-amrupams-au.secure.lab.nordigy.ru",
            "https://service-devgw2ams-au.secure.lab.nordigy.ru",
    };

    String[] hostsEU = {
            "https://secure.ringcentral.eu",
            "https://secure-eu01-ol.lab.nordigy.ru",
            "https://service-devgwsams-eu.secure.lab.nordigy.ru",
            "https://service-amrupams-eu.secure.lab.nordigy.ru",
            "https://service-devgw2ams-eu.secure.lab.nordigy.ru",
    };

    String[] hostsTELUS = {
            "https://businessconnect.telus.com",
            "https://secure-telus.uat.ringcentral.com",
            "https://secure-te01-ol.lab.nordigy.ru",
            "https://service-devgwsams-telus.secure.lab.nordigy.ru",
            "https://service-amrupams-telus.secure.lab.nordigy.ru",
            "https://service-devgwsams-telus.secure.lab.nordigy.ru",
    };

    String[] hostsAVAYA = {
            "https://secure.cloudoffice.avaya.com",
            "https://secure-av01-ol.lab.nordigy.ru",
            "https://secure-aco.uat.ringcentral.com",
            "https://service-devgwsams-avaya.secure.lab.nordigy.ru",
            "https://service-amrupams-avaya.secure.lab.nordigy.ru",
            "https://service-devgw2ams-avaya.secure.lab.nordigy.ru",
            "https://stage101-avaya.secure.ringcentral.com",
            "https://stage201-avaya.secure.ringcentral.com",
    };

    String[] hostsATOS = {
            "https://secure.unifyoffice.com",
            "https://secure-as01-ol.lab.nordigy.ru",
            "https://secure-atos.eurouat.ringcentral.com",
            "https://service-devgwsams-unify.secure.lab.nordigy.ru",
            "https://service-amrupams-unify.secure.lab.nordigy.ru",
            "https://service-devgw2ams-unify.secure.lab.nordigy.ru",
    };

    String[] hostsRAINBOW = {
            "https://secure.rainbowoffice.com",
            "https://secure-al01-ol.lab.nordigy.ru",
            "https://secure-rainbowoffice.eurouat.ringcentral.com",
            "https://service-devgwsams-rainbow.secure.lab.nordigy.ru",
            "https://service-amrupams-rainbow.secure.lab.nordigy.ru",
            "https://service-devgw2ams-rainbow.secure.lab.nordigy.ru",
    };

    String[] hostsVERIZON = {
            "https://secure.verizon.ringcentral.biz",
            "https://secure-verizon.uat.ringcentral.com",
            "https://secure-ve01-ol.lab.nordigy.ru",
            "https://service-devgwsams-verizon.secure.lab.nordigy.ru",
            "https://service-amrupams-verizon.secure.lab.nordigy.ru",
            "https://service-devgw2ams-verizon.secure.lab.nordigy.ru",
    };

    String[] hostsEASTLINK = {
            "https://secure.eastlink.ringcentral.com",
            "https://secure-el01-ol.lab.nordigy.ru",
            "https://secure-eastlink.uat.ringcentral.com",
            "https://service-devgwsams-eastlink.secure.lab.nordigy.ru",
            "https://service-amrupams-eastlink.secure.lab.nordigy.ru",
            "https://service-devgw2ams-eastlink.secure.lab.nordigy.ru",
    };

    String[] hostsMCM = {
            "http://secure.symphony.ringcentral.com",
            "https://secure-mc01-ol.lab.nordigy.ru",
            "https://secure-symphony.uat.ringcentral.com",
            "https://service-devgwsams-symphony.secure.lab.nordigy.ru",
            "https://service-amrupams-symphony.secure.lab.nordigy.ru",
            "https://service-devgw2ams-symphony.secure.lab.nordigy.ru",
    };

    String[] hostsECOTEL = {
            "https://secure.ecotel.ringcentral.com",
            "https://secure-ec01-ol.lab.nordigy.ru",
            "https://secure-ecotel.eurouat.ringcentral.com",
            "https://service-devgwsams-ecotel.secure.lab.nordigy.ru",
            "https://service-amrupams-ecotel.secure.lab.nordigy.ru",
            "https://service-devgw2ams-ecotel.secure.lab.nordigy.ru",
    };

    String[] hostsFRONTIER = {
            "http://secure.frontier.ringcentral.com",
            "https://secure-frontier.uat.ringcentral.com/",
            "https://service-devgwsams-frontier.secure.lab.nordigy.ru",
            "https://service-amrupams-frontier.secure.lab.nordigy.ru",
            "https://service-devgw2ams-frontier.secure.lab.nordigy.ru",
    };

    String[] hostsDT_ATOS = {
            "https://secure.unifyoffice-telekom.ringcentral.com",
            "https://secure-unifyoffice-telekom.eurouat.ringcentral.com",
            "https://service-devgwsams-unifyoffice-telekom.secure.lab.nordigy.ru",
            "https://service-amrupams-unifyoffice-telekom.secure.lab.nordigy.ru",
            "https://service-devgw2ams-unifyoffice-telekom.secure.lab.nordigy.ru",
    };

    String[] hostsTELEKOM = {
            "http://secure.telekom.ringcentral.com",
            "https://secure-telekom.eurouat.ringcentral.com",
            "https://service-devgwsams-telekom.secure.lab.nordigy.ru",
            "https://service-amrupams-telekom.secure.lab.nordigy.ru",
            "https://service-devgw2ams-telekom.secure.lab.nordigy.ru",
    };

    String[] hostsVERSATEL = {
            "https://secure.1und1.ringcentral.com",
            "https://secure-1und1.eurouat.ringcentral.com",
            "https://service-devgwsams-1und1.secure.lab.nordigy.ru",
            "https://service-amrupams-1und1.secure.lab.nordigy.ru",
            "https://service-devgw2ams-1und1.secure.lab.nordigy.ru",
    };

    String[] hostsSUNRISE = {
            "http://secure.sunrise.ringcentral.com",
            "https://secure-sunrise.eurouat.ringcentral.com",
            "https://service-devgwsams-sunrise.secure.lab.nordigy.ru",
            "https://service-amrupams-sunrise.secure.lab.nordigy.ru",
            "https://service-devgw2ams-sunrise.secure.lab.nordigy.ru",
    };

    String[] hostsFEDRAMP = {
            "https://service-devgwsams-fedramp.secure.lab.nordigy.ru",
            "https://service-amrupams-fedramp.secure.lab.nordigy.ru",
            "https://service-devgw2ams-fedramp.secure.lab.nordigy.ru",
            "https://secure-fd01-ol.lab.nordigy.ru",
    };

    String[] hostsVODAFONE = {
            "https://secure.vodafonebusiness.ringcentral.com",
            "https://secure-vodafonebusiness.eurouat.ringcentral.com/",
            "https://service-devgwsams-vodafone.secure.lab.nordigy.ru",
            "https://service-amrupams-vodafone.secure.lab.nordigy.ru",
            "https://service-devgw2ams-vodafone.secure.lab.nordigy.ru",
            "https://secure-vo01-ol.lab.nordigy.ru",
    };

    String[] hostsATT = {
            "https://service-devgwsams-att.secure.lab.nordigy.ru",
            "https://service-amrupams-att.secure.lab.nordigy.ru",
            "https://service-devgw2ams-att.secure.lab.nordigy.ru",
            "https://secure-at01-ol.lab.nordigy.ru",
            "https://www-att.uat.ringcentral.com",
    };

    String[] Brands = {
            "Select brand",
            "BT",
            "CharterSMB",
            "Charter",
            "US",
            "CA",
            "UK",
            "AU",
            "EU",
            "TELUS",
            "AVAYA",
            "ATOS",
            "RAINBOW",
            "VERIZON",
            "TELEKOM",
            "EASTLINK",
            "MCM",
            "ECOTEL",
            "FEDRAMP",
            "FRONTIER",
            "DT_ATOS",
            "VERSATEL",
            "SUNRISE",
            "VODAFONE",
            "ATT",
    };
    String[] names = {
            "nazar.nerubayko",
            "alexandr.marar",
            "maksym.dumansky",
            "daria.sobko",
            "oleksandr.golubishko",
    };
    String[] select = {
            "First select Brands",
    };

    String[] Country = {
            "Select country",
            "US",
            "CA",
            "AU",
            "UK",
            "EU France",
            "EU Netherlands",
            "EU Ireland",
            "EU Singapore",
            "EU Switzerland",
            "Italy",
    };
    String[] testDATA = {
            "Credit Cards",
            "Mobile phone",
            "Credit Card Number (Visa)",
            "Credit Card Number (Visa) 3ds",
            "Credit Card Number (MC)",
            "Credit Card Number (Amex)",
    };
    String[] directDebitEU = {
            "Direct Debit EU fr",
            "CountryCode",
            "IBAN",
            "BIC",
    };
    String[] directDebitUK = {
            "Direct Debit EU uk",
            "CountryCode",
            "BBAN",
            "Bank/building society Sort Code",
    };
    String[] vat = {
            "UserCred",
            "rctu",
            "2calls4me",
            "Something",
            "New",
            "Bob",
            "Morgan",
            "VAT Number",
    };
    String[] salesAgent = {
            "sales Agent",
            "DEV-GWS-AMS",
            "AMR-UP-AMS",
            "PROD",
            "SWT-UP-AMS",
            "COOCIES_ON_PREPROD/PROD",
    };
    private JComboBox<String> comboBox = new JComboBox<>(select);
    private JComboBox<String> comboBox2 = new JComboBox<>(Brands);
    private JComboBox<String> comboBox3 = new JComboBox<>(names);
    private JComboBox<String> comboBox4 = new JComboBox<>(testDATA);
    private JComboBox<String> comboBox5 = new JComboBox<>(Country);
    private JComboBox<String> comboBox6 = new JComboBox<>(directDebitEU);
    private JComboBox<String> comboBox7 = new JComboBox<>(directDebitUK);
    private JComboBox<String> comboBox8 = new JComboBox<>(vat);
    private JComboBox<String> comboBox9 = new JComboBox<>(salesAgent);
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
    private JTextField input = new JTextField("", 6);
    public SimpleGUI() {
        super("BuildLink");
        this.setBounds(100, 100, 900, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input.setText(null);
                button4.setBackground(Color.pink);
            }
        });
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 2, 3, 3));
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
        comboBox2.addActionListener(new Combo());
        comboBox4.addActionListener(new Combo1());
        comboBox4.setBackground(Color.lightGray);
        comboBox6.addActionListener(new Combo2());
        comboBox6.setBackground(Color.lightGray);
        comboBox7.addActionListener(new Combo3());
        comboBox7.setBackground(Color.lightGray);
        comboBox8.addActionListener(new Combo4());
        comboBox8.setBackground(Color.lightGray);
        comboBox9.addActionListener(new Combo5());
        comboBox9.setBackground(Color.lightGray);
        button.addActionListener(new ActtionButton());
        button2.addActionListener(new ButtonEventListener2 ());
        button3.addActionListener(new ButtonEventListener3 ());
        button6.addActionListener(new ButtonEventListener6 ());
        button5.addActionListener(new ButtonEventListener5 ());
        button7.addActionListener(new ButtonEventListener7 ());
        button8.addActionListener(new ButtonEventListener8 ());
        button10.addActionListener(new ButtonEventListener9 ());
        button11.addActionListener(new ButtonEventListener10 ());
    }
    class ActtionButton implements ActionListener {
        public void actionPerformed (ActionEvent e){
            button.setBackground(Color.GREEN);
            if (input.getText().equals("")){  JOptionPane.showMessageDialog(null,"Please enter your ID","Error",JOptionPane.PLAIN_MESSAGE);
            }else {
                String message2 = comboBox.getSelectedItem() + "/rc-web/confirmation/default.html?" + input.getText() + ":2BDE2472710882FD33156CA67B9E2E30";
                StringSelection stringSelection2 = new StringSelection(message2);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection2, null);
            }
        }
        public boolean equals(Object object){
            JTextField jTextField =(JTextField) object;
            return input.getText() == jTextField.getText();
        }
    }
    class Combo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            String brands = comboBox2.getSelectedItem().toString();

            switch (brands){
                case "BT":
                    updateList(hostsBT);
                    break;
                case "CharterSMB":
                    updateList(hostsCharterSMB);
                    break;
                case "Charter":
                    updateList(hostsCharter);
                    break;
                case "US":
                    updateList(hostsUS);
                    break;
                case "CA":
                    updateList(hostsCA);
                    break;
                case "UK":
                    updateList(hostsUK);
                    break;
                case "EU":
                    updateList(hostsEU);
                    break;
                case "AU":
                    updateList(hostsAU);
                    break;
                case "TELUS":
                    updateList(hostsTELUS);
                    break;
                case "AVAYA":
                    updateList(hostsAVAYA);
                    break;
                case "ATOS":
                    updateList(hostsATOS);
                    break;
                case "RAINBOW":
                    updateList(hostsRAINBOW);
                    break;
                case "VERIZON":
                    updateList(hostsVERIZON);
                    break;
                case "EASTLINK":
                    updateList(hostsEASTLINK);
                    break;
                case "MCM":
                    updateList(hostsMCM);
                    break;
                case "ECOTEL":
                    updateList(hostsECOTEL);
                    break;
                case "FRONTIER":
                    updateList(hostsFRONTIER);
                    break;
                case "DT_ATOS":
                    updateList(hostsDT_ATOS);
                    break;
                case "VERSATEL":
                    updateList(hostsVERSATEL);
                    break;
                case "SUNRISE":
                    updateList(hostsSUNRISE);
                    break;
                case "VODAFONE":
                    updateList(hostsVODAFONE);
                    break;
                case "TELEKOM":
                    updateList(hostsTELEKOM);
                    break;
                case "FEDRAMP":
                    updateList(hostsFEDRAMP);
                    break;
                case "ATT":
                    updateList(hostsATT);
                    break;
            }
        }
    }
    class Combo5 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            comboBox9.setBackground(Color.ORANGE);
            String data = comboBox9.getSelectedItem().toString();
            String mess = "";
            switch (data){
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
    class Combo1 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            comboBox4.setBackground(Color.ORANGE);
            String data = comboBox4.getSelectedItem().toString();
            String mess = "";
            switch (data){
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
    class Combo2 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            comboBox6.setBackground(Color.ORANGE);
            String data = comboBox6.getSelectedItem().toString();
            String mess = "";
            switch (data){
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
    class Combo3 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            comboBox7.setBackground(Color.ORANGE);
            String data = comboBox7.getSelectedItem().toString();
            String mess = "";
            switch (data){
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

    class Combo4 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            comboBox8.setBackground(Color.ORANGE);
            String data = comboBox8.getSelectedItem().toString();
            String mess = "";
            switch (data){
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
        comboBox2.removeAllItems();
        for (String item2 : items2) {
            comboBox2.addItem(item2);
        }
    }
    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed (ActionEvent e){
            int number = rnd.nextInt(99999999);
            String message2 = comboBox3.getSelectedItem() + "+" + number + "@stressmailams.lab.nordigy.ru";
            StringSelection stringSelection2 = new StringSelection(message2);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);

        }
    }

    class ButtonEventListener7 implements ActionListener {
        public void actionPerformed (ActionEvent e){
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
                    JOptionPane.showMessageDialog(null,"Italy not have number","Error",JOptionPane.PLAIN_MESSAGE);
                    break;
                case "Select country":
                    JOptionPane.showMessageDialog(null,"Select country","Error",JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            StringSelection stringSelection2 = new StringSelection(message3);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);
        }
    }

    class ButtonEventListener8 implements ActionListener {
        public void actionPerformed (ActionEvent e){
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
                    JOptionPane.showMessageDialog(null,"Select country","Error",JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            StringSelection stringSelection2 = new StringSelection(message4);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);
        }
    }

    class ButtonEventListener10 implements ActionListener {
        public void actionPerformed (ActionEvent e){
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
                    JOptionPane.showMessageDialog(null,"Select country","Error",JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            StringSelection stringSelection2 = new StringSelection(message5);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);
        }
    }

    class ButtonEventListener9 implements ActionListener {
        public void actionPerformed (ActionEvent e){
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
                    JOptionPane.showMessageDialog(null,"Select country","Error",JOptionPane.PLAIN_MESSAGE);
                    break;
            }
            StringSelection stringSelection2 = new StringSelection(message5);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection2, null);
        }
    }
    class ButtonEventListener3 implements ActionListener {
        public void actionPerformed (ActionEvent e){
            int number = rnd.nextInt(99999999);
            String message3 = comboBox3.getSelectedItem() + "+" + number + "@ab-soft.net";
            StringSelection stringSelection3 = new StringSelection(message3);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection3, null);
        }
    }

    class ButtonEventListener6 implements ActionListener {
        public void actionPerformed (ActionEvent e){
            if (comboBox.getSelectedItem().equals("First select Brands")){  JOptionPane.showMessageDialog(null,"Select domain and brands","Error",JOptionPane.PLAIN_MESSAGE);
            }else {
                String message4 = comboBox.getSelectedItem() + "/web/setup/qa.html";
                StringSelection stringSelection3 = new StringSelection(message4);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection3, null);
            }
        }
        public boolean equals(Object object){
            JComboBox<String> jTextField =(JComboBox<String>) object;
            return comboBox.getSelectedItem() == jTextField.getSelectedItem();
        }
    }
    class ButtonEventListener5 implements ActionListener {
        public void actionPerformed (ActionEvent e){
            if (comboBox.getSelectedItem().equals("First select Brands")){  JOptionPane.showMessageDialog(null,"Select domain and brands","Error",JOptionPane.PLAIN_MESSAGE);
            }else {
                String message4 = comboBox.getSelectedItem() + "/web/setup/logviewer.html";
                StringSelection stringSelection3 = new StringSelection(message4);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection3, null);
            }
        }
        public boolean equals(Object object){
            JComboBox<String> jTextField =(JComboBox<String>) object;
            return comboBox.getSelectedItem() == jTextField.getSelectedItem();
        }
    }
}
