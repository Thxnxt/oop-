import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JTextField textfield;
    private JTextArea textarea;
    private JButton summit, reset;
    private JPanel buttonpanel;
    private String txt;
    
    public ChatDemo(){
        fr = new JFrame();
        fr.setLayout(new FlowLayout());
        textfield = new JTextField(45);
        textarea = new JTextArea(20, 45);
        textarea.setEditable(false);
        summit = new JButton("Summit");
        reset = new JButton("Reset");
        buttonpanel = new JPanel(new FlowLayout());
        buttonpanel.add(summit);
        buttonpanel.add(reset);
        
        fr.addWindowListener(this);
        summit.addActionListener(this);
        reset.addActionListener(this);
        
        fr.add(textarea);
        fr.add(textfield);
        fr.add(buttonpanel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(520, 435);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ev){
        if (ev.getSource().equals(summit)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.print(dtf.format(LocalDateTime.now())+" : "+textfield.getText());
            textarea.setText(textarea.getText() + dtf.format(LocalDateTime.now())+ " : "+ textfield.getText()+ "\n");
            textfield.setText("");
            
        }else if (ev.getSource().equals(reset)){
            textarea.setText("");
            
        }
    }
    public static void main(String args[]){
        new ChatDemo();
    }

    @Override
    public void windowOpened(WindowEvent w){
        File f = new File("DataBot.dat");
        if (f.exists()){
          try (FileInputStream fin = new FileInputStream("DataBot.dat");
            ObjectInputStream in = new ObjectInputStream(fin);){
              this.textarea.setText(""+(String) in.readObject());
          }catch (IOException i){
              i.printStackTrace();
          }catch (ClassNotFoundException c){
              c.printStackTrace();
          }
        }
    }
    
    @Override
    public void windowClosing(WindowEvent w){
        try (FileOutputStream fout = new FileOutputStream("DataBot.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout);){
            oout.writeObject(this.textarea.getText());
            System.out.printf("Serialized data is saved");
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
}
