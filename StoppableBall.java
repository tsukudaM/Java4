import objectdraw.*;
import java.awt.*;

// Class for an animated ball that falls down the canvas
public class StoppableBall extends ActiveObject implements Stoppable{

    // The size of the ball
    private static final int SIZE = 10;
    
    // The delay between successive moves of the ball
    private static final int DELAY_TIME = 33;
    // Number of pixels ball falls in a single move
    private static final double Y_STEP = 4;

    // The image of the ball
    private FilledOval ballGraphic;
    // Whether the ball is currently moving
    private boolean moving;
    // The canvas
    private DrawingCanvas canvas;

    public StoppableBall( Location initialLocation, DrawingCanvas aCanvas ) {
        canvas = aCanvas;
        ballGraphic = new FilledOval( initialLocation, SIZE, SIZE,
                                      canvas );
        moving = true;
        start();
    }

    public void run() {
        while ( moving && ballGraphic.getY() < canvas.getHeight() ) {
            ballGraphic.move( 0, Y_STEP );
            pause ( DELAY_TIME ) ;
        }
        ballGraphic.removeFromCanvas();
    }
    //The method to change color.
    public void setColor( Color aColor ){
        ballGraphic.setColor( aColor );
    }
    
    //The method to stop moving.
    public void stopFalling() {
        moving = false;
    }
}