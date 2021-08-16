package firstForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class AdminSetting extends JFrame {

    private Container c;
    private Font f, f1, f2;
    private JLabel label, ChangePassword;
    private Cursor cursor;
    private JButton backbtn, ChangePasswordbtn;
    private ButtonGroup grp;

    AdminSetting() {
        initcomponents();
    }

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 10, 600, 500);
        this.setTitle("Student Information");

        c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        c.setLayout(null);
        f = new Font("Algerian", Font.BOLD, 55);
        f1 = new Font("Tohoma", Font.BOLD, 28);
        f2 = new Font("Tahoma", Font.PLAIN, 25);

        grp = new ButtonGroup();

        label = new JLabel("My Account");
        label.setBounds(100, 20, 600, 100);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f);
        c.add(label);

        ChangePassword = new JLabel("Change Password");
        ChangePassword.setBounds(50, 130, 200, 100);
        ChangePassword.setForeground(Color.BLACK);
        ChangePassword.setOpaque(false);
        ChangePassword.setFont(f2);
        c.add(ChangePassword);

        backbtn = new JButton("Back");
        backbtn.setBounds(200, 350, 100, 30);
        backbtn.setForeground(Color.BLACK);
        backbtn.setFont(f2);
        backbtn.setCursor(cursor);
        c.add(backbtn);

        ChangePasswordbtn = new JButton("Change");
        ChangePasswordbtn.setBounds(270, 160, 130, 40);
        ChangePasswordbtn.setForeground(Color.BLACK);
        ChangePasswordbtn.setFont(f2);
        ChangePasswordbtn.setCursor(cursor);
        c.add(ChangePasswordbtn);

        /*ImageIcon img1 = new ImageIcon(getClass().getResource("11.jpg"));
        JLabel img1L = new JLabel(img1);
        img1L.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        c.add(img1L);*/
        Handler handler = new Handler();
        //admissionbtn .addActionListener(handler);

        backbtn.addActionListener(handler);
        ChangePasswordbtn.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == backbtn) {
                Admin frame = new Admin();
                frame.setVisible(true);
                dispose();
            }

            if (e.getSource() == ChangePasswordbtn) {
                PasswordChange frame = new PasswordChange();
                frame.setVisible(true);
            }

        }
    }

    public static void main(String[] args) {

        AdminSetting frame = new AdminSetting();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
