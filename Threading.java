 import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Threading extends JFrame {

    private JPanel contentPane;
    private JTextField DisplayOne;
    private JTextField DisplayTwo;

    int count;
    int count1;
    int count2;


    /**
     * Launch the application.
     */

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                  try {
                    Threading frame = new Threading();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */


    public Threading() 
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);

        DisplayOne = new JTextField();
        panel.add(DisplayOne);
        DisplayOne.setColumns(10);

        DisplayTwo = new JTextField();
        panel.add(DisplayTwo);
        DisplayTwo.setColumns(10);

        JButton btnCountOne = new JButton("Count 1");
        count1=0;
        btnCountOne.addActionListener(new ActionListener() {                
                public void actionPerformed(ActionEvent arg0) 
                {   
                    DisplayOne.setText(Integer.toString(count1++));
                }
        });
        panel.add(btnCountOne);

        JButton btnCountTwo = new JButton("Count 2");
        count2=0;
        btnCountTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) 
            {
                DisplayTwo.setText(Integer.toString(count2++));
            }
        });
        panel.add(btnCountTwo);

        JButton btnCountBoth = new JButton("Count Both");
        count=0;
        btnCountBoth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) 
            {
                while (count < 10)
                {
                DisplayOne.setText(Integer.toString(++count));
                DisplayTwo.setText(Integer.toString(count));
                }
            }
        });
        panel.add(btnCountBoth);
    }

}