import java.util.Random;
import processing.core.PApplet;
import processing.core.PFont;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

   // random 
   Random myRandom = new Random();
   int intRandomcavX = myRandom.nextInt((1200 - 500) + 1) + 500;
   int intRandomcavY = myRandom.nextInt((1200 - 500) + 1) + 500;   
   int intRandomcirclex = myRandom.nextInt((400 - 200) +1) + 200;
   int intRandomcircley = myRandom.nextInt((400 - 200) +1) + 200; 
   int intRandomcirclez = myRandom.nextInt((400 - 200) +1) + 200;
   public void settings() {
	
    // put your size call here
    size(intRandomcavX,intRandomcavY);
  }

  // This is for the background color
  public void setup() {
    background(	54, 0, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
 public void draw() {
      if (intRandomcirclex < 300) {
        // This is for smily face happy ( green )
    fill(124,252,0);
    circle(intRandomcirclex, intRandomcircley, intRandomcirclez);
    line(intRandomcirclex + 75, intRandomcircley - 50, intRandomcirclex + 70 , intRandomcircley + 10);  
    line(intRandomcirclex - 60,intRandomcircley - 75, intRandomcirclex - 65, intRandomcircley - 10);
    noFill();
    stroke(0);
    curve(intRandomcirclex - 100, intRandomcircley - 400,intRandomcirclex -100, intRandomcircley -10, intRandomcirclex +70, intRandomcircley +30, intRandomcirclex + 25, intRandomcircley - 1000 );
    stroke(0); 
      } else {
    fill(255,0,0);
    circle(intRandomcirclex, intRandomcircley, intRandomcirclez);
    line(intRandomcirclex + 75, intRandomcircley - 50, intRandomcirclex + 70 , intRandomcircley + 10);  
    line(intRandomcirclex - 60,intRandomcircley - 75, intRandomcirclex - 65, intRandomcircley - 10);
    noFill();
    stroke(0);
    curve(intRandomcirclex - 100, intRandomcircley - 400,intRandomcirclex -100, intRandomcircley + 50, intRandomcirclex +70, intRandomcircley +30, intRandomcirclex + 250, intRandomcircley + 700 );
    stroke(0); 
      }
    }
}