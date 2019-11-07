//Dynamic method dispatch
class Shape3D
{
  double dim1, dim2, dim3;
  Shape3D(double dim1, double dim2, double dim3){
    this.dim1 = dim1;
    this.dim2 = dim2;
    this.dim3 = dim3;
  }
  double volume(){
    System.out.println("Volume is not defined");
    return -1;
  }
}
class Cuboid extends Shape3D
{
  Cuboid(double length, double breadth, double height){
    super(length, breadth, height);
  }
  double volume(){
    return dim1*dim2*dim3;
  }
}
class Tetrahedron extends Shape3D
{
  Tetrahedron(double baseDim1, double baseDim2, double height){
    super(baseDim1, baseDim2, height);
  }
  double volume(){
    return (1.0/3)*dim1*dim2*dim3;
  }
}
public class Q12
{
	public static void main(String args[])
	{
		System.out.println("");
    Shape3D s; //ref variable of superclass

    Cuboid c = new Cuboid(2, 3, 4); // c is object of subclass
    s = c; // superclass reference variable is assigned a concrete subclass object
    System.out.println("Volume of cuboid = " + s.volume());

    Tetrahedron t = new Tetrahedron(3, 5, 7);
    s = t;
    System.out.println("Volume of tetrhedron = " + s.volume());
	}
}
