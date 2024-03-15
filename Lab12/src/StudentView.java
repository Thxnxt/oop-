import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel pn;
    private JLabel idlabel, namelabel, moneylabel;
    private JTextField idtf, nametf, moneytf;
    private JButton deposit, withdraw;
    private Student std;
    
    public StudentView(){
        std = new Student();
        fr = new JFrame("");
        pn = new JPanel(new GridLayout(4, 2));
        idlabel = new JLabel("ID:");
        namelabel = new JLabel("Name:");
        moneylabel = new JLabel("Money:");
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        idtf = new JTextField();
        nametf = new JTextField();
        moneytf = new JTextField();
        moneytf.setEditable(false);
        
        pn.add(idlabel);
        pn.add(idtf);
        pn.add(namelabel);
        pn.add(nametf);
        pn.add(moneylabel);
        pn.add(moneytf);
        pn.add(deposit);
        pn.add(withdraw);
        
        fr.add(pn);
        fr.addWindowListener(this);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 150);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ev){
        try{
            std.setName(nametf.getText());
            std.setID(Integer.parseInt(idtf.getText()));
            if (ev.getSource().equals(deposit)) {
                std.setMoney(std.getMoney()+100);
               moneytf.setText(std.getMoney()+"");
            }else if (ev.getSource().equals(withdraw)){
                std.setMoney(std.getMoney()-100);
                moneytf.setText(std.getMoney()+"");
            }
        }catch(NumberFormatException a){   
        }
    }
    
    @Override
    public void windowOpened(WindowEvent w){
        File f = new File("StudentM.dat");
        if (f.exists()){
            try (FileInputStream fin = new FileInputStream("StudentM.dat");
                ObjectInputStream oin = new ObjectInputStream(fin);){

                    std = (Student) oin.readObject();
                    idtf.setText(""+std.getID());
                    nametf.setText("" + std.getName());
                    moneytf.setText("" + std.getMoney());

                
            } catch (IOException io){
                io.printStackTrace();
                
            }catch (ClassNotFoundException c) {
                c.printStackTrace();
                
            } catch (NullPointerException n) {
                n.printStackTrace();
                
            }
        }
    }
    
    @Override
    public void windowClosing(WindowEvent w){
        try (FileOutputStream fout = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout);){
            std.setName(nametf.getText());
            std.setID(Integer.parseInt(idtf.getText()));
            std.setMoney(std.getMoney());
            
            oout.writeObject(std);
            
            
        }catch (IOException io){
            io.printStackTrace();
            
        }   
    }
    
     @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
    public static void main(String[] args){
        new StudentView();
    }
}
