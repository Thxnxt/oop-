import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn0, bnc, bn10, bn11, bn12, bn13, bn14;
    private JPanel grid, bor;
    private JTextField txt;
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        bor = new JPanel(new BorderLayout());
        grid = new JPanel(new GridLayout(4, 4));
        txt = new JTextField();
        bn1 = new JButton("1");bn2 = new JButton("2");bn3 = new JButton("3");bn4 = new JButton("4");
        bn5 = new JButton("5");bn6 = new JButton("6");bn7 = new JButton("7");bn8 = new JButton("8");
        bn9 = new JButton("9");bn0 = new JButton("0");bnc = new JButton("c");bn10 = new JButton("+");
        bn11 = new JButton("-");bn12 = new JButton("*");bn13 = new JButton("/");bn14 = new JButton("=");
        
        grid.add(bn7);grid.add(bn8);grid.add(bn9);grid.add(bn10);
        grid.add(bn4);grid.add(bn5);grid.add(bn6);grid.add(bn11);
        grid.add(bn1);grid.add(bn2);grid.add(bn3);grid.add(bn12);
        grid.add(bn0);grid.add(bnc);grid.add(bn14);grid.add(bn13);
        
        bor.add(txt, BorderLayout.NORTH);         
        bor.add(grid, BorderLayout.CENTER);       
           
        fr.add(bor);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
    public static void main(String args[]){new CalculatorTwoGUI();}
}
