import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


// gui extends frame and inherits all its methods (e.g., for setting
// size, adding components)

public class GUI extends JFrame{
    // constructor will create all GUI components and set their properties
    public GUI(Application application) {
        super ("GUI demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame properties
        setSize(400, 300);
        setLayout(new FlowLayout());

        // menu bar with one item for quitting the program
        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener((ActionEvent e) ->
                System.exit(0));
        fileMenu.add(quitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        //COMBOBOX THINGS

        String option[]={"first","second","third"};
        JComboBox options=new JComboBox(option);
        options.setBounds(60, 75,90,20);
        add(options);

        //for the first time
        System.out.println(options.getSelectedItem());
        options.addActionListener((ActionEvent e) ->
                System.out.println(options.getSelectedItem()));

        setLayout(null);
        setSize(250,250);


        setVisible(true);
    }

    /*public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String option = (String) cb.getSelectedItem();
        System.out.println(cb.getSelectedItem());
    }*/

    private Application application;
    private JMenuBar menuBar;
    private JLabel stateLabel, timeLabel;
    private JButton flipButton;

}