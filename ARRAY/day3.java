package ARRAY;

import java.util.Scanner;

public class day3 {

  // public static void Reverse(int [] num){
  // int low = 0;
  // int high = num.length-1;

  // while (low<high) {
  // int temp = num[low];
  // num[low] = num[high];
  // num[high] = temp;
  // low++;
  // high--;
  // }
  // for (int i : num) {
  // System.out.print(i+" ");
  // }
  // }

  // public static void main (String [] args){
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter length: ");
  // int n = sc.nextInt();
  // int arr[] = new int[n];
  // for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
  // for(int ele: arr) System.out.print(ele+" ");
  // System.out.println();
  // Reverse(arr);
  // sc.close();
  // }

  // public static int BinarySearch(int [] num, int target){
  // int low = 0, high = num.length-1;
  // while (low <= high) {
  // int mid = low+(high - low)/2;
  // if(target == num[mid]) return 1;
  // else if(target < num[mid]) high = mid - 1;
  // else low = mid + 1;
  // }
  // return -1;
  // }

  // public static void main (String [] args){
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter length: ");
  // int n = sc.nextInt();
  // int arr[] = new int[n];
  // System.out.print("Enter array: ");
  // for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
  // System.out.print("Enter target: ");
  // int m = sc.nextInt();
  // int res = BinarySearch(arr,m);

  // if(res == 1) System.out.println("Founded");
  // else System.out.println("not founded");

  // sc.close();
  // }

  // public static void Swap(int[] num,int a, int b) {
  // int temp = num[a];
  // num[a] = num[b];
  // num[b] = temp;
  // }

  // public static void ReverseArray(int[] num) {
  // int low = 0, high = num.length - 1;

  // while (low < high) {
  // Swap(num,low, high);
  // low++;
  // high--;
  // }
  // for (int i : num) {
  // System.out.print(i + " ");
  // }
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter length: ");
  // int n = sc.nextInt();
  // int arr[] = new int[n];
  // System.out.print("Enter array: ");
  // for (int i = 0; i < arr.length; i++)
  // arr[i] = sc.nextInt();
  // ReverseArray(arr);
  // sc.close();
  // }

  // public static void RotateArray(int[] num, int rotate) {
    
  //   int low = 0, high = num.length - 1;    

  //   while (low <= high) {
  //     int temp = num[low];
  //     num[low] = num[high];
  //     num[high]  = temp;
  //     low++;
  //     high--;
  //   }
    

  //   low = 0;
  //   high = rotate-1;

  //   while (low < high) {
      
  //     int temp = num[low];
  //     num[low] = num[high];
  //     num[high]  = temp;
  //     low++;
  //     high--;

  //   }

  //   low = rotate;
  //   high = num.length-1;

  //   while (low < high) {
  //     int temp = num[low];
  //     num[low] = num[high];
  //     num[high]  = temp;
  //     low++;
  //     high--; 
  //   }

  //  for (int k : num) {
  //   System.out.print(k+" ");
  //  }

  // }

  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.print("Enter length: ");
  //   int n = sc.nextInt();
  //   int arr[] = new int[n];
  //   System.out.print("Enter array: ");
  //   for (int i = 0; i < arr.length; i++)
  //     arr[i] = sc.nextInt();
  //   System.out.print("Rotate array no: ");
  //   int r = sc.nextInt();
  //   RotateArray(arr, r);
  //   sc.close();
  // }


  // public static void Reverse(int []num, int low, int high){
  //   while(low <= high){
  //     int temp = num[low];
  //     num[low] = num[high];
  //     num[high] = temp;
  //     low++;
  //     high--;
  //   }
  // }

  // public static void RotateArray(int []num, int rotate){
  //   Reverse(num, 0, num.length-1);
  //   Reverse(num, 0, rotate-1);
  //   Reverse(num, rotate, num.length-1);
  //   for (int i : num) System.out.print(i+" ");
  // }
  
  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.print("Enter length: ");
  //   int n = sc.nextInt();
  //   int arr[] = new int[n];
  //   System.out.print("Enter array: ");
  //   for (int i = 0; i < arr.length; i++)
  //     arr[i] = sc.nextInt();
  //   System.out.print("Rotate array no: ");
  //   int r = sc.nextInt();
  //   RotateArray(arr, r);
  //   sc.close();
  // }

  // public static void BubleSortArray(int [] num) {
    
  //   for(int i= 0; i < num.length; i++){
  //     for(int j= 0; j < num.length - i - 1; j++){
  //       if(num[j]>num[j+1]){
  //        int temp = num[j];
  //        num[j] = num[j+1];
  //        num[j+1] = temp;
  //       }
  //     }
  //   }
  //   for (int i : num) {
  //     System.out.print(i+" ");
  //   }
  // }

  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.print("Enter length: ");
  //   int n = sc.nextInt();
  //   int arr[] = new int[n];
  //   System.out.print("Enter array: ");
  //   for (int i = 0; i < arr.length; i++)
  //     arr[i] = sc.nextInt();
  //     BubleSortArray(arr);
  //   sc.close();
  // }

  // public static void main(String[] args) {
  //   System.out.println("Searching in 2D array");
  //   Scanner sc = new Scanner(System.in);
  //   int [] [] arr = { {1,2,3}, {65,23,455,61}, {98,76,23,54} };

  //   int target =23;

  //   for(int i = 0; i < arr.length; i++){
  //     for(int j = 0; j < arr.length; j++){
  //       if(arr[i][j] == target) System.out.println("Founded");
  //     }
  //   }
  //   sc.close();
  // }

  static void EvenDigit(int [] num){

    for(int i = 0; i <num.length; i++){
      int cnt = 0;
      int no = num[i];
      while(no !=0){
        cnt++;
        no = no / 10;
      }
      if(cnt%2 == 0) System.out.println(num[i]+" ");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter array: ");
    for (int i = 0; i < arr.length; i++)
      arr[i] = sc.nextInt();
      EvenDigit(arr);
    sc.close();
  }


}
