import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn0, bnc, bn10, bn11, bn12, bn13, bn14;
    private JPanel bor, gi;
    private JTextField txt;
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        gi = new JPanel(new BorderLayout());
        bor = new JPanel(new GridLayout(4, 4));
        txt = new JTextField();
        bn1 = new JButton("1");bn2 = new JButton("2");bn3 = new JButton("3");bn4 = new JButton("4");
        bn5 = new JButton("5");bn6 = new JButton("6");bn7 = new JButton("7");bn8 = new JButton("8");
        bn9 = new JButton("9");bn0 = new JButton("0");bnc = new JButton("c");bn10 = new JButton("+");
        bn11 = new JButton("-");bn12 = new JButton("*");bn13 = new JButton("/");bn14 = new JButton("=");
        
        bor.add(bn7);bor.add(bn8);bor.add(bn9);bor.add(bn10);
        bor.add(bn4);bor.add(bn5);bor.add(bn6);bor.add(bn11);
        bor.add(bn1);bor.add(bn2);bor.add(bn3);bor.add(bn12);
        bor.add(bn0);bor.add(bnc);bor.add(bn14);bor.add(bn13);
        
        gi.add(txt, BorderLayout.NORTH);         
        gi.add(bor, BorderLayout.CENTER);       
           
        fr.add(gi);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
    public static void main(String args[]){new CalculatorTwoGUI();}
}
