package ARRAY;

import java.util.Scanner;

public class day2 {

  // 1 -> input and output of array

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // int arr [] = new int[n];

  // for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

  // for(int i = 0; i < arr.length; i++) if (arr[i] < 35)
  // System.out.print(arr[i]+" ");

  // sc.close();
  // }

  // 2 -> sum of the element of array

  // public static int SUM(int num[]) {
  // int sum = 0;
  // for (int i = 0; i < num.length; i++)
  // sum = sum + num[i];
  // return sum;
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // int arr[] = new int[n];

  // for (int i = 0; i < arr.length; i++)
  // arr[i] = sc.nextInt();

  // int res = SUM(arr);

  // System.out.println(res);
  // sc.close();
  // }

  // public static void BUBLESORT(int num[]) {
  //   for (int i = 0; i < num.length; i++) {
  //     for (int j = 0; j < num.length - i - 1; j++) {
  //       if (num[j] > num[j + 1]) {
  //         int temp = num[j];
  //         num[j] = num[j + 1];
  //         num[j + 1] = temp;
  //       }
  //     }
  //   }

  // }

  // public static int BINARYSEARCH(int num[], int target) {

  //   BUBLESORT(num);

  //   int low = 0;
  //   int high = num.length - 1;

  //   while (low <= high) {
  //     int mid = low + (high - low) / 2;

  //     if (num[mid] == target)
  //       return mid;

  //     else if (target > num[mid])
  //       low = mid + 1;

  //     else
  //       high = mid - 1;

  //   }
  //   return -1;
  // }

  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter the size of array");
  //   int n = sc.nextInt();
  //   int arr[] = new int[n];
  //   System.out.print("array elements: ");
  //   for (int i = 0; i < arr.length; i++)
  //     arr[i] = sc.nextInt();
  //   System.out.print("Enter target: ");
  //   int key = sc.nextInt();
  //   int res = BINARYSEARCH(arr, key);

  //   if (res != -1)
  //     System.out.println("Founded in sorted array at index: " + (res));
  //   else
  //     System.out.println("Not found");

  //   sc.close();
  // }

  

}
