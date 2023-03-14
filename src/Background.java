import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.lang.Long.SIZE;

public class Background extends JPanel implements MouseListener {
    //Attributes
    final int SIZE = 400;
    private boolean firstcolor = false;

    //Constructor`
    public Background(){
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(SIZE,SIZE));
        this.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Good");
        if (!firstcolor) {
            this.setBackground(Color.PINK);
        } else {
            this.setBackground(Color.YELLOW);
        }
        firstcolor= !firstcolor;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}