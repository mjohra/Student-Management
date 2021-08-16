package firstForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CGPA extends JFrame {

    Font f, f1, f2;
    private JLabel label, label2, DATA;
    private JComboBox cr1, gr1, cr2, gr2, cr3, gr3, cr4, gr4, cr5, gr5, cr6, gr6, cr7, gr7, cr8, gr8, cr9, gr9;
    private String[] credit = {"Credits", "1", "2", "3", "4", "5", "6"};
    private String[] grade = {"Grades", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
    private JButton cgpabtn;

    CGPA() {
        initcomponents();
    }

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 100, 600, 800);
        this.setTitle("Cgpa Calculator");

        Container c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        //c.setBackground(Color.lightGray);
        c.setLayout(null);
        f = new Font("Algerian", Font.ITALIC, 50);
        f1 = new Font("Courier New", Font.PLAIN, 25);
        f2 = new Font("Courier New", Font.PLAIN, 20);

        label = new JLabel("1.");
        label.setBounds(100, 100, 150, 20);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        cr1 = new JComboBox(credit);
        cr1.setBounds(150, 95, 110, 30);
        cr1.setFont(f2);
        cr1.setBackground(Color.WHITE);
        cr1.setOpaque(false);
        c.add(cr1);

        gr1 = new JComboBox(grade);
        gr1.setBounds(300, 95, 110, 30);
        gr1.setFont(f2);
        gr1.setBackground(Color.WHITE);
        gr1.setOpaque(false);
        c.add(gr1);

        label = new JLabel("2.");
        label.setBounds(100, 150, 150, 20);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        cr2 = new JComboBox(credit);
        cr2.setBounds(150, 145, 110, 30);
        cr2.setFont(f2);
        cr2.setBackground(Color.WHITE);
        cr2.setOpaque(false);
        c.add(cr2);

        gr2 = new JComboBox(grade);
        gr2.setBounds(300, 145, 110, 30);
        gr2.setFont(f2);
        gr2.setBackground(Color.WHITE);
        gr2.setOpaque(false);
        c.add(gr2);

        label = new JLabel("3.");
        label.setBounds(100, 200, 150, 20);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        cr3 = new JComboBox(credit);
        cr3.setBounds(150, 195, 110, 30);
        cr3.setFont(f2);
        cr3.setBackground(Color.WHITE);
        cr3.setOpaque(false);
        c.add(cr3);
        gr3 = new JComboBox(grade);
        gr3.setBounds(300, 195, 110, 30);
        gr3.setFont(f2);
        gr3.setBackground(Color.WHITE);
        gr3.setOpaque(false);
        c.add(gr3);
    /*    label = new JLabel("4.");
        label.setBounds(100, 250, 150, 20);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        cr4 = new JComboBox(credit);
        cr4.setBounds(150, 245, 110, 30);
        cr4.setFont(f2);
        cr4.setBackground(Color.WHITE);
        cr4.setOpaque(false);
        c.add(cr4);
        gr4 = new JComboBox(grade);
        gr4.setBounds(300, 245, 110, 30);
        gr4.setFont(f2);
        gr4.setBackground(Color.WHITE);
        gr4.setOpaque(false);
        c.add(gr4);
        label = new JLabel("5.");
        label.setBounds(100, 300, 150, 20);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        cr5 = new JComboBox(credit);
        cr5.setBounds(150, 295, 110, 30);
        cr5.setFont(f2);
        cr5.setBackground(Color.WHITE);
        cr5.setOpaque(false);
        c.add(cr5);

        gr5 = new JComboBox(grade);
        gr5.setBounds(300, 295, 110, 30);
        gr5.setFont(f2);
        gr5.setBackground(Color.WHITE);
        gr5.setOpaque(false);
        c.add(gr5);

        label = new JLabel("6.");
        label.setBounds(100, 350, 150, 20);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        cr6 = new JComboBox(credit);
        cr6.setBounds(150, 345, 110, 30);
        cr6.setFont(f2);
        cr6.setBackground(Color.WHITE);
        cr6.setOpaque(false);
        c.add(cr6);

        gr6 = new JComboBox(grade);
        gr6.setBounds(300, 345, 110, 30);
        gr6.setFont(f2);
        gr6.setBackground(Color.WHITE);
        gr6.setOpaque(false);
        c.add(gr6);

        label = new JLabel("7.");
        label.setBounds(100, 400, 150, 20);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        cr7 = new JComboBox(credit);
        cr7.setBounds(150, 395, 110, 30);
        cr7.setFont(f2);
        cr7.setBackground(Color.WHITE);
        cr7.setOpaque(false);
        c.add(cr7);
        gr7 = new JComboBox(grade);
        gr7.setBounds(300, 395, 110, 30);
        gr7.setFont(f2);
        gr7.setBackground(Color.WHITE);
        gr7.setOpaque(false);
        c.add(gr7);
        label = new JLabel("8.");
        label.setBounds(100, 450, 150, 20);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        cr8 = new JComboBox(credit);
        cr8.setBounds(150, 445, 110, 30);
        cr8.setFont(f2);
        cr8.setBackground(Color.WHITE);
        cr8.setOpaque(false);
        c.add(cr8);

        gr8 = new JComboBox(grade);
        gr8.setBounds(300, 445, 110, 30);
        gr8.setFont(f2);
        gr8.setBackground(Color.WHITE);
        gr8.setOpaque(false);
        c.add(gr8);

        label = new JLabel("9.");
        label.setBounds(100, 500, 150, 20);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f2);
        c.add(label);

        cr9 = new JComboBox(credit);
        cr9.setBounds(150, 495, 110, 30);
        cr9.setFont(f2);
        cr9.setBackground(Color.WHITE);
        cr9.setOpaque(false);
        c.add(cr9);
        gr9 = new JComboBox(grade);
        gr9.setBounds(300, 495, 110, 30);
        gr9.setFont(f2);
        gr9.setBackground(Color.WHITE);
        gr9.setOpaque(false);
        c.add(gr9);*/

        label2 = new JLabel("");
        label2.setBounds(100, 600, 150, 20);
        label2.setForeground(Color.BLACK);
        label2.setOpaque(false);
        label2.setFont(f2);
        c.add(label2);

        cgpabtn = new JButton("Calculate");
        cgpabtn.setBounds(180, 555, 200, 30);
        //infobtn.setBackground(Color.darkGray);
        cgpabtn.setOpaque(false);
        cgpabtn.setForeground(Color.BLACK);
        cgpabtn.setFont(f2);
        c.add(cgpabtn);

        Handler handler = new Handler();
        cgpabtn.addActionListener(handler);
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == cgpabtn) {
                double credsum = 0.0, gradsum = 0.0;
                String sub1 = (String) cr1.getSelectedItem();
                credsum = credsum + Double.parseDouble(sub1);
                String sub2 = (String) cr2.getSelectedItem();
                credsum = credsum + Double.parseDouble(sub2);
                String sub3 = (String) cr3.getSelectedItem();
                credsum = credsum + Double.parseDouble(sub3);
             /*   String sub4 = (String) cr4.getSelectedItem();
                credsum = credsum + Double.parseDouble(sub4);
                String sub5 = (String) cr5.getSelectedItem();
                credsum = credsum + Double.parseDouble(sub5);
                String sub6 = (String) cr6.getSelectedItem();
                credsum = credsum + Double.parseDouble(sub6);
                String sub7 = (String) cr7.getSelectedItem();
                credsum = credsum + Double.parseDouble(sub7);
                String sub8 = (String) cr8.getSelectedItem();
                credsum = credsum + Double.parseDouble(sub8);
                String sub9 = (String) cr9.getSelectedItem();
                credsum = credsum + Double.parseDouble(sub9);*/

                String grade1 = (String) gr1.getSelectedItem();
                if (grade1.equals("A")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 4.0);
                }
                if (grade1.equals("A-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.67);
                }
                if (grade1.equals("B+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.33);
                }
                if (grade1.equals("B")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.00);
                }
                if (grade1.equals("B-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.67);
                }
                if (grade1.equals("C+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.33);
                }
                if (grade1.equals("C")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.0);
                }
                if (grade1.equals("C-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.67);
                }

                if (grade1.equals("D+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.33);
                }
                if (grade1.equals("D")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.00);
                }
                if (grade1.equals("F")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 0.0);
                }

                String grade2 = (String) gr2.getSelectedItem();
                if (grade2.equals("A")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 4.0);
                }
                if (grade2.equals("A-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.67);
                }
                if (grade2.equals("B+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.33);
                }
                if (grade2.equals("B")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.00);
                }
                if (grade2.equals("B-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.67);
                }
                if (grade2.equals("C+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.33);
                }
                if (grade2.equals("C")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.0);
                }
                if (grade2.equals("C-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.67);
                }

                if (grade2.equals("D+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.33);
                }
                if (grade2.equals("D")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.00);
                }
                if (grade2.equals("F")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 0.0);
                }

                String grade3 = (String) gr3.getSelectedItem();
                if (grade3.equals("A")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 4.0);
                }
                if (grade3.equals("A-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.67);
                }
                if (grade3.equals("B+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.33);
                }
                if (grade3.equals("B")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.00);
                }
                if (grade3.equals("B-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.67);
                }
                if (grade3.equals("C+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.33);
                }
                if (grade3.equals("C")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.0);
                }
                if (grade3.equals("C-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.67);
                }

                if (grade3.equals("D+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.33);
                }
                if (grade3.equals("D")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.00);
                }
                if (grade3.equals("F")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 0.0);
                }

              /*  String grade4 = (String) gr4.getSelectedItem();
                if (grade4.equals("A")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 4.0);
                }
                if (grade4.equals("A-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.67);
                }
                if (grade4.equals("B+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.33);
                }
                if (grade4.equals("B")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.00);
                }
                if (grade4.equals("B-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.67);
                }
                if (grade4.equals("C+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.33);
                }
                if (grade4.equals("C")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.0);
                }
                if (grade4.equals("C-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.67);
                }

                if (grade4.equals("D+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.33);
                }
                if (grade4.equals("D")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.00);
                }
                if (grade4.equals("F")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 0.0);
                }

                String grade5 = (String) gr5.getSelectedItem();

                if (grade5.equals("A")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 4.0);
                }
                if (grade5.equals("A-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.67);
                }
                if (grade5.equals("B+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.33);
                }
                if (grade5.equals("B")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.00);
                }
                if (grade5.equals("B-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.67);
                }
                if (grade5.equals("C+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.33);
                }
                if (grade5.equals("C")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.0);
                }
                if (grade5.equals("C-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.67);
                }

                if (grade5.equals("D+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.33);
                }
                if (grade5.equals("D")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.00);
                }
                if (grade5.equals("F")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 0.0);
                }

                String grade6 = (String) gr6.getSelectedItem();
                // String grade1=(String)gr1.getSelectedItem();

                if (grade6.equals("A")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 4.0);
                }
                if (grade6.equals("A-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.67);
                }
                if (grade6.equals("B+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.33);
                }
                if (grade6.equals("B")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.00);
                }
                if (grade6.equals("B-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.67);
                }
                if (grade6.equals("C+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.33);
                }
                if (grade1.equals("C")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.0);
                }
                if (grade6.equals("C-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.67);
                }

                if (grade6.equals("D+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.33);
                }
                if (grade6.equals("D")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.00);
                }
                if (grade6.equals("F")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 0.0);
                }

                //String grade7=(String)gr7.getSelectedItem();
                String grade7 = (String) gr7.getSelectedItem();
                if (grade7.equals("A")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 4.0);
                }
                if (grade7.equals("A-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.67);
                }
                if (grade7.equals("B+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.33);
                }
                if (grade7.equals("B")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.00);
                }
                if (grade7.equals("B-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.67);
                }
                if (grade7.equals("C+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.33);
                }
                if (grade7.equals("C")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.0);
                }
                if (grade7.equals("C-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.67);
                }

                if (grade7.equals("D+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.33);
                }
                if (grade7.equals("D")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.00);
                }
                if (grade7.equals("F")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 0.0);
                }

                String grade8 = (String) gr8.getSelectedItem();
                if (grade8.equals("A")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 4.0);
                }
                if (grade8.equals("A-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.67);
                }
                if (grade8.equals("B+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.33);
                }
                if (grade8.equals("B")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.00);
                }
                if (grade8.equals("B-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.67);
                }
                if (grade8.equals("C+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.33);
                }
                if (grade8.equals("C")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.0);
                }
                if (grade8.equals("C-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.67);
                }

                if (grade8.equals("D+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.33);
                }
                if (grade8.equals("D")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.00);
                }
                if (grade8.equals("F")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 0.0);
                }

                String grade9 = (String) gr9.getSelectedItem();
                if (grade9.equals("A")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 4.0);
                }
                if (grade9.equals("A-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.67);
                }
                if (grade9.equals("B+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.33);
                }
                if (grade9.equals("B")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 3.00);
                }
                if (grade9.equals("B-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.67);
                }
                if (grade9.equals("C+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.33);
                }
                if (grade7.equals("C")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 2.0);
                }
                if (grade9.equals("C-")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.67);
                }

                if (grade9.equals("D+")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.33);
                }
                if (grade9.equals("D")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 1.00);
                }
                if (grade9.equals("F")) {
                    gradsum = gradsum + (Double.parseDouble(sub1) * 0.0);
                }*/

                double gpac = gradsum / credsum;

                String data3 = "GPA :" + gpac;

                label2.setText(data3);
            }

        }
    }

    public static void main(String[] args) {

        CGPA frame = new CGPA();
        frame.setVisible(true);
        frame.setResizable(false);

    }

}
