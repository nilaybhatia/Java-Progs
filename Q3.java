import java.util.*;

public class Q3 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in 1d array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int [] a  = new int[n];// 1D array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int m;
        System.out.println("Enter the number of rows and columns in matrix");
        m = sc.nextInt();
        n = sc.nextInt();
        int A[][] = new int[m][n];
        for (int i = 0; i < m; i++) 
        { 
            for (int j = 0; j < n; j++) 
              A[i][j] = sc.nextInt();
        } 
        int B[][] = new int[n][m]; //transposed matrix
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                B[i][j] = A[j][i]; 

        System.out.print("Result matrix is \n"); 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < m; j++) 
              System.out.print(B[i][j] + " "); 
            System.out.print("\n"); 
        } 

    }
}
