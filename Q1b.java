public class Q1b
{
    public static void main(String args[ ])
    {
        System.out.println("The numbers are\n");
        int sum = 0;
        for(int i = 0; i < args.length; i++)
        {
          System.out.println(args[i]);
          sum += args[i];
        }
        System.out.println("And their sum is "+sum);
    }	
}