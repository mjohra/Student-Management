package firstForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class StudntLogin extends JFrame {

    private Container c;
    private Font f, f1, f2;
    private JLabel label, label2, label3;
    private JTextField tf1;
    private JPasswordField pf;
    private Cursor cursor;
    private JButton loginbtn, clearbtn, backbtn;
     //private String username,password;
    String arr[]= new String[40];

    StudntLogin() {
        initcomponents();
         
    }
    
   
    

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 900, 900);
        this.setTitle("Student Login");

        c = this.getContentPane();
        c.setBackground(Color.lightGray);
        c.setLayout(null);
        f = new Font("Algerian", Font.ITALIC, 45);
        f1 = new Font("Algerian", Font.BOLD, 28);
        f2 = new Font("Tohoma", Font.BOLD, 18);

        label = new JLabel();
        label.setText("Student Login Form");
        label.setBounds(350, 100, 500, 70);
        label.setFont(f);
        label.setForeground(Color.WHITE);
        // label.setOpaque(true);
        //label.setBackground(Color.GRAY);
        label.setHorizontalAlignment(JTextField.CENTER);
        //label.setToolTipText("Enter your name");
        c.add(label);

        label2 = new JLabel();
        label2.setText("Student Id");
        label2.setBounds(100, 430, 200, 50);
        label2.setFont(f1);
        label2.setForeground(Color.WHITE);
        //label2.setOpaque(true);
        //label2.setBackground(Color.GRAY);
        label2.setHorizontalAlignment(JTextField.CENTER);
        label2.setToolTipText("Enter your name");
        c.add(label2);

        label3 = new JLabel();
        label3.setText("Password");
        label3.setBounds(100, 500, 200, 50);
        label3.setFont(f1);
        label3.setForeground(Color.WHITE);
        //label3.setOpaque(true);
        //label3.setBackground(Color.GRAY);
        label3.setHorizontalAlignment(JTextField.CENTER);
        label3.setToolTipText("Enter your name");
        c.add(label3);

        tf1 = new JTextField();
        tf1.setBounds(300, 440, 300, 38);
        tf1.setFont(f2);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);

        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(300, 510, 300, 38);
        pf.setFont(f2);
        pf.setForeground(Color.black);
        pf.setBackground(Color.WHITE);
        pf.setHorizontalAlignment(JTextField.CENTER);
        c.add(pf);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        loginbtn = new JButton("Login");
        loginbtn.setBounds(320, 590, 120, 40);
        loginbtn.setFont(f2);
        loginbtn.setCursor(cursor);
        c.add(loginbtn);

        clearbtn = new JButton("Clear");
        clearbtn.setBounds(480, 590, 120, 40);
        clearbtn.setFont(f2);
        clearbtn.setCursor(cursor);
        c.add(clearbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(400, 660, 120, 40);
        backbtn.setFont(f2);
        backbtn.setCursor(cursor);
        c.add(backbtn);
        
        loginbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               try{
                  // String username,password;
                   File file = new File("login.txt");
                   file.createNewFile();
                   BufferedReader br = new BufferedReader (new FileReader(file));
                   String line ;
                    boolean isvalid=false;
                    while((line=br.readLine())!=null){
                      
                     arr=line.split(",");
                      if(arr[0].equals(tf1.getText()) && (arr[1].equals(pf.getText())))
                              {
                                  JOptionPane.showMessageDialog(null, "You are successfully logged in");
                                  isvalid= true;
                                  EntryForm frame1 = new EntryForm();
                                  frame1.setVisible(true);
                                  break;
                              }

                    }
                
                if(isvalid=false){
                    JOptionPane.showMessageDialog(null, "Invalid input");
                }
                    
                } catch (IOException ex) {
                    Logger.getLogger(StudntLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                

            }

        });

        clearbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                tf1.setText("");
                pf.setText("");

            }

        });

       
        backbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                EntryForm frame1 = new EntryForm();
                frame1.setVisible(true);
                dispose();

            }

        });

        tf1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String s = tf1.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1= " + s);
                }
            }
        });

        ImageIcon img = new ImageIcon(getClass().getResource("img2.png"));
        JLabel imageLabel = new JLabel(img);
        imageLabel.setBounds(0, 1, img.getIconWidth(), img.getIconHeight());
        c.add(imageLabel);

        ImageIcon img1 = new ImageIcon(getClass().getResource("background_home2.png"));
        JLabel imageLabel1 = new JLabel(img1);
        imageLabel1.setBounds(0, 1, img1.getIconWidth(), img1.getIconHeight());
        c.add(imageLabel1);

    }

    public static void main(String[] args) {

        StudntLogin frame = new StudntLogin();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
