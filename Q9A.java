import java.util.*;
public class Q9A
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		System.out.println("Length:" + s.length());
		System.out.println("Enter index");
		int index1 = sc.nextInt();
		System.out.println("The ith character is " + s.charAt(index1));
		System.out.println("Enter 2nd index");
		int index2 = sc.nextInt();
		System.out.println("Substring[index1:index2) = " + s.substring(index1, index2));
		System.out.println("Enter 2nd string");
		String s1 = sc.next();
		System.out.println(s.concat(s1));
		System.out.println("AbcdeAbcde".indexOf('c'));		
		System.out.println( "AbcdeAbcde".lastIndexOf('c'));
		System.out.println("AbcdeAbcde".indexOf("cde"));
		System.out.println("AbcdeAbcde".indexOf("cde", 3));
		System.out.println(("Secret Message".replace('e', 'x')).toUpperCase());
		String arr[] = "Mouse, Keyboard, Touchpad, ".split(", ");
		for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
	}
}
//System.out.println();
