import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class Controller extends JComponent {

    Controller() {
    }

    public void paint(Graphics g){

        int x = (getWidth() - getWidth() / 2) / 2;
        int y = (getHeight() - getHeight()) / 2;

        Graphics2D g2d = (Graphics2D) g;

        Ellipse2D.Double circle1 = new Ellipse2D.Double(x, y, getWidth() / 2, getHeight());
        Arc2D arc1 = new Arc2D.Double(x, y, getWidth() / 2, getHeight(), 0, 80, Arc2D.PIE);
        Arc2D arc2 = new Arc2D.Double(x, y, getWidth() / 2, getHeight(), 65, 60, Arc2D.PIE);

        int recX = getWidth();
        int recY = getHeight();

        g2d.setFont(new Font("TimesRoman", Font.PLAIN, g2d.getFont().getSize() + 7));
        g2d.drawString("- 5",(int) (recX*0.9), (int) (recY*0.35));
        g2d.drawString("- 4",(int) (recX*0.9), (int) (recY*0.6));
        g2d.drawString("- 3",(int) (recX*0.9), (int) (recY*0.85));

        g2d.setColor(Color.RED);
        g2d.fill3DRect((int) (recX*0.8), (int) (recY*0.25), recY/7, recY/6, true);
        g2d.setColor(Color.BLUE);
        g2d.fill3DRect((int) (recX*0.8), (int) (recY*0.5), recY/7, recY/6, true);
        g2d.setColor(Color.GREEN);
        g2d.fill3DRect((int) (recX*0.8), (int) (recY*0.75), recY/7, recY/6, true);

        g2d.setColor(Color.GREEN);
        g2d.fill(circle1);
        g2d.setColor(Color.RED);
        g2d.fill(arc1);
        g2d.setColor(Color.BLUE);
        g2d.fill(arc2);

    }
}