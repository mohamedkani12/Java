package JS22S5;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class HelloApplet extends Applet {
    private int mouseX, mouseY;

    public void init() {
        mouseX = 0;
        mouseY = 0;

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                repaint(); // Trigger repaint when mouse moves
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello", mouseX, mouseY);
    }
}
