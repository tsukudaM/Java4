import objectdraw.*;
import java.awt.*;
//Draw nested square,spiral.
public class Spiral implements RecSpiralInterface{
   private Roop outer;//Outermost square in spiral
   private RecSpiralInterface rest;//Inner nested square.
   private double centerX,centerY;//Coordinate of center point of spiral.
   private final static double RADIAN=Math.toRadians(5);
   //Square is turn right by 5 degrees.
    
   public Spiral(double xP1,double yP1,double xP2,double yP2,DrawingCanvas canvas){
    //Draw outer square
    outer=new Roop(xP1,yP1,xP2,yP2,canvas);
    //Find coordinate of the median.
    centerX=(xP1+xP2)/2;
    centerY=(yP1+yP2)/2;
    
    //Draw nested squares.
    if((xP1-xP2)*(xP1-xP2)+(yP1-yP2)*(yP1-yP2)>100){
      rest=new Spiral((((0.9*(xP1-centerX)+centerX)-centerX)*Math.cos(RADIAN)-((0.9*(yP1-centerY)+centerY)-centerY)*Math.sin(RADIAN))+centerX,
                      (((0.9*(xP1-centerX)+centerX)-centerX)*Math.sin(RADIAN)+((0.9*(yP1-centerY)+centerY)-centerY)*Math.cos(RADIAN))+centerY,
                      (((0.9*(xP2-centerX)+centerX)-centerX)*Math.cos(RADIAN)-((0.9*(yP2-centerY)+centerY)-centerY)*Math.sin(RADIAN))+centerX,
                      (((0.9*(xP2-centerX)+centerX)-centerX)*Math.sin(RADIAN)+((0.9*(yP2-centerY)+centerY)-centerY)*Math.cos(RADIAN))+centerY,canvas);
    }
    else{
      rest=new BasedRoop();
    }
   }
   //The method to move
   @Override public void move(double x,double y){
    outer.move(x,y);
    if(rest!=null){
    rest.move(x,y);
   }
   }
}
