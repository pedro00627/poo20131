import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    //Bouncer movingSprite;
    ArrayList<Bouncer> movingSprite = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        //Rectangle box = new Rectangle(15, 20, Color.RED);
        //movingSprite = new Bouncer(100, 170, box);
        //movingSprite.setMovementVector(3, 1);
        movingSprite.add(new Bouncer(30, 30, new Rectangle(75, 75, Color.CYAN)));
        movingSprite.add(new Bouncer(30, 30, new Rectangle(25, 25, Color.blue)));
        movingSprite.add(new Bouncer(30, 30, new Oval(30, 50, Color.YELLOW)));
        movingSprite.add(new Bouncer(30, 30, new Oval(40, 30, Color.GREEN)));
        movingSprite.get(0).setMovementVector(8, -5);
        movingSprite.get(1).setMovementVector(-5, 7);
        movingSprite.get(2).setMovementVector(7, 15);
        movingSprite.get(3).setMovementVector(10, -5);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        //movingSprite.draw(surface);
        for (Bouncer box : movingSprite){
		box.draw(surface);
        }
    }
}
