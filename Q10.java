import java.util.*;
public class Q10
{
	public static void main(String args[])
	{
		
		Scanner sc =  new Scanner(System.in);
		Vector<String> list = new Vector<String>();
		int choice;
		do{
			System.out.println("Choose the option\n" + 
			"1. Add an item at a specified location\n" + 
			"2. Delete an element at specified position\n" + 
			"3. Print shopping list\n" +
			"4. Exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter the item to add to your list");
				String item =  sc.next();
				System.out.println("Enter the position to insert to");
				int pos = sc.nextInt();
				list.add(pos-1, item);
				break;

				case 2:
				System.out.println("Enter item to delete");
				item = sc.next();
				list.remove(item);
				break;

				case 3:
				System.out.println(list);
				break;
			}
		}while(choice != 4);
		sc.close();	
	}
}

