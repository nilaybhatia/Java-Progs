import java.util.*;
public class Q
{
	public static void main(String args[])
	{
		System.out.println("Choose the option\n1. Add an item at a specified location\n3. Delete an element at specified position\n3. Print shopping list\n");
		Scanner sc =  new Scanner(System.in);
		Vector list = new Vector();
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("Enter the item to add to your list");
			String item =  sc.next();
			System.out.println("Enter the position to inst to"");
			int pos = sc.nextInt();
			list.add(item, pos-1);
			break;

			case 2:
			System.out.println("Enter item to delete"");
			item = sc.next();
			list.remove(item);
			break;

			case 3:
			for(int i = 0; i < list.size(); i++)
				System.out.println(list[i]);
			break;
	}
}
