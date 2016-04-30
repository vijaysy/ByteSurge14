import javax.swing.*;
import java.awt.*;

/**
 * Created by vijaysy on 30/04/16.
 */
class BackImage extends JComponent {
    private static final long serialVersionUID = 1L;
    Image i;

    public BackImage(Image i) {
        this.i = i;
    }
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(i, 0, 0, null);  // Drawing image using drawImage method
    }
}