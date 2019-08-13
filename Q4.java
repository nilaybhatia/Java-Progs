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
            System.out.println("Book not found");
        else{
            System.out.println("Book returned successfully");
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        Library stud[] = new Library[n];
        for(int i = 0; i < n; i++) {
            int choice;
            stud[i] = new Library();
            System.out.println("Student " + (i+1));
            System.out.println("Enter name");
            stud[i].name = sc.next();
            String dummy = sc.next();
            System.out.println("Enter account number");
            stud[i].acc_no = sc.nextLong();
            do{
                System.out.println("Enter a choice");
                System.out.println("1. Issue a book\n2. Return a book\n3. Charge fine\n4. Exit for this student");
                choice = sc.nextInt();
                System.out.println(choice);
                switch(choice)
                {
                    case 1:
                    stud[i].issueBook();
                    break;

                    case 2:
                    stud[i].returnBook();
                    break;

                    case 3:
                    stud[i].chargeFine();
                    break;
                }
            }while(choice != 4);
        }
        System.out.println("The list of students sorted by fine is");
        sortByFine(stud);
        System.out.println("Account number\t\t\tName\t\t\tFine");
        for(int i = 0; i < stud.length; i++){
            System.out.println(stud[i].acc_no + "\t\t" + stud[i].name + "\t\t" + stud[i].fine);
        }        
    }
    public static void sortByFine(Library students[]){
        for(int i = 1; i < students.length; i++){
            for(int j = 0; j < students.length-1; j++)
                if(students[j].fine < students[j+1].fine){
                    Library temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
        }
    }
}

