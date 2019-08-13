import java.util.*;
public class Q2b
{
  public static void main(String args[])
  {
    System.out.println("Series expansion of sin x: x - x^3/3! + x^5/5! - x^7/7! ...\nEnter the value of x in radians");
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    System.out.println("Enter the power of x till which you want to use the series");
    int n = sc.nextInt();
    double ans = 0;
    int sign = 1;
    double term = x;
    for(int i = 1; i <= n; i+=2){
      ans += sign*(term/fact(i));
      sign*=-1;
      term *= x*x;
 dont   }
    System.out.println("The ans is " + ans);      
  }
  public static long fact(int n)
  {
    long val = 1;
    for(int i = 1; i <= n; i++)
    {
      val *= i; 
    }
    return val;
  }
}
//1.57079632679 = π/2
