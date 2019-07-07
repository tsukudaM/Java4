import objectdraw.*;
import java.awt.*;
//Draw ten circle that change by click.
public class TenCircles extends WindowController{
   private int num=0;//Variable to count the number clicked.
   private drawTenCircles circle;//Ten circles.
   private Color color;//Color of ten circles.
   
    @Override public void onMousePress(Location point){
     //Display circles in the first time
       if(num==0){
         circle=new drawTenCircles(point,Color.RED,canvas);
         color=Color.RED;
       }
      else if(num>=1&&num<=10){
         //When circles contain clicked point,change circles color. 
          if(circle.contains(point)){
            if(color==Color.RED){
               circle.setColor(Color.GREEN);
               color=Color.GREEN;
            }else{
               circle.setColor(Color.RED);
               color=Color.RED;
            }
            //This is not clicked count.
            num=num-1;
           }
         //When clicked point is nothing,circle move.           
           else{   
            circle.moveTo(num-1,point);
            //If num equals 10,num is initialized.
            if(num==10){
               num=0;
            }
          }
      }
    //Num count up the number clicked.
    num=num+1;
   }
}

