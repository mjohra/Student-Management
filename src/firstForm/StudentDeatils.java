package firstForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class StudentDeatils extends JFrame implements ActionListener {

    private Font f, f1, f2;
    private JMenuBar menu;
    private JMenu Info, Result, Logout;
    private JMenuItem personalInfo, courseInfo, cgpa, Exit;
    // String word;
    String arr[] = new String[40];
    String arr2[] = new String[40];
    StudntLogin st = new StudntLogin();
    private JTextArea ta;

    StudentDeatils() {
        initcomponents();
    }

    private void initcomponents() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 10, 800, 900);
        this.setTitle("Student Page");

        Container c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        c.setLayout(null);
        f = new Font("Algerian", Font.BOLD, 55);
        f1 = new Font("Courier New", Font.PLAIN, 18);
        f2 = new Font("Tahoma", Font.PLAIN, 25);

        ta = new JTextArea();
        ta.setBounds(150, 130, 600, 700);
        ta.setBackground(Color.getHSBColor(27F, 28F, 28F));
        ta.setFont(f1);
        c.add(ta);

        menu = new JMenuBar();
        menu.setFont(f1);
        this.setJMenuBar(menu);

        Info = new JMenu("Info");
        Result = new JMenu("Result");
        Logout = new JMenu("Logout");

        menu.add(Info);
        menu.add(Result);
        menu.add(Logout);

        personalInfo = new JMenuItem("Personal Information");
        courseInfo = new JMenuItem("Course Registered");
        cgpa = new JMenuItem("CGPA");
       Exit= new JMenuItem("Exit");

        Info.add(personalInfo);
        Info.add(courseInfo);
        Result.add(cgpa);
        Logout.add(Exit);

        personalInfo.addActionListener(this);
        courseInfo.addActionListener(this);
        cgpa.addActionListener(this);
        Exit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == personalInfo) {
            
            try {

            File file = new File("temp.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            ta.setText("");
            String line;
            while ((line = br.readLine()) != null) {
                 arr = line.split(",");
                 System.out.println(line);
               // String[] parts = str.split(",");
               String name=st.tf1.getText();
                
                    ta.setText("ID: "+arr[0]+"\n\n"+"Name: "+arr[1]+"\n\n"+"Department: "+arr[2]+"\n\n"+"Gender: "+arr[3]+"\n\n"+"Date Of Birth: "
                    +arr[4]+"\n\n"+"Phone No: "+arr[5]+"\n\n"+"Address: "+arr[6]+"\n\n"+"Father's Name: "+arr[7]+"\n\n"+"Mother's Name: "+arr[8]+"\n\n"+
                            "Email: "+arr[9]+"\n\n"+"Blood Group: "+arr[10]+"\n\n"+"Nationality: "
                                    + arr[11]);
                  
            }
            br.close();
        }   catch (FileNotFoundException ex) { 
                Logger.getLogger(StudentDeatils.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(StudentDeatils.class.getName()).log(Level.SEVERE, null, ex);
            } 

        }
        
       else if(e.getSource()== courseInfo)
        {
            StudentCourseDetails frame = new StudentCourseDetails();
            frame.setVisible(true);
        }
       
        else if(e.getSource()== Exit)
        {
            Entry frame1 = new Entry();
        frame1.setVisible(true); 
        dispose();
        }
       //ta.setText("");
        else if(e.getSource()== cgpa)
        {
          try {

            File file2 = new File("temp3.txt");
            BufferedReader br3 = new BufferedReader(new FileReader(file2));
            ta.setText("");
            String line3;
            while ((line3 = br3.readLine()) != null) {
                 arr = line3.split(",");
                 System.out.println(line3);
               // String[] parts = str.split(",");
               //String name=st.tf1.getText();
                
                    ta.setText("ID: "+arr[0]+"\n\n"+"Name: "+arr[1]+"\n\n"+"CGPA: "+arr[2]);
                  
            }
            br3.close();
        }   catch (IOException ex) {   
                Logger.getLogger(StudentDeatils.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        
    }

    public static void main(String[] args) {
        StudentDeatils frame = new StudentDeatils();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
