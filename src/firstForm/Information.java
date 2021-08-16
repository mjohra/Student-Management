package firstForm;

import firstForm.Admin.Handler;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Information extends JFrame {

    private Container c;
    private Font f, f1, f2;
    private JLabel label;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private JButton editbtn, resultbtn, updatebtn, backbtn;
    private String[] columns = {"ID", "Name", "Department", "Gender", "DOB","Phone","Address","Father's Name","Mothers Name","Email","Blood Group","Naionality"};
    Object[] row = new Object[12];
    FileReader fr;
    BufferedReader br;
    //String[] parts = new String[20];
    Vector data;
    String myString = "011171036";
    int foo = Integer.parseInt(myString);

    Information() throws IOException {
        initcomponents();
    }
     Admission ad = new Admission();

    public void initcomponents() throws FileNotFoundException, IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(80, 10, 1400, 900);
        this.setTitle("Information");

        c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        c.setLayout(null);
        f = new Font("Algerian", Font.BOLD, 40);
        f1 = new Font("Tohoma", Font.BOLD, 28);
        f2 = new Font("Courier New", Font.PLAIN,15);

        label = new JLabel("Students Information");
        label.setBounds(350, 10, 600, 100);
        label.setForeground(Color.BLACK);
        label.setOpaque(false);
        label.setFont(f);
        c.add(label);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(f2);
        table.setSelectionBackground(Color.YELLOW);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);

        scroll = new JScrollPane(table);
        scroll.setBounds(10, 100, 1350, 600);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);
        
        backbtn = new JButton("Back");
        backbtn.setBounds(550, 750, 80, 30);
        backbtn.setOpaque(false);
        backbtn.setForeground(Color.BLACK);
        backbtn.setFont(f2);
        c.add(backbtn);

      /*  updatebtn = new JButton("Show");
        updatebtn.setBounds(440, 750, 100, 30);
        updatebtn.setOpaque(false);
        updatebtn.setForeground(Color.BLACK);
        updatebtn.setFont(f2);
        c.add(updatebtn);

        editbtn = new JButton("Edit");
        editbtn.setBounds(550, 750, 90, 30);
        //infobtn.setBackground(Color.darkGray);
        editbtn.setOpaque(false);
        editbtn.setForeground(Color.BLACK);
        //editbtn.setBackground(Color.BLUE);
        editbtn.setFont(f2);
        c.add(editbtn);*/

        resultbtn = new JButton("Result");
        resultbtn.setBounds(650, 750, 90, 30);
        //infobtn.setBackground(Color.darkGray);
        resultbtn.setOpaque(false);
        resultbtn.setForeground(Color.BLACK);
        resultbtn.setFont(f2);
        c.add(resultbtn);

        Handler handler = new Handler();
        // admissionbtn .addActionListener(handler);
        //editbtn.addActionListener(handler);
        resultbtn.addActionListener(handler);
        backbtn.addActionListener(handler);
        try {
            fr = new FileReader("accountfile.txt");
            br = new BufferedReader(fr);
            String str = null;

            while ((str = br.readLine()) != null) {
                foo++;
                System.out.println(str);
                String[] parts = str.split(",");//creating a string array

                Object row[] = {foo, parts[0], parts[1], parts[2], parts[3],parts[4],parts[5],parts[6],parts[7],
                parts[8],parts[9],parts[10]};
                //row[1]=parts[1];

                model.addRow(row);
                System.out.println("Added!");
                //c.dispose();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        table.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                int numberOfRow = table.getSelectedRow();

                String name=(model.getValueAt(numberOfRow, 1).toString());
                String dept =(model.getValueAt(numberOfRow, 2).toString());
                String gender =(model.getValueAt(numberOfRow, 3).toString());
                if(gender.equals("Male"))
                {
                    ad.male.setSelected(true);
                }
                else
                {
                    ad.female.setSelected(true);
                }
                String dob =(model.getValueAt(numberOfRow, 4).toString());
                
                String phone =(model.getValueAt(numberOfRow, 5).toString());
                String address =(model.getValueAt(numberOfRow, 6).toString());
                String father =(model.getValueAt(numberOfRow, 7).toString());
                String mother =(model.getValueAt(numberOfRow, 8).toString());
                String email =(model.getValueAt(numberOfRow, 9).toString());
                String blood =(model.getValueAt(numberOfRow, 10).toString());
                String nationality =(model.getValueAt(numberOfRow, 11).toString());
                
                 //Admission frame = new Admission();
                ad.setVisible(true);
                //ad.pack();
                ad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               
                ad.tf1.setText(name);
                ad.cb.setSelectedItem(dept);
                if(gender.equals("Male"))
                {
                    ad.male.setSelected(true);
                }
                else
                {
                    ad.female.setSelected(true);
                }
                ad.tf3.setText(phone);
                ad.tf4.setText(address);
                ad.tf6.setText(father);
                ad.tf9.setText(mother);
                ad.tf12.setText(email);
                ad.tf2.setText(nationality);
                
            }

           
            
        });

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
   

            if (e.getSource() == backbtn) {
                
                Student_Info frame = new Student_Info();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                dispose();

            }
            if (e.getSource() == resultbtn) {
                try {
                    Driver frame=new Driver();
                    frame.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }

        }
    }

    public static void main(String[] args) throws IOException {
        Information frame = new Information();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
