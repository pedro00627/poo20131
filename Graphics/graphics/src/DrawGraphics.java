import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> box;
    
 
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new ArrayList<>();
        box.add(new BouncingBox(10, 40, Color.white));
        
                //new BouncingBox(200, 50, Color.BLUE);
        //box.setMovementVector(10, 7);
        
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.setColor(Color.yellow);
        surface.drawLine(10, 50, 350, 350);
        //box.draw(surface);
    }
} 