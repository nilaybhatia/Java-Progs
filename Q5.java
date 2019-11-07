class Shape
{	
	double volume;
	Shape(double side)
	{
		volume = side*side*side; 
	}
	Shape(double length, double breadth, double height)
	{
		volume = length*breadth*height;
	}
}
class Q5
{	
	public static void main(String args[])
	{
		Shape cube = new Shape(10.2);
		System.out.println("The volume of the cube is " + cube.volume);
		Shape cuboid = new Shape(10, 20, 30);
		System.out.println("The volume of the cuboid is " + cuboid.volume);

	}
}
/*Remeber to keep data type of volume as double*/
