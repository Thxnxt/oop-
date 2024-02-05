import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn0, bnc, bn10, bn11, bn12, bn13, bn14;
    private JPanel grid, bor;
    private JTextField txt;
    private String pre, op;
    private double con1, con2, aws;
    public CalculatorSample(){
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
        
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bnc.addActionListener(this);
        bn10.addActionListener(this);
        bn11.addActionListener(this);
        bn12.addActionListener(this);
        bn13.addActionListener(this);
        bn14.addActionListener(this);
        bn0.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ev) {
        String pre = txt.getText();
        op = "";
        if (ev.getSource().equals(bn1)) {
            txt.setText(pre + "1");
        } else if (ev.getSource().equals(bn2)) {
            txt.setText(pre + "2");
        } else if (ev.getSource().equals(bn3)) {
            txt.setText(pre + "3");
        } else if (ev.getSource().equals(bn4)) {
            txt.setText(pre + "4");
        } else if (ev.getSource().equals(bn5)) {
            txt.setText(pre + "5");
        } else if (ev.getSource().equals(bn6)) {
            txt.setText(pre + "6");
        } else if (ev.getSource().equals(bn7)) {
            txt.setText(pre + "7");
        } else if (ev.getSource().equals(bn8)) {
            txt.setText(pre + "8");
        } else if (ev.getSource().equals(bn9)) {
            txt.setText(pre + "9");
        } else if (ev.getSource().equals(bn0)) {
            txt.setText(pre + "0");
        } else if (ev.getSource().equals(bnc)) {// clear
            txt.setText("");
            con1 = con2 = aws = 0;
            op = "";
        } else if (ev.getSource().equals(bn10)) {// "+"
            con1 = Double.parseDouble(txt.getText());
            op = "+";
            txt.setText("");
        } else if (ev.getSource().equals(bn11)) {// "-"
            con1 = Double.parseDouble(txt.getText());
            op = "-";
            txt.setText("");
        } else if (ev.getSource().equals(bn12)) {// "*"
            con1 = Double.parseDouble(txt.getText());
            op = "*";
            txt.setText("");
        } else if (ev.getSource().equals(bn13)) {// "/"
            con1 = Double.parseDouble(txt.getText());
            op = "/";
            txt.setText("");
        } else if (ev.getSource().equals(bn14)) {// "="
            con2 = Double.parseDouble(txt.getText());
            switch (op) {
                case "+":
                    aws = con1+con2;
                    break;
                case "-":
                    aws = con1-con2;
                    break;
                case "*":
                    aws = con1*con2;
                    break;
                case "/":
                    aws = con1/con2;
                    break;
                default:
                    break;
            }
            txt.setText(String.valueOf(aws));
        }
    }
    public static void main(String args[]){new CalculatorSample();}
}
