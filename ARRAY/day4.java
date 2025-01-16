package ARRAY;

import java.util.Scanner;

public class day4 {

  static void sort(int [] crr){
    for(int i = 0; i < crr.length; i++){
      for(int j = 0; j < crr.length - i - 1; j++){
        if(crr[j] > crr[j+1]){
          int temp = crr[j];
          crr[j] = crr[j+1] ;
          crr[j+1] = temp;
        }
      }
    }
  }

  public static void merge(int[] arr, int [] brr) {
      int [] crr = new int[arr.length + brr.length];

      for(int i = 0; i < arr.length; i++){
        crr[i] = arr[i];
      }

      for(int i = 0; i < brr.length; i++){
        crr[i+arr.length] = brr[i];
      }

      sort(crr);

      for (int i : crr) {
        System.out.print(i+" ");
      }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int brr[] = new int[n];
    for (int i = 0; i < arr.length; i++)
      arr[i] = sc.nextInt();
    for (int i = 0; i < brr.length; i++)
      brr[i] = sc.nextInt();
    merge(arr, brr);
    sc.close();
  }

}
