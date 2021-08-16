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
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordChange extends JFrame {

    private Container c;
    private Font f, f1, f2;
    private JLabel label, label2, label3;
    private Cursor cursor;
    private JButton update;
    JPasswordField pf, pf1, pf2;
    String arr[] = new String[40];

    PasswordChange() {
        initcomponents();
    }

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 400);
        this.setTitle("PasswordChange");

        c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        c.setLayout(null);
        f = new Font("Algerian", Font.BOLD, 55);
        f1 = new Font("Tohoma", Font.BOLD, 28);
        f2 = new Font("Courier New", Font.PLAIN, 28);

        label = new JLabel("Current Password");
        label.setBounds(30, 20, 300, 100);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(380, 50, 350, 40);
        pf.setFont(f2);
        pf.setForeground(Color.black);
        pf.setBackground(Color.WHITE);
        pf.setHorizontalAlignment(JTextField.CENTER);
        c.add(pf);

        label2 = new JLabel("Type(New Password)");
        label2.setBounds(30, 100, 350, 100);
        label2.setForeground(Color.BLACK);
        label2.setOpaque(false);
        label2.setFont(f2);
        c.add(label2);

        pf1 = new JPasswordField();
        pf1.setEchoChar('*');
        pf1.setBounds(380, 130, 350, 40);
        pf1.setFont(f2);
        pf1.setForeground(Color.black);
        pf1.setBackground(Color.WHITE);
        pf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(pf1);

        label3 = new JLabel("Retype(Password)");
        label3.setBounds(30, 180, 350, 100);
        label3.setForeground(Color.BLACK);
        label3.setOpaque(false);
        label3.setFont(f2);
        c.add(label3);

        pf2 = new JPasswordField();
        pf2.setEchoChar('*');
        pf2.setBounds(380, 210, 350, 40);
        pf2.setFont(f2);
        pf2.setForeground(Color.black);
        pf2.setBackground(Color.WHITE);
        pf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(pf2);

        update = new JButton("Update");
        update.setBounds(575, 280, 150, 40);
        update.setForeground(Color.BLACK);
        update.setFont(f2);
        update.setCursor(cursor);
        c.add(update);

        Handler handler = new Handler();
        //admissionbtn .addActionListener(handler);

        update.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == update) {
                String confirmPassword = pf.getText();
                String newPassword = pf1.getText();
                String renewPassword = pf2.getText();
                try {

                    File file = new File("AdminPassword.txt");

                    file.createNewFile();
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    boolean isvalid = false;
                    while ((line = br.readLine()) != null) {

                        arr = line.split(",");
                        if (arr[0].equals(confirmPassword)) {
                            if (newPassword.equals(renewPassword)) {
                                FileWriter writer = new FileWriter("AdminPassword.txt", true);
                                writer.write(newPassword + ",");
                                writer.close();
                                Student_Info frame = new Student_Info();
                                frame.setVisible(true);
                                frame.setResizable(false);
                                dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Invalid input");
                            }
                        }
                    }
                    if (isvalid = false) {
                        JOptionPane.showMessageDialog(null, "Invalid input");
                    }

                    // pf.setText("");
                    // pf1.setText("");
                    // pf2.setText("");
                } catch (IOException ex) {
                    Logger.getLogger(PasswordChange.class.getName()).log(Level.SEVERE, null, ex);
                }

                //Admin frame=new Admin();
                //frame.setVisible(true);
                //dispose();
            }

        }
    }

    public static void main(String[] args) {
        PasswordChange frame = new PasswordChange();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
