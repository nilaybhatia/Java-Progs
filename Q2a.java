import java.util.*;
class Q2a {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<= n; i++){
      for(int j = 1; j <= i; j++)
        System.out.print(" ");
      for(int j = i; j <= n; j++)
        System.out.print(j+" ");
      System.out.println();
    }
    for(int i = 1; i < n; i++){
      for(int j = 1; j <= n-i; j++)
        System.out.print(" ");
      for(int j = n-i; j <= n; j++)
        System.out.print(j+" ");
      System.out.println();
    }
    sc.close();
  }
}