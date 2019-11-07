/*Static import is a feature introduced in Java programming language ( versions 5 and above ) 
that allows members ( fields and methods ) defined in a class as public static to be used
in Java code without specifying the class in which the field is defined.*/
import static java.lang.Math.*;
import static java.lang.System.*;
public class StaticImport
{
	public static void main(String args[])
	{
		out.println(sqrt(25));
		out.println(PI);
	}
}
