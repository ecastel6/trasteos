
import java.awt.Point;

    
    
public class Main {
  public static void main(String[] args) {
    Point aPoint = new Point();
    Point bPoint = new Point(50, 25);
    Point cPoint = new Point(bPoint);
    Point fPoint = new Point(bPoint); // somefixex
    
//    System.out.println("cPoint is located at: " + cPoint);
    
    System.out.println("aPoint is located at: " + aPoint);
    aPoint.move(100, 50);
    System.out.println("After move aPoint is now at: " + aPoint);
//    bPoint.x = 110;
//    bPoint.y = 70;

    aPoint.translate(10, 20);
    System.out.println("After traslate aPoint is now at: " + aPoint);
    
    aPoint.move(-100, 50);
    System.out.println("After new move aPoint is now at: " + aPoint);

//    if (aPoint.equals(bPoint))
//      System.out.println("aPoint and bPoint are at the same location.");
  }
}