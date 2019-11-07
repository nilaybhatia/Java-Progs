class Area
{
	double area(double radius)
	{
		/*for circle*/
		return Math.PI*radius*radius;
	}
	double area(double length, double breadth)
	{
		return length*breadth;
	}
	int area(int side)
	{
		return side*side;
	}	 
}
class Q6
{
	public static void main(String args[])
	{
		Area shape = new Area();
		System.out.printf("The area of circle is %.5f\n", shape.area(5.0));
		System.out.println("The area of rectangle is " + shape.area(3, 2));
		System.out.println("The area of square is " + shape.area(2)); 
	}
}