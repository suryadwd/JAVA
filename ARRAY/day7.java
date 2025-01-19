package ARRAY;

import java.util.Scanner;

public class day7 {


  // 1 -> Rverse an array

  // public static void Rev(int []arr){
  //     int low = 0, high = arr.length-1;
  //     while(low<high){
  //       int temp = arr[low];
  //       arr[low] = arr[high];
  //       arr[high] = temp;
  //       low++;
  //       high--;
  //     }
  // }
 
    // public static void main(String[] args) {
    //  Scanner sc = new Scanner(System.in);
    //   System.out.print("Enter size: ");
    //   int n = sc.nextInt();
    //   System.out.println("Enter array elements");
    //   int arr[] = new int[n];
    //   for (int i = 0; i < n; i++) {
    //     arr[i] = sc.nextInt();
    //   }
     
    //   Rev(arr);

    //   for (int i : arr) {
    //     System.out.print(i+" ");
    //   }

    //   sc.close();
    // }

    // 2 -> Maximum and Minimum in array

  // static void MaxMin(int[]arr){
  //   int max = arr[0];
  //   int min = arr[0];
  //   for(int i = 0; i < arr.length; i++){
  //     if(arr[i]>arr[0]) max = arr[i];
  //     if(arr[i] < min) min = arr[i];
  //   }
  //   System.out.println("Maximum ele: "+max);
  //   System.out.println("Minimum ele: "+min);
  // }
    // public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
    //    System.out.print("Enter size: ");
    //    int n = sc.nextInt();
    //    System.out.println("Enter array elements");
    //    int arr[] = new int[n];
    //    for (int i = 0; i < n; i++) {
    //      arr[i] = sc.nextInt();
    //    }
      
    //    MaxMin(arr);
 
    //    sc.close();
    //  }

    static void Sort(int arr[]){
      for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length - i - 1; j++){
          if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
      }
    }

    static void KtnMaxMin(int [] arr, int target){

      int low = 0, high = arr.length-1;

      Sort(arr);

      int k = 1;

      while (k < target) {
        low++;
        high--;
       
        k++;
      }

      System.out.print(target+"nd Max element: "+arr[low]);
      System.out.println();
      System.out.print(target+"nd Min element: "+arr[high]);

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
       System.out.println("Enter target: ");
      int t = sc.nextInt();
       KtnMaxMin(arr,t);
 
       sc.close();
     }

}
