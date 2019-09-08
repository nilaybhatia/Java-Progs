import java.util.*;
interface BasicOperations
{
	double add(double x, double y);
	double subtract(double x, double y);
	double multiply(double x, double y);
	double divide(double x, double y);
}
interface AdvancedOperations
{
	double PI = 3.141592;
	int power(int x, int y);
	double square(double x);
	double cube(double x);
	double inverse(double x);
}
class Calculator implements BasicOperations, AdvancedOperations
{
	public double add(double x, double y) { return x+y; }
	public double subtract(double x, double y) { return x-y; }
	public double multiply(double x, double y)  { return x*y; }
	public double divide(double x, double y) {return x / y; }
	public int power(int x, int y){
		int ans = 1;
		for(int i = 1; i <= y; i++){
			ans *= x;
		}
		return ans;
	}
	public double square(double x) { return x*x; }
	public double cube(double x) { return x*x*x; }
	public double inverse(double x) { return 1/x; }

	void display(){
		System.out.println("The answer is");
	}
}
public class Q11
{
	public static void main(String args[])
	{
		System.out.println("Calculator program");
		Calculator c = new Calculator();
		c.display();
		System.out.println(c.add(2.53, 5.79));
		System.out.println(c.inverse(5.0));
	}
}
