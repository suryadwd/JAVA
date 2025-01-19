package ARRAY;

import java.util.Scanner;

public class day7 {


  // 1 -> Rverse an array

  public static void Rev(int []arr){
      int low = 0, high = arr.length-1;
      while(low<high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        low++;
        high--;
      }
  }
 
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter size: ");
      int n = sc.nextInt();
      System.out.println("Enter array elements");
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
     
      Rev(arr);

      for (int i : arr) {
        System.out.print(i+" ");
      }

      sc.close();
    }

}
