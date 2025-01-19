package ARRAY;

import java.util.Scanner;

public class day7 {

  // 1 -> Rverse an array

  // public static void Rev(int []arr){
  // int low = 0, high = arr.length-1;
  // while(low<high){
  // int temp = arr[low];
  // arr[low] = arr[high];
  // arr[high] = temp;
  // low++;
  // high--;
  // }
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

  // Rev(arr);

  // for (int i : arr) {
  // System.out.print(i+" ");
  // }

  // sc.close();
  // }

  // 2 -> Maximum and Minimum in array

  // static void MaxMin(int[]arr){
  // int max = arr[0];
  // int min = arr[0];
  // for(int i = 0; i < arr.length; i++){
  // if(arr[i]>arr[0]) max = arr[i];
  // if(arr[i] < min) min = arr[i];
  // }
  // System.out.println("Maximum ele: "+max);
  // System.out.println("Minimum ele: "+min);
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

  // MaxMin(arr);

  // sc.close();
  // }

  // 3-> kth largest and smallest element of array

  // static void Sort(int arr[]){
  // for(int i = 0; i < arr.length; i++){
  // for(int j = 0; j < arr.length - i - 1; j++){
  // if(arr[j]>arr[j+1]){
  // int temp = arr[j];
  // arr[j] = arr[j+1];
  // arr[j+1] = temp;
  // }
  // }
  // }
  // }

  // static void KtnMaxMin(int [] arr, int target){

  // int low = 0, high = arr.length-1;

  // Sort(arr);

  // int k = 1;

  // while (k < target) {
  // low++;
  // high--;

  // k++;
  // }

  // System.out.print(target+"nd Max element: "+arr[low]);
  // System.out.println();
  // System.out.print(target+"nd Min element: "+arr[high]);

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
  // System.out.println("Enter target: ");
  // int t = sc.nextInt();
  // KtnMaxMin(arr,t);

  // sc.close();
  // }

  // 4 -> Sorting 0 1 2 without using any sorting method

  // static void swap(int[] arr, int i, int j) {
  // int temp = arr[i];
  // arr[i] = arr[j];
  // arr[j] = temp;
  // }

  // static void Sort012(int[] arr) {

  // int low = 0;
  // int high = arr.length-1;
  // int itr = 0;

  // while (itr<= high) {
  // if(arr[itr] == 0) {
  // swap(arr,low,itr);
  // itr++;
  // low++;
  // }
  // else if(arr[itr] == 1) itr++;

  // else if(arr[itr] == 2){
  // swap(arr,high,itr);
  // high--;
  // }
  // }
  // for (int i = 0; i < arr.length; i++) {
  // System.out.print(arr[i]+" ");
  // }
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

  // Sort012(arr);

  // sc.close();
  // }

  // 5 -> moving negative number to left side of an array

  // static void swap(int[] arr, int i, int j) {
  // int temp = arr[i];
  // arr[i] = arr[j];
  // arr[j] = temp;
  // }

  // static void sider(int[] arr) {
  // int low = 0, high = arr.length - 1, itr = 0;

  // while (itr <= high) {

  // if (arr[itr] < 0) {
  // swap(arr, low, itr);
  // low++;
  // itr++;
  // } else
  // itr++;

  // }

  // for (int i = 0; i < arr.length; i++) {
  // System.out.print(arr[i] + " ");
  // }

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

  // sider(arr);

  // sc.close();
  // }

  // 6 -> Union and intersection of array

  static void UniIntArray(int[] arr1, int[] arr2) {

    int i = 0, j = 0, k = 0;

    int uni[] = new int[arr1.length + arr2.length];

    int intr[] = new int[Math.min(arr1.length, arr2.length)];

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        uni[k] = arr1[i];
        i++;
        k++;
      } else if (arr1[i] > arr2[j]) {
        uni[k] = arr2[j];
        j++;
        k++;
      } else {
        uni[k] = arr1[i];
        i++;
        j++;
        k++;
      }

    }

    while (i < arr1.length) {
      uni[k] = arr1[i];
      k++;
      i++;
    }

    while (j < arr2.length) {
      uni[k] = arr2[j];
      k++;
      j++;
    }
    System.out.print("Union of the array: ");
    for (int l : uni) {
      System.out.print(l + " ");
    }

    i = 0;
    j = 0;
    k = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        i++;
      } else if (arr1[i] > arr2[j]) {
        j++;
      } else {
        intr[k] = arr1[i];
        i++;
        j++;
        k++;
      }

    }

    
    System.out.println();

    System.out.print("Intersection of Array: ");

    for (int l : intr) {
      System.out.print(l + " ");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array 1 size: ");
    int n = sc.nextInt();
    System.out.println("Enter array 1 elements");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter array 2 size: ");
    int m = sc.nextInt();
    System.out.println("Enter array 2 elements");
    int brr[] = new int[m];
    for (int i = 0; i < m; i++) {
      brr[i] = sc.nextInt();
    }

    UniIntArray(arr, brr);

    sc.close();
  }

}
