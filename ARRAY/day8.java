
package ARRAY;

import java.util.Scanner;

public class day8 {


  // 1->Finding the first Occurence of a number

  // static void firstOcc(int[] arr, int target) {
  // int low = 0, high = arr.length - 1;
  // int index = -1;
  // while (low <= high) {
  // int mid = low + (high - low) / 2;

  // if (arr[mid] == target) {
  // index = mid;
  // high = mid - 1;
  // } else if (arr[mid] > target)
  // high = mid - 1;
  // else
  // low = mid + 1;

  // }
  // System.out.println("First occ: "+index);
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter size: ");
  // int n = sc.nextInt();
  // System.out.println("Enter array elements");
  // int arr[] = new int[n];
  // for (int i = 0; i < n; i++) {
  // arr[i] = sc.nextInt();
  // }
  // System.out.println("Enter target");
  // int t = sc.nextInt();
  // firstOcc(arr, t);
  // sc.close();
  // }

  // static void lastOcc(int[] arr, int target) {
  //   int low = 0, high = arr.length - 1;
  //   int index = -1;
    // while (low <= high) {
    // int mid = low + (high - low) / 2;

    // if (arr[mid] == target) {
    // index = mid;
    // low = mid + 1;
    // } else if (arr[mid] > target)
    // high = mid - 1;
    // else
    // low = mid + 1;

    // }
    // System.out.println("Last occ: " + index);
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter size: ");
  // int n = sc.nextInt();
  // System.out.println("Enter array elements");
  // int arr[] = new int[n];
  // for (int i = 0; i < n; i++) {
  // arr[i] = sc.nextInt();
  // }
  // System.out.println("Enter target");
  // int t = sc.nextInt();
  // lastOcc(arr,t);
  // sc.close();
  // }

  // static void bs(int[] arr, int low, int high, int target) {
  // while (low <= high) {
  // int mid = low + (high - low) / 2;

  // if (arr[mid] == target) {
  // System.out.println("Founded at index: " + mid);
  // } else if (arr[mid] > target)
  // high = mid - 1;
  // else
  // low = mid + 1;
  // }
  // }

  // static void InfiniteSearch(int[] arr, int target) {

  // int low = 0, high = 1;

  // while (target > arr[high]) {
  // int temp = high + 1;
  // high = high + (high - low + 1) * 2;
  // low = temp;
  // }

  // bs(arr, low, high, target);

  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter size: ");
  // int n = sc.nextInt();
  // System.out.println("Enter array elements");
  // int arr[] = new int[n];
  // for (int i = 0; i < n; i++) {
  // arr[i] = sc.nextInt();
  // }
  // System.out.println("Enter target");
  // int t = sc.nextInt();
  // InfiniteSearch(arr, t);
  // sc.close();
  // }

  static void AddMatrix(int [][]arr, int brr[][],int n, int m){
    int crr [][] = new int[n][m];

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        crr[i][j] = arr[i][j]+brr[i][j];
      }
    }
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        System.out.print(crr[i][j]+" ");
      }
      System.out.println();
    }

    

  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows and col: ");
    int n = sc.nextInt();
    int m = sc.nextInt();

    int arr[][] = new int[n][m];
    int brr[][] = new int[n][m];
    System.out.println("First array");
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("Second array");
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m;j++){
        brr[i][j] = sc.nextInt();
      }
    }


    AddMatrix(arr,brr,n,m);

    sc.close();
  }
}
