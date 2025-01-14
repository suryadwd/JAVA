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

  // 3 -> buble sort binary search and finding the element all in one

  // public static void BUBLESORT(int num[]) {
  // for (int i = 0; i < num.length; i++) {
  // for (int j = 0; j < num.length - i - 1; j++) {
  // if (num[j] > num[j + 1]) {
  // int temp = num[j];
  // num[j] = num[j + 1];
  // num[j + 1] = temp;
  // }
  // }
  // }

  // }

  // public static int BINARYSEARCH(int num[], int target) {

  // BUBLESORT(num);

  // int low = 0;
  // int high = num.length - 1;

  // while (low <= high) {
  // int mid = low + (high - low) / 2;

  // if (num[mid] == target)
  // return mid;

  // else if (target > num[mid])
  // low = mid + 1;

  // else
  // high = mid - 1;

  // }
  // return -1;
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // System.out.println("Enter the size of array");
  // int n = sc.nextInt();
  // int arr[] = new int[n];
  // System.out.print("array elements: ");
  // for (int i = 0; i < arr.length; i++)
  // arr[i] = sc.nextInt();
  // System.out.print("Enter target: ");
  // int key = sc.nextInt();
  // int res = BINARYSEARCH(arr, key);

  // if (res != -1)
  // System.out.println("Founded in sorted array at index: " + (res));
  // else
  // System.out.println("Not found");

  // sc.close();
  // }

  // 4 ->Emplementing the merge sort

  // public static void merge(int num[], int low, int mid, int high) {

  //   int temp[] = new int[high - low + 1];

  //   int left = low, right = mid + 1, index = 0;

  //   while (left <= mid && right <= high) {
  //     if (num[left] <= num[right]) {
  //       temp[index++] = num[left++];
  //     } else
  //       temp[index++] = num[right++];
  //   }

  //   while (left <= mid) {
  //     temp[index++] = num[left++];
  //   }

  //   while (right <= high) {
  //     temp[index++] = num[right++];
  //   }

  //   index = 0;

  //   while (low <= high) {
  //     num[low++] = temp[index++];
  //   }

  // }

  // public static void mergeSort(int num[], int low, int high) {
  //   int mid = low + (high - low) / 2;
  //   if (low == high)
  //     return;
  //   mergeSort(num, low, mid);
  //   mergeSort(num, mid + 1, high);
  //   merge(num, low, mid, high);
  // }

  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter the size of array");
  //   int n = sc.nextInt();
  //   int arr[] = new int[n];
  //   System.out.print("Enter array elements: ");
  //   for (int i = 0; i < arr.length; i++)
  //     arr[i] = sc.nextInt();
  //   mergeSort(arr, 0, arr.length - 1);
  //   System.out.println("Sorting the array using mergeSort");
  //   for (int i = 0; i < arr.length; i++)
  //     System.out.print(arr[i] + " ");
  //   sc.close();
  // }



  // 5 ->Finding the largest number using mergeSort

  public static void merge(int num[], int low, int mid, int high){

    int temp [] = new int[high - low + 1];

    int left = low, right = mid+1, index = 0;

    while (left <= mid && right <= high) {
      if(num[left] <= num[right]){
        temp[index++] = num[left++];
      }else{
        temp[index++] = num[right++];
      }
    }

    while (left <= mid) {
      temp[index++] = num[left++];
    }

    while(right <= high){
      temp[index++] = num[right++];
    }

    //yaha tak bhar gaya temp sorted element se
    //avi hmko num array me sara element store krna hai

    index = 0;

    while (low<=high) {
      num[low++] = temp[index++];
    }

  }

  public static void mergeSort(int num[], int low, int high){
    int mid = low + (high-low)/2;
    if(low == high) return;
    //left me jao
    mergeSort(num, low, mid);
    //right me jao
    mergeSort(num, mid+1, high);
    //jod do
    merge(num,low,mid,high);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter array elements: ");
    for (int i = 0; i < arr.length; i++)
      arr[i] = sc.nextInt();
    mergeSort(arr, 0, arr.length - 1);
    System.out.println("Finding the largest element");
      System.out.print(arr[arr.length - 1] + " ");
    sc.close();
  }

}
