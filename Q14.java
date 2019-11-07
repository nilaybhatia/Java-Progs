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
class InvalidSeatNumberException extends Exception {
	long seat_no;
	InvalidSeatNumberException(long seat_no){
		this.seat_no = seat_no;
	}
	public String toString(){
		return "Your entered seat number, " + seat_no + " is not in valid range";
	}
}


public class Q14
{
	public static void validate(long seat_no) throws InvalidSeatNumberException{
		if(seat_no <= 0)
			throw new InvalidSeatNumberException(seat_no);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your seat no.");
		long seat_no = sc.nextLong();
		try{
			validate(seat_no);
		}
		catch(InvalidSeatNumberException e){
			System.out.println("Caught "+e);
		}
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		try{
			if(marks < 0 || marks > 100){
				throw new MarksOutOfBoundsException(marks);
			}
		}
		catch(MarksOutOfBoundsException m){
			SOP.sop(m);
		}
		sc.close(); 

	}
}

