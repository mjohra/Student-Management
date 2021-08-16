/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstForm;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.*;

public class Admission extends JFrame {

    private Container c;
    private Font f, f1, f2;
    private JPanel panel1, panel2;
    private JLabel label1, bloodLabel;
    private JLabel lb, lab, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15;
    JTextField idtf1, tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12;
    private BoxLayout box;
    private BorderLayout blayout;
    private ImageIcon img;
    private JLabel Imagelabel;
    JRadioButton male, female, other;
    private ButtonGroup grp1;
    JComboBox cb1, cb2, cb3, cb4, cb;
    private JButton addbtn, clearbtn, backbtn, deletebtn, updatebtn;
    private Cursor cursor;
    String[] date = {"Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
        "25", "26", "27", "28", "29", "30", "31"};
    String[] month = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December"};
    String[] year = {"Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
        "1999", "2000", "2001"};
    String[] blood = {"A+", "B+", "O+", "AB+", "A-", "B-", "0-", "AB-"};
    String[] C = {"CSE", "BBA", "EEE"};
    ArrayList<Accountinfo> AccountList = new ArrayList<>();

    private FileReader fr;
    private BufferedReader br;
    private FileWriter writer;
    private BufferedWriter bw;

    Admission() {
        initcomponents();
    }

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 10, 800, 970);
        this.setTitle("Admission Form");

        blayout = new BorderLayout();

        c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        c.setLayout(null);

        f = new Font("Tohoma", Font.BOLD, 18);
        f1 = new Font("Algerian", Font.BOLD, 50);
        f2 = new Font("Courier New", Font.PLAIN,20);

        /* panel1=new JPanel();
       panel1.setBounds(0,0,900,70);
       panel1.setBackground(Color.GRAY);
       c.add(panel1,BorderLayout.NORTH);
       
      /* panel2=new JPanel();
       panel2.setBounds(0,70,900,860);
       panel2.setBackground(Color.WHITE);
       c.add(panel2);*/
        label1 = new JLabel("REGISTRATION FORM");
        label1.setBounds(80, 30, 800, 80);
        label1.setForeground(Color.BLACK);
        label1.setFont(f1);
        c.add(label1);

        label2 = new JLabel("Name");
        label2.setBounds(35, 170, 100, 50);
        label2.setFont(f2);
        label2.setForeground(Color.BLACK);
        label2.setBackground(Color.WHITE);
        //label2.setHorizontalAlignment(JTextField.CENTER);
        c.add(label2);

        tf1 = new JTextField();
        tf1.setBounds(215, 180, 400, 30);
        tf1.setFont(f2);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);

        label3 = new JLabel("Gender");
        label3.setBounds(35, 220, 200, 50);
        label3.setFont(f2);
        label3.setForeground(Color.BLACK);
        label3.setBackground(Color.WHITE);
        //label3.setHorizontalAlignment(JTextField.CENTER);
        c.add(label3);

        grp1 = new ButtonGroup();

        male = new JRadioButton("Male");
        male.setBounds(215, 225, 80, 30);
        male.setBackground(Color.WHITE);
        male.setFont(f);
        c.add(male);
        female = new JRadioButton("Female");
        female.setBounds(310, 225, 90, 30);
        female.setBackground(Color.WHITE);
        female.setFont(f);
        c.add(female);

        other = new JRadioButton("Others");
        other.setBounds(410, 225, 90, 30);
        other.setBackground(Color.WHITE);
        other.setFont(f);
        c.add(other);

        grp1.add(male);
        grp1.add(female);
        grp1.add(other);

        label4 = new JLabel("Date Of Birth");
        label4.setBounds(35, 270, 200, 50);
        label4.setFont(f2);
        label4.setForeground(Color.BLACK);
        label4.setBackground(Color.WHITE);
        //label4.setHorizontalAlignment(JTextField.CENTER);
        c.add(label4);

        cb1 = new JComboBox(date);
        cb1.setBounds(215, 275, 100, 30);
        cb1.setFont(f2);
        cb1.setBackground(Color.WHITE);
        c.add(cb1);

        cb2 = new JComboBox(month);
        cb2.setBounds(325, 275, 150, 30);
        cb2.setFont(f2);
        cb2.setBackground(Color.WHITE);
        c.add(cb2);

        cb3 = new JComboBox(year);
        cb3.setBounds(490, 275, 100, 30);
        cb3.setFont(f2);
        cb3.setBackground(Color.WHITE);
        c.add(cb3);

        lab = new JLabel("Department");
        lab.setBounds(35,320, 200, 50);
        lab.setFont(f2);
        lab.setForeground(Color.BLACK);
        lab.setBackground(Color.WHITE);
        //label4.setHorizontalAlignment(JTextField.CENTER);
        c.add(lab);

        cb = new JComboBox(C);
        cb.setBounds(215, 330, 100, 30);
        cb.setFont(f2);
        cb.setBackground(Color.WHITE);
        c.add(cb);

        label6 = new JLabel("Phone");
        label6.setBounds(35, 380, 100, 50);
        label6.setFont(f2);
        label6.setForeground(Color.BLACK);
        label6.setBackground(Color.WHITE);
        c.add(label6);

        tf3 = new JTextField();
        tf3.setBounds(215, 390, 400, 30);
        tf3.setFont(f2);
        tf3.setForeground(Color.BLACK);
        tf3.setBackground(Color.WHITE);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf3);

        label7 = new JLabel("Address");
        label7.setBounds(35, 430, 200, 50);
        label7.setFont(f2);
        label7.setForeground(Color.BLACK);
        label7.setBackground(Color.WHITE);
        c.add(label7);

        tf4 = new JTextField();
        tf4.setBounds(215, 440, 400, 30);
        tf4.setFont(f2);
        tf4.setForeground(Color.BLACK);
        tf4.setBackground(Color.WHITE);
        tf4.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf4);

      /*  label8 = new JLabel("Parmanent Address");
        label8.setBounds(35, 410, 200, 50);
        label8.setFont(f2);
        label8.setForeground(Color.BLACK);
        label8.setBackground(Color.white);
        c.add(label8);

        tf5 = new JTextField();
        tf5.setBounds(215, 420, 400, 30);
        tf5.setFont(f2);
        tf5.setForeground(Color.BLACK);
        tf5.setBackground(Color.WHITE);
        tf5.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf5);*/

        label9 = new JLabel("Father's Name");
        label9.setBounds(35, 480, 200, 50);
        label9.setFont(f2);
        label9.setForeground(Color.BLACK);
        label9.setBackground(Color.WHITE);
        c.add(label9);

        tf6 = new JTextField();
        tf6.setBounds(215,490, 400, 30);
        tf6.setFont(f2);
        tf6.setForeground(Color.BLACK);
        tf6.setBackground(Color.WHITE);
        tf6.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf6);

      /*  label10 = new JLabel("Occupation");
        label10.setBounds(35, 490, 100, 50);
        label10.setFont(f2);
        label10.setForeground(Color.BLACK);
        label10.setBackground(Color.WHITE);
        c.add(label10);

        tf7 = new JTextField();
        tf7.setBounds(215, 500, 400, 30);
        tf7.setFont(f2);
        tf7.setForeground(Color.BLACK);
        tf7.setBackground(Color.WHITE);
        tf7.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf7);

        label11 = new JLabel("Phone");
        label11.setBounds(35, 530, 100, 50);
        label11.setFont(f2);
        label11.setForeground(Color.BLACK);
        label11.setBackground(Color.WHITE);
        c.add(label11);

        tf8 = new JTextField();
        tf8.setBounds(215, 540, 400, 30);
        tf8.setFont(f2);
        tf8.setForeground(Color.BLACK);
        tf8.setBackground(Color.WHITE);
        tf8.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf8);*/

        label12 = new JLabel("Mother's Name");
        label12.setBounds(35,530, 200, 50);
        label12.setFont(f2);
        label12.setForeground(Color.BLACK);
        label12.setBackground(Color.WHITE);
        c.add(label12);

        tf9 = new JTextField();
        tf9.setBounds(215, 540, 400, 30);
        tf9.setFont(f2);
        tf9.setForeground(Color.BLACK);
        tf9.setBackground(Color.WHITE);
        tf9.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf9);

      /*  label13 = new JLabel("Occupation");
        label13.setBounds(35, 610, 100, 50);
        label13.setFont(f2);
        label13.setForeground(Color.BLACK);
        label13.setBackground(Color.WHITE);
        c.add(label13);

        tf10 = new JTextField();
        tf10.setBounds(215, 620, 400, 30);
        tf10.setFont(f2);
        tf10.setForeground(Color.BLACK);
        tf10.setBackground(Color.WHITE);
        tf10.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf10);

        label14 = new JLabel("Phone");
        label14.setBounds(35, 650, 100, 50);
        label14.setFont(f2);
        label14.setForeground(Color.BLACK);
        label14.setBackground(Color.WHITE);
        c.add(label14);

        tf11 = new JTextField();
        tf11.setBounds(215, 660, 400, 30);
        tf11.setFont(f2);
        tf11.setForeground(Color.BLACK);
        tf11.setBackground(Color.WHITE);
        tf11.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf11);*/

        label15 = new JLabel("Email");
        label15.setBounds(35,580, 100, 50);
        label15.setFont(f2);
        label15.setForeground(Color.BLACK);
        label15.setBackground(Color.WHITE);
        c.add(label15);

        tf12 = new JTextField();
        tf12.setBounds(215,590, 400, 30);
        tf12.setFont(f2);
        tf12.setForeground(Color.BLACK);
        tf12.setBackground(Color.WHITE);
        tf12.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf12);

        bloodLabel = new JLabel("Blood Group");
        bloodLabel.setBounds(35,690, 200, 50);
        bloodLabel.setFont(f2);
        bloodLabel.setForeground(Color.BLACK);
        bloodLabel.setBackground(Color.WHITE);
        c.add(bloodLabel);

        cb4 = new JComboBox(blood);
        cb4.setBounds(215,700, 100, 35);
        cb4.setFont(f2);
        cb4.setBackground(Color.WHITE);
        c.add(cb4);
        label5 = new JLabel("Nationality");
        label5.setBounds(35,625, 150, 50);
        label5.setFont(f2);
        label5.setForeground(Color.BLACK);
        label5.setBackground(Color.white);
        c.add(label5);

        tf2 = new JTextField();
        tf2.setBounds(215,635, 400, 30);
        tf2.setFont(f2);
        tf2.setForeground(Color.BLACK);
        tf2.setBackground(Color.WHITE);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);

        lb = new JLabel();
        lb.setBounds(35, 690, 200, 50);
        lb.setFont(f2);
        lb.setForeground(Color.BLACK);
        lb.setBackground(Color.WHITE);
        c.add(lb);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        clearbtn = new JButton("Clear");
        clearbtn.setBounds(390, 830, 100, 30);
        clearbtn.setFont(f);
        clearbtn.setCursor(cursor);
        c.add(clearbtn);
        backbtn = new JButton("Back");
        backbtn.setBounds(500, 830, 100, 30);
        backbtn.setFont(f);
        backbtn.setCursor(cursor);
        c.add(backbtn);

        addbtn = new JButton("Add Student");
        addbtn.setBounds(230, 830, 150, 30);
        addbtn.setFont(f);
        addbtn.setCursor(cursor);
        c.add(addbtn);
        /* deletebtn = new JButton("Delete");
        deletebtn.setBounds(650, 380, 100, 30);
        deletebtn.setFont(f);
        deletebtn.setCursor(cursor);
        c.add(deletebtn);

        updatebtn = new JButton("Update");
        updatebtn.setBounds(650, 420, 100, 30);
        updatebtn.setFont(f);
        updatebtn.setCursor(cursor);
        c.add(updatebtn);*/

        backbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
        Admin frame = new Admin();
        frame.setVisible(true);
                dispose();

            }

        });

        clearbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //idtf1.setText("");
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                tf10.setText("");
                tf11.setText("");
                tf12.setText("");
            }
        });

        addbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                String name1 = tf1.getText();
                String name2 = tf2.getText();
                String name3 = tf3.getText();
                String name4 = tf4.getText();
               // String name5 = tf5.getText();
                String name6 = tf6.getText();
               // String name7 = tf7.getText();
               // String name8 = tf8.getText();
                String name9 = tf9.getText();
               // String name10 = tf10.getText();
                //String name11 = tf11.getText();
                String name12 = tf12.getText();
                String bloodgrp = (String) cb4.getSelectedItem();
                String dept = (String) cb.getSelectedItem();
                
                male.setActionCommand("Male");
                female.setActionCommand("Female");
                String gender=grp1.getSelection().getActionCommand();
                

                if (name1.equals("") || name2.equals("") || name3.equals("") || name4.equals("")
                        || name6.equals("")|| name9.equals("")|| name12.equals("") || dept.equals("")||bloodgrp.equals("")) {

                    {
                        JOptionPane.showMessageDialog(null, "Invalid input");
                    }

                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                   // tf5.setText("");
                    tf6.setText("");
                   // tf7.setText("");
                   // tf8.setText("");
                    tf9.setText("");
                    //tf10.setText("");
                    //tf11.setText("");
                    tf12.setText("");

                } else {

                    JOptionPane.showMessageDialog(null, "You are successfully logged in");

                    try {
                        FileWriter writer = new FileWriter("accountfile.txt", true);
                        writer.write(name1 + ",");
                        writer.write(dept + ",");
                        writer.write(gender+",");
                        writer.write(gender+",");
                        //writer.write(credit+",");
                        //writer.write("0.0" + ",");
                        //writer.write("171" + ",");
                       // writer.write(name2 + ",");
                        writer.write(name3 + ",");
                        writer.write(name4 + ",");
                       // writer.write(name5 + ",");
                        writer.write(name6 + ",");
                        //writer.write(name7 + ",");
                       // writer.write(name8 + ",");
                        writer.write(name9 + ",");
                       // writer.write(name10 + ",");
                        //writer.write(name11 + ",");
                        writer.write(name12 + ",");
                        writer.write(bloodgrp+",");
                        writer.write(name2 + ",");
                        writer.write(System.getProperty("line.separator"));
                        writer.close();
                        /* try {
                        fw = new FileWriter("accountfile.txt", true);
                        bw = new BufferedWriter(fw);
                        fr = new FileReader("accountfile.txt");
                        br = new BufferedReader(fr);

                        CourseInfo course;
                        course = new CourseInfo();
                        
                        course.setCourseCode(tf1.getText());
                        bw.write(tf1.getText() + ",");
                        bw.flush();

                        course.setCourseTitle(tf3.getText());
                        bw.write(tf2.getText() + ",");
                        bw.flush();
                        course.setCredit(tf3.getText());
                        bw.write(tf3.getText() + ",");
                        bw.flush();

                        } catch (IOException ex) {
                        Logger.getLogger(AddCourse.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
                    } catch (IOException ex) {
                        Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
            }

        });

        //CHECK TF1
        tf1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf1.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1= " + s);
                }
            }
        });

        tf2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf2.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1= " + s);
                }
            }
        });
        tf2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf1.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2= " + s);
                }
            }
        });
        tf3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf3.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf3= " + s);
                }
            }
        });
        tf4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf4.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf4= " + s);
                }
            }
        });
       /* tf5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf1.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf5= " + s);
                }
            }
        });*/
        tf6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf6.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf6= " + s);
                }
            }
        });

      /*  tf7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf7.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf7= " + s);
                }
            }
        });
        tf8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf8.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf8= " + s);
                }
            }
        });*/
        tf9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf9.getText();
                if (s.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "You didnt enter anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf9= " + s);
                }
            }
        });

    }

    public static void main(String[] args) {
        Admission frame = new Admission();
        frame.setVisible(true);
    }

}
