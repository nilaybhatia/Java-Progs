import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Side of square is " + args[0]);
    double side = Double.parseDouble(args[0]);
    System.out.println("Area of square is " + side*side);

    System.out.println("Length and breadth of rectangle are "+args[1]+"and"+ args[2]);
    double length = Double.parseDouble(args[1]);
    double breadth = Double.parseDouble(args[2]);
    System.out.println("The area of the rectangle is " + length*breadth);

    System.out.println("The radius of the circle is " + args[3]);
    double radius = Float.parseFloat(args[3]);
    double area = 3.14*radius*radius;
    System.out.println(area);
  }
}