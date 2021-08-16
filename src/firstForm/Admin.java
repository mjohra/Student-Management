package firstForm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Admin extends JFrame {

    private Container c;
    private Font f, ff;
    private JRadioButton student, setting, admission;
    private ButtonGroup grp;
    private JButton submitButton;
    private JLabel label, label1, label2, label3;
    private BorderLayout blayout;

    Admin() {
        initcomponents();
    }

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 10, 900, 900);
        this.setTitle("Admin Panel");
        //blayout = new BorderLayout();

        c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        setLayout(null);

        ImageIcon img = new ImageIcon(getClass().getResource("3.png"));
        JLabel Imagelabel = new JLabel(img);
        Imagelabel.setBounds(150, 10, img.getIconWidth(), img.getIconHeight());
        //Imagelabel.setBounds(0,0,700,700);
        c.add(Imagelabel);

        f = new Font("Algerian", Font.BOLD, 24);
        ff = new Font("Algerian", Font.BOLD, 50);

        label = new JLabel("Welcome  Admin");
        label.setBounds(180, 260, 550, 100);
        label.setBackground(Color.WHITE);
        label.setForeground(Color.black);
        label.setFont(ff);
        c.add(label);

        grp = new ButtonGroup();

        student = new JRadioButton("Student");
        student.setBounds(250, 550, 200, 30);
        student.setBackground(Color.getHSBColor(27F, 28F, 28F));
        student.setFont(f);
        c.add(student);

        /* student = new JRadioButton("Setting");
       student.setBounds(250,700,150,30);
       student.setBackground(Color.WHITE);
       student.setFont(f);
       c.add(student);*/
        admission = new JRadioButton("Admission");
        admission.setBounds(450, 550, 250, 30);
        admission.setBackground(Color.getHSBColor(27F, 28F, 28F));
        admission.setFont(f);
        c.add(admission);

        grp.add(student);
        grp.add(setting);

        submitButton = new JButton("Submit");
        submitButton.setBounds(360, 610, 130, 30);
        submitButton.setFont(f);
        c.add(submitButton);

        Handler handler = new Handler();

        student.addActionListener(handler);
        //setting.addActionListener(handler);
        submitButton.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (admission.isSelected()) {
                if (e.getSource() == submitButton) {
                    Admission frame= new Admission();
                    frame.setVisible(true);
                }
            } else if (student.isSelected()) {
                if (e.getSource() == submitButton) {

                    Student_Info frame = new Student_Info();
                    frame.setVisible(true);
                    dispose();
                }
            }

        }
    }

    public static void main(String[] args) {

        Admin frame = new Admin();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
