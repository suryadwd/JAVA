package ARRAY;

import java.util.Scanner;

public class day5 {

  // public static int Celing(int[] nums, int target) {

  //   int low = 0, high = nums.length - 1;

  //   int ciling = 0;

  //   while (low <= high) {

  //     int mid = low + (high - low) / 2;

  //     if (nums[mid] == target) {
  //       return nums[mid];
  //     }

  //     else if (nums[mid] < target) {
  //       low = mid + 1;
  //       ciling = low;
  //     }

  //     else
  //       high = mid - 1;
  //     ciling = low;
  //   }

  //   return nums[ciling];
  // }

  // public static void main(String[] args) {

  //   Scanner sc = new Scanner(System.in);
  //   System.out.print("Enter size: ");
  //   int n = sc.nextInt();
  //   System.out.println("Enter array elements");
  //   int arr[] = new int[n];
  //   for (int i = 0; i < n; i++) {
  //     arr[i] = sc.nextInt();
  //   }
  //   System.out.println("Enter target: ");
  //   int t = sc.nextInt();
  //   System.out.println(Celing(arr, t));

  //   sc.close();
  // }

  // public static int Floar(int nums[], int target){

  //   int low = 0, high = nums.length-1;

  //   int Floar = 0;

  //   while(low <= high){

  //     int mid = low + (high - low)/2;

  //     if(target == nums[mid]) {
  //       return nums[mid];
  //     }

  //     else if(target > nums[mid]){
  //       low = mid + 1;
  //       Floar = low;
  //     }

  //     else {
  //       high = mid - 1;
  //       Floar = low;
  //     }

  //   }
  //   return nums[Floar-1];
  // }

  // public static void main(String[] args) {

  //   Scanner sc = new Scanner(System.in);
  //   System.out.print("Enter size: ");
  //   int n = sc.nextInt();
  //   System.out.println("Enter array elements");
  //   int arr[] = new int[n];
  //   for (int i = 0; i < n; i++) {
  //     arr[i] = sc.nextInt();
  //   }
  //   System.out.println("Enter target: ");
  //   int t = sc.nextInt();
  //   System.out.println(Floar(arr, t));

  //   sc.close();
  // }

  public static void Occurance(int []arr, int target){


    int i = 0;
    int j = arr.length - 1;

    while(arr[i] != target) i++;
    while (arr[j]!= target) j--;
    
    System.out.println(i+" "+j);
    
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
    Occurance(arr, t);

    sc.close();
  }

}
