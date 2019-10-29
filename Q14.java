import java.util.*;
class MarksOutOfBoundsException extends Exception{
	int marks;
	MarksOutOfBoundsException(int marks){
		this.marks = marks;
	}
	public String toString(){
		return ("Your enterd marks, " + marks + " is not between 1 to 100");
	}
}
public class Q14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your seat no.");
		long seat_no = sc.nextLong();
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		try{
			if(marks < 0 || marks > 100){
				throw new MarksOutOfBoundsException(marks);
			}
		}
		catch(MarksOutOfBoundsException m){
			System.out.println(m);
		}
		sc.close(); 

	}
}

