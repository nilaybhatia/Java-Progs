import java.util.*;
class RussianPeasant
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int ans = 0;
        while(a != 0)
        {
            if(a % 2 == 1)
                ans += b;
            a=a>>1;
            b=b<<1;
        }
        System.out.println(ans);
    }
}
