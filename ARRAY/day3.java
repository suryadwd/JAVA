package ARRAY;

import java.util.Scanner;

public class day3 {
  
  // public static void Reverse(int [] num){
  //   int low = 0;
  //   int high = num.length-1;

  //   while (low<high) {
  //     int temp = num[low];
  //     num[low] = num[high];
  //     num[high] = temp;
  //     low++;
  //     high--;
  //   }
  //   for (int i : num) {
  //     System.out.print(i+" ");
  //   }
  // }

//   public static void main (String [] args){
//   Scanner sc = new Scanner(System.in);
//   System.out.print("Enter length: ");
//   int n = sc.nextInt();
//   int arr[] = new int[n];
//   for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
//   for(int ele: arr) System.out.print(ele+" ");
//   System.out.println();
//   Reverse(arr);

//   sc.close();
// }


public static int BinarySearch(int [] num, int target){
  int low = 0, high = num.length-1;

  while (low <= high) {
    int mid = low+(high - low)/2;

    if(target == num[mid]) return 1;

    else if(target < num[mid]) high = mid - 1;

    else low = mid + 1;

  }
    return -1;
}

public static void main (String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter length: ");
  int n = sc.nextInt();
  int arr[] = new int[n];
  System.out.print("Enter array: ");
  for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
  System.out.print("Enter target: ");
  int m = sc.nextInt();
  int res = BinarySearch(arr,m);

  if(res == 1) System.out.println("Founded");
  else System.out.println("not founded");

  sc.close();
}


}
