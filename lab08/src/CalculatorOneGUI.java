import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private Jframe fr;
    private JButton bn1, bn2, bn3, bn4;
    private JPanel fl, gi;
    private JTextField txt1, txt2, txt3;
    public CalculatorOneGUI(){
        fr = new JFrame("Calculator");
        gi = new JPanel(new GridLayout(4, 1));
        flow = new JPanel(new FlowLayout());
        txt1 = new JTextField();    txt2 = new JTextField();    txt3 = new JTextField();
        bn1 = new JButton("+");
        bn2 = new JButton("-");
        bn3 = new JButton("*");
        bn4 = new JButton("/");
        fl.add(bn1);    flow.add(bn2);    fl.add(bn3);    flow.add(bn4);
        
        gi.add(txt1);       gi.add(flow);  
        gi.add(txt2);       gi.add(txt3);
           
        fr.add(gi);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 190);
        fr.setVisible(true);
    }
    public static void main(String args[]){new CalculatorOneGUI();}
}
