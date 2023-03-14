import javax.swing.*;
import java.awt.*;

public class window extends JFrame {
    //Attributes
    //Constructor
    public window(){
        //Window design and function
        this.setTitle("A clicker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a Layout
        JPanel multiPanel= new JPanel();
        GridLayout layout= new GridLayout(1, 2);
        multiPanel.setBorder(BorderFactory.createLineBorder(Color.black, 10));
        multiPanel.setLayout(layout);

        //Window content
        multiPanel.add(new Background());
        multiPanel.add(new Background());

        //add the multipanel to the frame
        this.getContentPane().add(multiPanel);



        //Window visible
        this.add(new Background());

        this.pack();
        this.setVisible(true);
    }
    //Methods
    //Getset
}
