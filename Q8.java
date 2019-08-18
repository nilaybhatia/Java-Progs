import MyPackage.*;
class Q8{
  public static void main(String args[]){
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println("The array elements are");
    //Array ob = new Array();
    Array.printArray(arr);
    Array.reverseArray(arr);
    System.out.println("The reversed array is ");
    Array.printArray(arr);
  } 
}