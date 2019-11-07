import java.util.*;
public class Q1c
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of b and c in x^2 + bx + c");
    float b, c;
    b = sc.nextFloat();
    c = sc.nextFloat();
    if(b*b-4*c < 0)
      System.out.println("No real solutions");
    else{
      double D = Math.sqrt(b*b-4*c); // in java.lang
      double x1, x2;
      x1 = (-b + D)/(2);
      x2 = (-b - D)/(2);
      System.out.println("The roots are " + x1 + " and " + x2);
    }
  }
}
/*Notes:
1. Since sqrt function returns a double value, keep data type of variables as double */