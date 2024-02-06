//lab9
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener{

    private JFrame fr;
    private JButton deposit, withdraw, exit;
    private JPanel grid, main, flow, bor;
    private JLabel balance, amount, num;
    private JTextField txt;
    private Account ac;

    public TellerGUI() {
        
        fr = new JFrame("Teller GUI");
        flow = new JPanel(new FlowLayout());
        bor = new JPanel(new BorderLayout());
        grid = new JPanel(new GridLayout(2, 2));
        main = new JPanel(new GridLayout(2, 1));
        txt = new JTextField();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");
        balance = new JLabel("  Balance");
        amount = new JLabel("  Amount");
        ac = new Account();
        ac.setBalance(0);
        num = new JLabel(String.valueOf(ac.getBalance()));

        grid.add(balance);
        grid.add(num);
        grid.add(amount);
        grid.add(txt);
        
        flow.add(deposit);
        flow.add(withdraw);
        flow.add(exit);
        bor.add(flow, BorderLayout.CENTER);

        main.add(grid);
        main.add(bor);

        fr.add(main);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(260, 190);
        fr.setVisible(true);
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        exit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(deposit)) {
           ac.setBalance(ac.getBalance()+Double.parseDouble(txt.getText()));
           num.setText(String.valueOf(ac.getBalance()));
        }
        else if ((ev.getSource().equals(withdraw))) {
            if (ac.getBalance() - Double.parseDouble(txt.getText()) >= 0) {
                ac.setBalance(ac.getBalance() - Double.parseDouble(txt.getText()));
            }
            num.setText(String.valueOf(ac.getBalance()));
        }
        else if ((ev.getSource().equals(exit))) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new TellerGUI();
    }
}
