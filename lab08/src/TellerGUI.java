import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JButton deposit, withdraw, exit;
    private JPanel grid, main, flow, bor;
    private JLabel balance, amount, num;
    private JTextField txt,txt1;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        flow = new JPanel(new FlowLayout());
        bor = new JPanel(new BorderLayout());
        grid = new JPanel(new GridLayout(2, 2));
        main = new JPanel(new GridLayout(2, 1));
        txt = new JTextField(); txt1 = new JTextField();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");
        balance = new JLabel("  Balance"); amount = new JLabel("  Amount"); num = new JLabel("6000");
        grid.add(balance);grid.add(num);
        grid.add(amount);grid.add(txt);
        flow.add(deposit);flow.add(withdraw);flow.add(exit);
        bor.add(flow, BorderLayout.CENTER);
        
        main.add(grid);
        main.add(bor);
        
        fr.add(main);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(260, 190);
        fr.setVisible(true);
    }
    public static void main(String args[]){new TellerGUI();}
}
