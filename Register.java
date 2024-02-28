
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Register implements ActionListener  {

    private JFrame fr;
    private JPanel pn;
    private JScrollPane main;
    private JLabel usernameLabel, passwordLabel, confirmpasswordLabel, gmailLabel, customerLabel, ageLabel, petNameLabelLabel, AnimalTypeLabel, BreedLabel, chronicillnessLabel;
    private JTextField usernameField, gmailField, customerNameField, ageField, petNameField, AnimalTypeField, chronicillnessField, BreedField;
    private JPasswordField passwordField, confirmpasswordField;

    public void Register() {
        fr = new JFrame("Register");
        pn = new JPanel(new FlowLayout());
        main = new JScrollPane();
        main.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        usernameLabel = new JLabel("Username");
        pn.add(usernameLabel);
        
        
        //Add other component here...
        
        
        main.add(pn);
        fr.add(main);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {

    }
    public static void main(String[] args){new Register();}
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
