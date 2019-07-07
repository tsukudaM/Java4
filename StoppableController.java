import objectdraw.*;
import java.awt.*;

public class StoppableController extends WindowController {
    //The location to set text.
    private static final Location INSTR_LOCATION = new Location (10, 5);
    //Variable of moving,StoppableBall or FallingRainDrop.
    private Stoppable dropped;
    //Variable of raindrop picture.
    private Image rainPicture;
    
    public void begin() {
        // Display instructions
        new Text( "Click to make a falling ball...",
                  INSTR_LOCATION, canvas );
        rainPicture=getImage("raindrop.png");    
    }

    public void onMouseClick( Location point ) {
        // Make a new ball or raindrop when the player clicks
        if(point.getX()<canvas.getWidth()/2){
            dropped = new StoppableBall( point, canvas );
        }
        else if(point.getX()>canvas.getWidth()/2){
            dropped=new FallingRainDrop (rainPicture,point,canvas);
        }
     }
    // Falling object stops when mouse exits canvas
    public void onMouseExit( Location point ) {
        if ( dropped != null ) {
            dropped.stopFalling();
        }
    }
}