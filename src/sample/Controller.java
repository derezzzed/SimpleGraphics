package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class Controller extends JFrame implements Icon {


    Controller() {
        super("Rating Statics");
        setSize(350,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void paint(Graphics g){

        Rectangle rectangle = new Rectangle(60, 55, 228,228);


        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle1 = new Ellipse2D.Double(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
        Arc2D arc1 = new Arc2D.Double(60, 55, 228, 228, 0, 80, Arc2D.PIE);
        Arc2D arc2 = new Arc2D.Double(60, 55, 228, 228, 65, 60, Arc2D.PIE);

        g2d.setColor(Color.RED);
        g2d.fill3DRect(295, 130, 17, 20, true);
        g2d.setColor(Color.BLUE);
        g2d.fill3DRect(295, 165, 17, 20, true);
        g2d.setColor(Color.GREEN);
        g2d.fill3DRect(295, 195, 17, 20, true);

        g2d.setColor(Color.GREEN);
        g2d.fill(circle1);
        g2d.setColor(Color.RED);
        g2d.fill(arc1);
        g2d.setColor(Color.BLUE);
        g2d.fill(arc2);

    }


    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
