public class Q1b
{
    public static void main(String args[ ])
    {
        System.out.println("The numbers are\n");
        int sum = 0;
        for(int i = 0; i < args.length; i++)
        {
          int x = Integer.parseInt(args[i]);
          System.out.println(x);
          sum += x;
        }
        System.out.println("And their sum is "+sum);
    }	
}