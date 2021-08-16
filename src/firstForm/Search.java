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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Search extends JFrame {

    Font f, f1, f2;
    private JRadioButton personalInfo;
    private ButtonGroup grp;
    private JButton searchbtn;
    private JTextField tf, tf1;
    private JLabel label;
    JTextArea ta;
    int meaning;
    String arr[] = new String[500];
    String word, line, wlower;
    //String arr[] = new String[50];

    Search() {
        initcomponents();
    }
    Admission ad = new Admission();

    private void initcomponents() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 10, 700,700);
        this.setTitle("Search");

        Container c = this.getContentPane();
        c.setBackground(Color.getHSBColor(27F, 28F, 28F));
        c.setLayout(null);
        f = new Font("Algerian", Font.BOLD, 55);
        f1 = new Font("Courier New", Font.PLAIN,18);
        f2 = new Font("Tahoma", Font.PLAIN, 25);
        tf = new JTextField();
        tf.setBounds(80, 50, 400, 40);
        tf.setFont(f1);
        tf.setForeground(Color.BLACK);
        tf.setBackground(Color.WHITE);
        tf.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf);
        
        searchbtn = new JButton("Search");
        searchbtn.setBounds(500,52,100,35);
        searchbtn.setOpaque(false);
        searchbtn.setForeground(Color.BLACK);
        searchbtn.setFont(f1);
        c.add(searchbtn);


        ta = new JTextArea();
        ta.setBounds(150,130,600,700);
        ta.setBackground(Color.getHSBColor(27F, 28F, 28F));
        ta.setFont(f1);
        c.add(ta);

//        grp.add(personalInfo);

        Handler handler = new Handler();

       // personalInfo.addActionListener(handler);
        searchbtn.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == searchbtn) {
                boolean notfound = false;
                
                word = tf.getText();
                //wlower = word.toLowerCase();
                try {

            File file = new File("accountfile.txt");
            //file.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(file));
            ta.setText("");
            while ((line = br.readLine()) != null) {
                arr = line.split(",");
                System.out.println(arr[0]);
                System.out.println(word);
                if (arr[0].equals(word)) {
                    ta.append("Name: "+arr[0]+"\n\n"+"Department: "+arr[1]+"\n\n"+"Gender: "+arr[2]+"\n\n"+
                    "Phone No: "+arr[3]+"\n\n"+"Address: "+arr[4]+"\n\n"+"Father's Name: "+arr[5]+"\n\n"+"Mother's Name: "+arr[6]+"\n\n"+
                            "Email: "+arr[7]+"\n\n"+"Blood Group: "+arr[8]+"\n\n"+"Nationality: "
                                    + arr[9]);
                   
                    break;
                } 
                else {
                   ta.setText("");
                   
                }
               
            }
        }       catch (FileNotFoundException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }

    public static void main(String[] args) {
        Search frame = new Search();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
