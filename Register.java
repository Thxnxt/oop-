
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Register implements ActionListener  {

    private JFrame fr;
    private JPanel pn;
    private JScrollPane main;
    private JLabel usernameLabel, passwordLabel, confirmpasswordLabel, gmailLabel, customerLabel, ageLabel, petNameLabelLabel, AnimalTypeLabel, BreedLabel, chronicillnessLabel, personLabel, petLabel;
    private JTextField usernameField, gmailField, customerNameField, ageField, petNameField, AnimalTypeField, chronicillnessField, BreedField;
    private JPasswordField passwordField, confirmpasswordField;

    public Register() {
        fr = new JFrame("Register");
        pn = new JPanel(null);
        pn.setBackground(new Color(0xFFE3A8));
        main = new JScrollPane(pn);
        main.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        personLabel = new JLabel("Information ");
        personLabel.setBounds(50, 30, 200, 25);
        personLabel.setFont(new Font("Inter", Font.BOLD, 30));
        pn.add(personLabel);

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 80, 150, 25);
        usernameLabel.setFont(new Font("Inter", Font.PLAIN, 18));
        pn.add(usernameLabel);
        usernameField = new JTextField();
        usernameField.setBounds(220, 80, 190, 25);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        pn.add(usernameField);

        gmailLabel = new JLabel("Gmail");
        gmailLabel.setBounds(50, 120, 150, 25);
        gmailLabel.setFont(new Font("Inter", Font.PLAIN, 18));
        pn.add(gmailLabel);
        gmailField = new JTextField();
        gmailField.setBounds(220, 120, 190, 25);
        gmailField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        pn.add(gmailField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 160, 150, 25);
        passwordLabel.setFont(new Font("Inter", Font.PLAIN, 18));
        pn.add(passwordLabel);
        passwordField = new JPasswordField();
        passwordField.setBounds(220, 160, 190, 25);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        pn.add(passwordField);

        confirmpasswordLabel = new JLabel("Confirm Password");
        confirmpasswordLabel.setBounds(50, 200, 150, 25);
        confirmpasswordLabel.setFont(new Font("Inter", Font.PLAIN, 18));
        pn.add(confirmpasswordLabel);
        confirmpasswordField = new JPasswordField();
        confirmpasswordField.setBounds(220, 200, 190, 25);
        confirmpasswordField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        pn.add(confirmpasswordField);
        
        
        
        main.add(pn);
        // fr.add(main);
        fr.add(pn);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500, 300);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {

    }
    public static void main(String[] args){SwingUtilities.invokeLater(() -> new Register());}
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Scrollable Panel Example");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // สร้าง JPanel ที่มีข้อมูลมาก
//        JPanel contentPanel = new JPanel();
//        contentPanel.setLayout(new GridLayout(0, 1));
//        for (int i = 0; i < 50; i++) {
//            contentPanel.add(new JLabel("Label " + (i + 1)));
//        }
//
//        // ใช้ JScrollPane เพื่อล้อม JPanel ที่มีข้อมูลมาก
//        JScrollPane scrollPane = new JScrollPane(contentPanel);
//
//        // ตั้งค่าเพื่อให้เลื่อนได้ในทั้งแนวนอนและแนวตั้ง
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//
//        // เพิ่ม JScrollPane ลงใน JFrame
//        frame.getContentPane().add(scrollPane);
//
//        frame.setVisible(true);
//    }
}
