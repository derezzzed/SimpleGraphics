import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        
        JFrame f = new JFrame("Rating Statics");
        f.setSize(dimension.width / 6, dimension.height / 6);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Controller c = new Controller();
        f.getContentPane().add(c);

    }
}
