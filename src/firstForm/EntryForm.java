package firstForm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class EntryForm extends JFrame {

    private Container c;
    private Font f, ff;
    private JRadioButton adminlogin, studentlogin;
    private ButtonGroup grp;
    private JButton submitButton;
    private JLabel label, label1, label2, label3;
    private BorderLayout blayout;

    EntryForm() {
        initcomponents();
    }
    
    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 1000, 800);
        this.setTitle("Entry Form");
        //blayout = new BorderLayout();
        
        c = this.getContentPane();
        // c.setBackground(Color.getHSBColor(27F,28F,28F ));
        setLayout(null);
        
        f = new Font("Algerian", Font.BOLD, 30);
        ff = new Font("Algerian", Font.BOLD, 60);
        
        label = new JLabel("Welcome  Admin");
        label.setBounds(180, 100, 550, 100);
        label.setBackground(Color.WHITE);
        label.setForeground(Color.WHITE);
        label.setFont(ff);
        c.add(label);
        
        grp = new ButtonGroup();
        
        adminlogin = new JRadioButton("Admin Login");
        adminlogin.setBounds(250, 300, 400, 30);
        adminlogin.setOpaque(false);
        adminlogin.setForeground(Color.WHITE);
        adminlogin.setFont(f);
        
        c.add(adminlogin);
        
        studentlogin = new JRadioButton("Student Login");
        studentlogin.setBounds(250, 350, 400, 30);
        studentlogin.setOpaque(false);
        studentlogin.setForeground(Color.WHITE);
        studentlogin.setFont(f);
        c.add(studentlogin);
        
        grp.add(studentlogin);
        grp.add(adminlogin);
        
        submitButton = new JButton("Submit");
        submitButton.setBounds(300, 550, 330, 30);
        submitButton.setOpaque(false);
        submitButton.setFont(f);
        c.add(submitButton);
        
        ImageIcon img = new ImageIcon(getClass().getResource("ufff.png"));
        JLabel Imagelabel = new JLabel(img);
        Imagelabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        //Imagelabel.setBounds(0,0,700,700);
        c.add(Imagelabel);
        
        Handler handler = new Handler();
        
        submitButton.addActionListener(handler);
        //setting.addActionListener(handler);
        submitButton.addActionListener(handler);
        
    }
    
    class Handler implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (adminlogin.isSelected()) {
                if (e.getSource() == submitButton) {
                    AdminLogin frame = new AdminLogin();
                    frame.setVisible(true);
                }
            } else if (studentlogin.isSelected()) {
                if (e.getSource() == submitButton) {
                    
                    StudntLogin frame = new StudntLogin();
                    frame.setVisible(true);
                    dispose();
                }
            }
            
        }
    }

    public static void main(String[] args) {
        EntryForm frame1 = new EntryForm();
        frame1.setVisible(true);        
    }
}
