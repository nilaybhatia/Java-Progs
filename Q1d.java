import java.util.*;
public class Q1d
{
  public static void main(String args[])
  {
    int a = 10, b = 20, f = 30;
    boolean c = true, d = false;
    float e = 3.0f;
    System.out.println("Arithmetic: a+b-f*a/e = " + (a+b-f*a/e));
    System.out.println("Unary: ++a + b-- = " + (++a + b--));
    System.out.println("a = " + a + ", b = " + b);
    System.out.println("Logical NOT: !c = "  + (!c));
    System.out.println("Logical AND: c AND d = " + (c && d));
    System.out.println("Logical OR: c OR d = " + (c || d));
    System.out.println("Relational: a < b = " + (a<b));
    System.out.println("Relational: a != b " + (a != b));
    System.out.println("Ternary: Min of a, b, f = " + (a<b? (a<f? a:f) : (b<f? b:f)));
    System.out.println("Bitwise AND: a & b = " + (a & b));
    System.out.println("Bitwise Complement ~a = " + ~a);
    System.out.println("Signed Left shift: a<<2 = " + (a << 2));
    System.out.println("Signed Right shift a >> 1 = " + (a >> 1));
    byte g = (byte)a; // g = 11
    System.out.println(-g);
    System.out.println(Integer.toBinaryString(-g));
    System.out.println("Unsigned Right shift g >>> 1 = " + (-g >>> (byte)1));
  }
}
/*Notes
1. For string concatenation using ' + ', add a bracket around the expression to be printed as precedence of + is higher than relational and logical operators.
 2. For understanding unsigned right shift:
 https://javarevisited.blogspot.com/2015/02/difference-between-right-shift-and.html*/