/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class StudentCourseDetails extends JFrame {
     private Font f, f1, f2;
     Container c;
     private JTextArea ta;
     private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private String[] columns = {"Course id","Course Name","Credit","Semister","Marks"};
    Object[] row = new Object[5];
    Object[] row1 = new Object[5];
    Object[] row2 = new Object[35];
    String arr2[] = new String[40];
    String arr3[] = new String[40];
    
    StudentCourseDetails()
    {
        initcomponents();
        
    }
    
     private void initcomponents() {
        
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 10, 900,900);
        this.setTitle("Student Page");

        c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        c.setLayout(null);
        f = new Font("Algerian", Font.BOLD, 55);
        f1 = new Font("Courier New", Font.PLAIN, 18);
        f2 = new Font("Tahoma", Font.PLAIN, 25);
        
        ta = new JTextArea();
        ta.setBounds(150, 20,500,100);
        ta.setBackground(Color.getHSBColor(27F, 28F, 28F));
        ta.setFont(f1);
        c.add(ta);
        
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(f1);
        table.setSelectionBackground(Color.YELLOW);
        table.setBackground(Color.getHSBColor(27F, 28F, 28F));
        table.setRowHeight(30);

        scroll = new JScrollPane(table);
        scroll.setBounds(30,150,800,600);
        scroll.setBackground(Color.getHSBColor(27F, 28F, 28F));
        c.add(scroll);
        
        int i=3;
         try {
                 

            File file1 = new File("temp2.txt");
            BufferedReader br2 = new BufferedReader(new FileReader(file1));
            ta.setText("");
            String line,line2;
            while ((line = br2.readLine()) != null) {
                 arr2 = line.split(",");
                 
                 System.out.println(line);
                
                 ta.setText("ID:"+arr2[0]+"\n\n"+"Name: "+arr2[1]+"\n\n"+"Department: "+arr2[3]+"\n\n");
                 System.out.println(line);
                
               
               
                    Object row[] = {arr2[4],arr2[5],arr2[6],arr2[7],arr2[8]};
                    Object row1[] = {arr2[9],arr2[10],arr2[11],arr2[12],arr2[13]};
                   

                model.addRow(row);
                model.addRow(row1);
                //model.addRow(row2);
                  
            }
            
        } catch (FileNotFoundException ex) {   
             Logger.getLogger(StudentCourseDetails.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(StudentCourseDetails.class.getName()).log(Level.SEVERE, null, ex);
         }   
    
    }
    
    
    public static void main(String[] args) {
        
        StudentCourseDetails frame = new StudentCourseDetails();
        frame.setVisible(true);
        frame.setResizable(false);
        
    }

   
}
