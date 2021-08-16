package firstForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin extends JFrame {

    private Container c;
    private Font f, f1, f2, f3;
    private JLabel label, label2, label3;
    private JTextField tf1;
    private JPasswordField pf;
    private Cursor cursor;
    private JButton loginbtn, clearbtn, backbtn;
    String arr[] = new String[40];

    AdminLogin() {
        initcomponents();
    }

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 900, 800);
        this.setTitle("Admin Login");

        c = this.getContentPane();
        //c.setBackground(Color.lightGray);
        c.setLayout(null);
        f = new Font("Algerian", Font.ITALIC, 50);
        f1 = new Font("Algerian", Font.BOLD, 28);
        f2 = new Font("Arial", Font.BOLD, 18);
        f3 = new Font("Algerianl", Font.BOLD, 20);

        label = new JLabel();
        label.setText("Admin Login Form");
        label.setBounds(200, 100, 500, 70);
        label.setForeground(Color.WHITE);
        label.setFont(f);
        label.setOpaque(false);
        // label.setBackground(Color.GRAY);
        //label.setBackground(new Color(0, 0, 0, 0));
        label.setHorizontalAlignment(JTextField.CENTER);
        //label.setToolTipText("Enter your name");
        c.add(label);

        label2 = new JLabel();
        label2.setText("Admin Id");
        label2.setBounds(100, 400, 150, 50);
        label2.setFont(f1);
        label2.setForeground(Color.WHITE);
        label2.setOpaque(true);
        label2.setBackground(Color.BLACK);
        label2.setHorizontalAlignment(JTextField.CENTER);
        label2.setToolTipText("Enter your name");
        c.add(label2);

        label3 = new JLabel();
        label3.setText("Password");
        label3.setBounds(100, 470, 200, 50);
        label3.setFont(f1);
        label3.setForeground(Color.WHITE);
        label3.setOpaque(true);
        label3.setBackground(Color.BLACK);
        label3.setHorizontalAlignment(JTextField.CENTER);
        label3.setToolTipText("Enter your name");
        c.add(label3);

        tf1 = new JTextField();
        tf1.setBounds(320, 400, 300, 50);
        tf1.setFont(f2);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);

        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(320, 470, 300, 50);
        pf.setFont(f2);
        pf.setForeground(Color.black);
        pf.setBackground(Color.WHITE);
        pf.setHorizontalAlignment(JTextField.CENTER);
        c.add(pf);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        loginbtn = new JButton("Login");
        loginbtn.setBounds(320, 560, 120, 40);
        loginbtn.setFont(f3);
        loginbtn.setCursor(cursor);
        c.add(loginbtn);

        clearbtn = new JButton("Clear");
        clearbtn.setBounds(480, 560, 120, 40);
        clearbtn.setFont(f3);
        clearbtn.setCursor(cursor);
        c.add(clearbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(400, 620, 120, 40);
        backbtn.setFont(f3);
        backbtn.setCursor(cursor);
        c.add(backbtn);

        backbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                EntryForm frame1 = new EntryForm();
                frame1.setVisible(true);

            }

        });

        clearbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                tf1.setText("");
                pf.setText("");

            }

        });

        loginbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    // String username,password;
                    String userName = tf1.getText();
                    String password = pf.getText();
                    File file = new File("AdminPassword.txt");
                    file.createNewFile();
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    boolean isvalid = false;
                    while ((line = br.readLine()) != null) {

                        arr = line.split(",");
                        if (userName.equals("mouri") && (arr[0].equals(password) || arr[1].equals(password))) {
                            JOptionPane.showMessageDialog(null, "You are successfully logged in");
                            isvalid = true;
                            Admin ad = new Admin();
                            ad.setVisible(true);
                            //NewFrame frame = new NewFrame();
                            //frame.setVisible(true);
                            dispose();
                            break;
                        }

                    }

                    if (isvalid = false) {
                        JOptionPane.showMessageDialog(null, "Invalid input");
                    }
                    tf1.setText("");
                    pf.setText("");

                } catch (IOException ex) {
                    Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                /* String userName = tf1.getText();
                String password = pf.getText();
                if (userName.equals("mouri") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "You are successfully logged in");

                    Admin ad = new Admin();
                    ad.setVisible(true);
                    //NewFrame frame = new NewFrame();
                    //frame.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input");
                }
                tf1.setText("");
                pf.setText("");
                 */
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

        /*ImageIcon img = new ImageIcon(getClass().getResource("img3.png"));
            JLabel imageLabel = new JLabel(img);
        imageLabel.setBounds(10,10,img.getIconWidth(),img.getIconHeight());
        c.add(imageLabel);*/
        ImageIcon img1 = new ImageIcon(getClass().getResource("tutt.png"));
        JLabel img1L = new JLabel(img1);
        img1L.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        c.add(img1L);

    }

    public static void main(String[] args) {

        AdminLogin frame = new AdminLogin();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
