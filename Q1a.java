import java.util.*;
public class Q1a
{
    public static void main(String args[ ])
    {
        int a, b, choice;
        Scanner sc = new Scanner(System.in);	
        System.out.println("Enter a choice\n1.  Addition\n2. Subtraction\n3. Multiplication\n4. Divide");
        choice = sc.nextInt();
        System.out.println("Enter two integers\n");
        a = sc.nextInt();
        b = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println(a+b);
            break;

            case 2:
            System.out.println(a-b);
            break;

            case 3:
            System.out.println(a*b);
            break;

            case 4:
            if(b==0)
              System.out.println("Can't divide by zero");
            else
              System.out.println(a/b);
            break;

            default:
            System.out.println("Wrong choice");
        }
    }
}

