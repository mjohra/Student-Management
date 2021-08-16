package firstForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Student_Info extends JFrame {

    private Container c;
    private Font f, f1, f2;
    private JLabel label;
    private Cursor cursor;
    private JRadioButton searchbtn, infobtn, Settingbtn;
    private JButton backbtn;
    private ButtonGroup grp;

    Student_Info() {
        initcomponents();
    }

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 10, 1000, 600);
        this.setTitle("Student Information");

        c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        c.setLayout(null);
        f = new Font("Algerian", Font.BOLD, 55);
        f1 = new Font("Tohoma", Font.BOLD, 28);
        f2 = new Font("Tahoma", Font.PLAIN, 25);

        grp = new ButtonGroup();

        label = new JLabel("Student Deatails");
        label.setBounds(30, 20, 600, 100);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f);
        c.add(label);

        infobtn = new JRadioButton("Information");
        infobtn.setBounds(496, 320, 200, 30);
        //infobtn.setBackground(Color.darkGray);
        infobtn.setOpaque(false);
        infobtn.setForeground(Color.WHITE);
        infobtn.setFont(f2);
        c.add(infobtn);

        searchbtn = new JRadioButton("Search");
        searchbtn.setBounds(496, 370, 200, 30);
        //searchbtn.setBackground(Color.getHSBColor(27F, 28F, 28F));
        searchbtn.setOpaque(false);
        searchbtn.setForeground(Color.WHITE);
        searchbtn.setFont(f2);
        c.add(searchbtn);

        Settingbtn = new JRadioButton("Setting");
        Settingbtn.setBounds(496, 420, 200, 30);
        // Trimbtn.setBackground(Color.getHSBColor(27F, 28F, 28F));
        Settingbtn.setOpaque(false);
        Settingbtn.setForeground(Color.WHITE);
        Settingbtn.setFont(f2);
        c.add(Settingbtn);

        grp.add(infobtn);
        //grp.add(admissionbtn);
        grp.add(searchbtn);
        grp.add(Settingbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(525, 480, 100, 30);
        backbtn.setOpaque(false);
        backbtn.setContentAreaFilled(false);
        backbtn.setBorderPainted(false);
        backbtn.setForeground(Color.WHITE);
        backbtn.setFont(f2);
        backbtn.setCursor(cursor);
        c.add(backbtn);

        ImageIcon img1 = new ImageIcon(getClass().getResource("student2.png"));
        JLabel img1L = new JLabel(img1);
        img1L.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        c.add(img1L);

        Handler handler = new Handler();
        //admissionbtn .addActionListener(handler);
        infobtn.addActionListener(handler);
        searchbtn.addActionListener(handler);
        Settingbtn.addActionListener(handler);
        backbtn.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == infobtn) {
                try {
                    Information frame = new Information();
                    frame.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Student_Info.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (e.getSource() == Settingbtn) {
                AdminSetting frame = new AdminSetting();
                frame.setVisible(true);
            }

            if (e.getSource() == backbtn) {
                Admin frame = new Admin();
                frame.setVisible(true);
                dispose();
            }

        }
    }

    public static void main(String[] args) {

        Student_Info frame = new Student_Info();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
