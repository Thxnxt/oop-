import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn0, bnc, bn10, bn11, bn12, bn13, bn14;
    private JPanel gird, bor;
    private JTextField txt;
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        bor = new JPanel(new BorderLayout());
        gird = new JPanel(new GridLayout(4, 4));
        txt = new JTextField();
        bn1 = new JButton("1");bn2 = new JButton("2");bn3 = new JButton("3");bn4 = new JButton("4");
        bn5 = new JButton("5");bn6 = new JButton("6");bn7 = new JButton("7");bn8 = new JButton("8");
        bn9 = new JButton("9");bn0 = new JButton("0");bnc = new JButton("c");bn10 = new JButton("+");
        bn11 = new JButton("-");bn12 = new JButton("*");bn13 = new JButton("/");bn14 = new JButton("=");
        
        gird.add(bn7);gird.add(bn8);gird.add(bn9);gird.add(bn10);
        gird.add(bn4);gird.add(bn5);gird.add(bn6);gird.add(bn11);
        gird.add(bn1);gird.add(bn2);gird.add(bn3);gird.add(bn12);
        gird.add(bn0);gird.add(bnc);gird.add(bn14);gird.add(bn13);
        
        bor.add(txt, BorderLayout.NORTH);         
        bor.add(gird, BorderLayout.CENTER);       
           
        fr.add(bor);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
    public static void main(String args[]){new CalculatorTwoGUI();}
}
