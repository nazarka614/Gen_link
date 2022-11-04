import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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
    private JComboBox<String> comboBox = new JComboBox<>(select);
    private JComboBox<String> comboBox2 = new JComboBox<>(Brands);
    private JComboBox<String> comboBox3 = new JComboBox<>(names);
    private JButton button2 = new JButton("Generate unique stressmail");
    private JButton button3 = new JButton("Generate unique ab-soft");
    private JButton button = new JButton("Copy link");
    private JButton button4 = new JButton("Clear");
    private JButton button5 = new JButton("Logs ES copy link");
    private JButton button6 = new JButton("QA Tool copy link");
    private JTextField input = new JTextField("", 6);

    public SimpleGUI() {
        super("BuildLink");
        this.setBounds(100, 100, 900, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input.setText(null);
            }
        });

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2, 3, 3));
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
        comboBox2.addActionListener(new Combo());
        button.addActionListener(new ActtionButton());
        button2.addActionListener(new ButtonEventListener2 ());
        button3.addActionListener(new ButtonEventListener3 ());
        button6.addActionListener(new ButtonEventListener6 ());
        button5.addActionListener(new ButtonEventListener5 ());
    }

    class ActtionButton implements ActionListener {
        public void actionPerformed (ActionEvent e){
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
