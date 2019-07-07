import objectdraw.*;
import java.awt.*;

public class RecSpiral extends WindowController {
   private Location P1,P2;
   private double xP1,yP1,xP2,yP2;
   private Location click;
   
   private Spiral nested;
    
   @Override public void onMousePress(Location point){
    P1=point;
    click=point;
   }
    
   @Override public void onMouseRelease(Location point){
    P2=point;
    nested=new Spiral(P1.getX(),P1.getY(),P2.getX(),P2.getY(),canvas);   
   }
   
}

