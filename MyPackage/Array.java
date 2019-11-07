/*Don't forget to set classpath from the working directory, not this folder
Windows: Set CLASSPATH = %CLASSPATH%;C:\Users\HOME\OneDrive\Documents\Java-Progs\MyPackage
Ubuntu: echo $(CLASSPATH) -->for viewing
        export CLASSPATH=.:/initial/address/here/Java-Progs/MyPackage
*/
package MyPackage;
public class Array{
  //A utility function for printing any array
  public static void printArray(int arr[]) {
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void reverseArray(int arr[]) {
    int len = arr.length;
    for(int i = 0; i < len/2; i++) {
      int temp = arr[i];
      arr[i] = arr[len - i - 1];
      arr[len - i - 1] = temp;
    }
  }
}
