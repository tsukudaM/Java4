import objectdraw.*;
import java.awt.*;

// Class for a raindrop that falls down the canvas
public class FallingRainDrop extends ActiveObject implements Stoppable{

    // The delay between successive moves of the ball
    private static final int DELAY_TIME = 33;
    // Number of pixels ball falls in a single move
    private static final double Y_STEP = 4;

    // The image of the raindrop
    private VisibleImage rainGraphic;
    // The canvas
    private boolean moving;
    private DrawingCanvas canvas;
    

    public FallingRainDrop( Image rainPic, Location initialLocation, DrawingCanvas aCanvas ) {
        canvas = aCanvas;
        rainGraphic = new VisibleImage( rainPic, initialLocation, canvas );
        moving=true;
      start();
    }

    public void run() {
        while ( moving && rainGraphic.getY() < canvas.getHeight() ) {
            rainGraphic.move( 0, Y_STEP );
            pause ( DELAY_TIME ) ;
        }
        rainGraphic.removeFromCanvas();
    }
    
    //The method to stop moving.
    public void stopFalling() {
        moving = false;
}
}
