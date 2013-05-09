
import java.awt.Graphics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PedroAndres
 */
public interface Mover {
    public void setMovementVector(int xIncrement, int yIncrement); //{
        //xDirection = xIncrement;
        //yDirection = yIncrement;
    //}

    public void draw(Graphics graphics); /*{
        //sprite.draw(graphics, x, y);

        // Move the center of the object each time we draw it
        //x += xDirection;
        //y += yDirection;
    }*/
}
