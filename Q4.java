import java.util.*;
class Library
{
    String name;
    long acc_no;
    long books_issued[] = new long[1000];
    double fine;
    int i = 0;
    Scanner sc = new Scanner(System.in);
    Library()
    {
        name = "";
        acc_no = 0;
        //books_issued[] = {};
        fine = 0.0;
    }
    public void issueBook()
    {	
        System.out.println("Enter accession number of the book");
        int acc_no = sc.nextInt();
        books_issued[i] = acc_no;
        i++;
        System.out.println("Book issued successfully");

    }
    public void returnBook()
    {	
        System.out.println("Enter accession number of the book");
        int acc_no = sc.nextInt();
        int j;
        for(j = 0; j < books_issued.length; j++)
        {
            if(books_issued[j] == acc_no)
            break;
        }
        if(j == books_issued.length)
            System.out.println("Book not found\n");
        else{
            System.out.println("Book returned successfully\n");
            books_issued[j] = 0;
        }
    }
    public void chargeFine()
    {
        System.out.println("Fine charged\n");
        fine += 10.0;
    }
}

class Main
{	
    public static void main(String args[])
    {
        Library account = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
          System.out.println("Enter a choice");
          System.out.println("1. Issue a book\n2. Return a book\n3. Charge fine\n4. Display fine\n5. Exit");
          choice = sc.nextInt();
          switch(choice)    
          {   
            case 1:
            account.issueBook();
            break;

            case 2:
            account.returnBook();
            break;

            case 3:
            account.chargeFine();
            break;

            case 4:
            
            break;
          }
        }while(choice != 5);
        account.issueBook();
    }
}
     