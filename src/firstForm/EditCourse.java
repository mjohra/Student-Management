package firstForm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class EditCourse extends JFrame {

    private Container c;
    private Font f, ff;
    private JRadioButton withdraw, incomplete, completed;
    private ButtonGroup grp;
    private JButton donebtn;
    private JLabel label, label1, label2, label3;
    private BorderLayout blayout;

    EditCourse() {
        initcomponents();
    }

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100,500,500);
        this.setTitle("Entry Form");
        //blayout = new BorderLayout();

        c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F,28F,28F ));
        setLayout(null);

        f = new Font("Tahoma", Font.PLAIN,25);
        ff = new Font("Algerian", Font.BOLD, 60);

        grp = new ButtonGroup();

        withdraw = new JRadioButton("Withdraw");
        withdraw.setBounds(100, 100, 400, 30);
        withdraw.setOpaque(false);
        withdraw.setForeground(Color.BLACK);
        withdraw.setFont(f);

        c.add(withdraw);

        incomplete = new JRadioButton("Incomplete");
        incomplete.setBounds(100, 150, 400, 30);
        incomplete.setOpaque(false);
        incomplete.setForeground(Color.BLACK);
        incomplete.setFont(f);
        c.add(incomplete);

        completed = new JRadioButton("Completed");
        completed.setBounds(100, 200, 400, 30);
        completed.setOpaque(false);
        completed.setForeground(Color.BLACK);
        completed.setFont(f);
        c.add(completed);
        
        donebtn = new JButton("Done");
        donebtn .setBounds(200,350, 120, 40);
        donebtn .setFont(f);
        c.add(donebtn );

        grp.add(completed);
        grp.add(withdraw);
        grp.add(incomplete);

        Handler handler = new Handler();

        withdraw.addActionListener(handler);
        //setting.addActionListener(handler);
        incomplete.addActionListener(handler);
        completed.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (withdraw.isSelected()) {
                if(e.getSource()==donebtn)
                
                {
                    // String w = withdraw.gets
                }
            } else if (incomplete.isSelected()) {
                

            } else if (completed.isSelected()) {

            }
        }
    }

    public static void main(String[] args) {
        EditCourse frame = new EditCourse();
        frame.setVisible(true);
    }

}
