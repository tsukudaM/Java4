import objectdraw.*;
import java.awt.*;
//The class to darw ten circles.
public class drawTenCircles{
 private FilledOval[] circle=new FilledOval[10];//Array for ten circles
 private int n,    //The variable to call array number.
             count;//The variable for contains method.
 
 public drawTenCircles(Location point,Color color,DrawingCanvas canvas){
  circle[0]=new FilledOval(point,100,100,canvas);
  circle[1]=new FilledOval(point,100,100,canvas);
  circle[2]=new FilledOval(point,100,100,canvas);
  circle[3]=new FilledOval(point,100,100,canvas);
  circle[4]=new FilledOval(point,100,100,canvas);
  circle[5]=new FilledOval(point,100,100,canvas);
  circle[6]=new FilledOval(point,100,100,canvas);
  circle[7]=new FilledOval(point,100,100,canvas);
  circle[8]=new FilledOval(point,100,100,canvas);
  circle[9]=new FilledOval(point,100,100,canvas);
  for(int n=0;n<10;n++){
   circle[n].setColor(color); 
  }
 }
 
 //Method to move element of array.
 public void moveTo(int num,Location point){
     circle[num].moveTo(point);
 }
 
 //Judge whether circles contain point.
 public boolean contains(Location point){
  count=0;
  //When circles contain point,number count 1 up.
   for(int n=0;n<10;n++){
     if(circle[n]!=null){
       if (circle[n].contains(point)){
        count=count+1;
       }
    }
  }
  
  //Judge by number of count.
  if(count>0){
    return true;
  }
  else{
    return false;
  }
  }
 
 //Method to change color.
 public void setColor(Color color){
   for(int n=0;n<10;n++){
     if(circle[n]!=null){
       circle[n].setColor(color);
     }
   }
 }

}
