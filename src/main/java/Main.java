
import java.awt.Point;

    
public class Main {
    public static void getMethodame(final int depth)
    {
      final StackTraceElement[] ste = Thread.currentThread().getStackTrace();

      //System. out.println(ste[ste.length-depth].getClassName()+"#"+ste[ste.length-depth].getMethodName());
      // return ste[ste.length - depth].getMethodName();  //Wrong, fails for depth = 0
      System.out.println(ste[ste.length - 1 - depth].getMethodName());

    }    

    public static void main(String[] args) {
        
      getMethodame(1);
  }
  
}
