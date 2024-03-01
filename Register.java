
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Register implements ActionListener {

    private JFrame fr;
    private JPanel head, pn;
    private JScrollPane main;
    private JLabel usernameLabel, passwordLabel, confirmpasswordLabel, gmailLabel, customerLabel, ageLabel,
            petNameLabelLabel, AnimalTypeLabel, BreedLabel, chronicillnessLabel, personLabel, petLabel, registerLabel;
    private JTextField usernameField, gmailField, customerNameField, ageField, petNameField, AnimalTypeField,
            chronicillnessField, BreedField;
    private JPasswordField passwordField, confirmpasswordField;
    private JButton summit, login;

    public Register() {
        fr = new JFrame("Register");

        head = new JPanel(new FlowLayout(FlowLayout.LEFT));
        head.setBackground(new Color(255, 238, 227));

        registerLabel = new JLabel("Register ", SwingConstants.LEFT);
        registerLabel.setFont(new Font("Inter", Font.BOLD, 30));
        head.add(registerLabel);

        login = new JButton("Login");
        login.setFont(new Font("Inter", Font.PLAIN, 20));
        head.add(login);

        main = new JScrollPane();
        main.getViewport().setBackground(new Color(255, 227, 168));
        main.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        summit = new JButton(" Summit ");
        summit.addActionListener(this);

        fr.add(main, BorderLayout.CENTER);
        fr.add(head, BorderLayout.NORTH);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(600, 450);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == login);{

        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Register());
    }
}
