/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstForm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Entry extends JFrame {

    private Container c;
    private Font f, ff;
    private JRadioButton adminlogin, studentlogin;
    private ButtonGroup grp;
    private JButton submitButton,back;
    private JLabel label, label1, label2, label3;
    private BorderLayout blayout;

    Entry() {
        initcomponents();
    }
    
    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 1000, 800);
        this.setTitle("Entry Form");
        //blayout = new BorderLayout();
        
        c = this.getContentPane();
        c.setBackground(Color.WHITE);
        setLayout(null);
        
        f = new Font("Courier New", Font.PLAIN, 18);
        f = new Font("Courier New", Font.ITALIC, 18);
        ff = new Font("Algerian", Font.BOLD,40);
        
        label = new JLabel("Welcome  to Student Management System");
        label.setBounds(20, 100,950, 100);
        label.setBackground(Color.WHITE);
        label.setForeground(Color.BLACK);
        label.setFont(ff);
        c.add(label);
        label1 = new JLabel(" info@uiu.ac.bd  |  +800096009765   |   United City, Madani Avenue, Badda, Dhaka");
        label1.setBounds(0,0,1000,30);
        label1.setBackground(Color.ORANGE);
        label1.setForeground(Color.BLACK);
        label1.setFont(f);
        c.add(label1);
        
        label2 = new JLabel("<<<The vision of UIU is to become the centre of excellence>>>");
        label2.setBounds(250,100,750,200);
        label2.setBackground(Color.ORANGE);
        label2.setForeground(Color.ORANGE);
        label2.setFont(f);
        c.add(label2);
        
        grp = new ButtonGroup();
        
        submitButton = new JButton("Log in->");
        submitButton.setBounds(850,50,130, 30);
        submitButton.setOpaque(false);
        submitButton.setFont(f);
        c.add(submitButton);
        
        
        ImageIcon img = new ImageIcon(getClass().getResource("uiu.jpg"));
        JLabel Imagelabel = new JLabel(img);
        Imagelabel.setBounds(0,30, img.getIconWidth(), img.getIconHeight());
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
           
                if (e.getSource() == submitButton) {
                    EntryForm frame1 = new EntryForm();
        frame1.setVisible(true); 
                }
            
            
        }
    }

    public static void main(String[] args) {
        Entry frame1 = new Entry();
        frame1.setVisible(true);        
    }
}
