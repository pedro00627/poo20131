import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    //Bouncer movingSprite;
   // ArrayList<Bouncer> movingSprite = new ArrayList<>();
    //ArrayList<StraightMover> movimiento = new ArrayList<>();
    ArrayList<Mover> combinada = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        //Rectangle box = new Rectangle(15, 20, Color.RED);
        //movingSprite = new Bouncer(100, 170, box);
        //movingSprite.setMovementVector(3, 1);
        combinada.add(new Bouncer(30, 30, new Rectangle(75, 75, Color.CYAN)));
        combinada.add(new Bouncer(30, 30, new Rectangle(25, 25, Color.blue)));
        combinada.add(new Bouncer(30, 30, new Oval(30, 50, Color.YELLOW)));
        combinada.add(new Bouncer(30, 30, new Oval(40, 30, Color.GREEN)));
        combinada.get(0).setMovementVector(8, -5);
        combinada.get(1).setMovementVector(-5, 7);
        combinada.get(2).setMovementVector(7, 15);
        combinada.get(3).setMovementVector(10, -5);
        
        combinada.add(new StraightMover(20, 32, new Rectangle(60, 60, Color.BLUE)));
        combinada.add(new StraightMover(120, 30, new Oval(150, 150, Color.YELLOW)));
        combinada.get(4).setMovementVector(20, 15);
        combinada.get(5).setMovementVector(10, 5);
        
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        //movingSprite.draw(surface);
        for (Mover box : combinada){
		box.draw(surface);
        }
        /*for (StraightMover box : movimiento){
		box.draw(surface);
        }*/
    }
}
