package sample;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class TestMy extends JFrame {
    TestMy() {
        super("Rating Statics");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle1 = new Ellipse2D.Double(50, 50, 200, 200);
        Arc2D arc1 = new Arc2D.Double(50, 50, 200, 200, 0, 80, Arc2D.PIE);
        Arc2D arc2 = new Arc2D.Double(50, 50, 200, 200, 65, 60, Arc2D.PIE);
        g2d.fill3DRect(50, 50, 12, 12, true);


        g2d.setColor(Color.GREEN);
        g2d.fill(circle1);
        g2d.setColor(Color.RED);
        g2d.fill(arc1);
        g2d.setColor(Color.BLUE);
        g2d.fill(arc2);

    }
}
