
import javax.swing.*;
import java.awt.*;

/**
 * Drawing multiple lines in a Swing application
 * @author Udesh
 */
public class DrawingLines extends JFrame {

    public DrawingLines() {
        setTitle("Line Drawing Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        add(new LinePanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DrawingLines().setVisible(true);
        });
    }
}

class LinePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set color and stroke
        g.setColor(Color.BLUE);
        
        // Draw multiple lines
        g.drawLine(0, 1, 2, 4);
        g.drawLine(23, 44, 55, 66);
        g.drawLine(0, 100, 100, 0);
        g.drawLine(32, 24, 250, 100);
        g.drawLine(75, 9, 20, 90);
    }
}
