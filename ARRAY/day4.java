package ARRAY;

import java.util.Scanner;

public class day4 {

  // static void sort(int [] crr){
  // for(int i = 0; i < crr.length; i++){
  // for(int j = 0; j < crr.length - i - 1; j++){
  // if(crr[j] > crr[j+1]){
  // int temp = crr[j];
  // crr[j] = crr[j+1] ;
  // crr[j+1] = temp;
  // }
  // }
  // }
  // }

  // public static void merge(int[] arr, int [] brr) {
  // int [] crr = new int[arr.length + brr.length];

  // for(int i = 0; i < arr.length; i++){
  // crr[i] = arr[i];
  // }

  // for(int i = 0; i < brr.length; i++){
  // crr[i+arr.length] = brr[i];
  // }

  // sort(crr);

  // for (int i : crr) {
  // System.out.print(i+" ");
  // }
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // int arr[] = new int[n];
  // for (int i = 0; i < n; i++)
  // arr[i] = sc.nextInt();
  // int m = sc.nextInt();
  // int brr[] = new int[m];
  // for (int i = 0; i < m; i++)
  // brr[i] = sc.nextInt();
  // merge(arr, brr);
  // sc.close();
  // }

  // public static void merge(int[] arr, int[] brr) {
  //   int crr[] = new int[arr.length + brr.length];

  //   int i = 0, j = 0, k = 0;

  //   while (i < arr.length && j < brr.length) {
  //     if (arr[i] <= arr[j]) {
  //       crr[k] = arr[i];
  //       i++;
  //     } else {
  //       crr[k] = brr[j];
  //       j++;
  //     }
  //     k++;
  //   }

  //   if (i == arr.length) {
  //     while (j < brr.length) {
  //       crr[k] = brr[j];
  //       k++;
  //       j++;
  //     }
  //   }
  //   if (j == brr.length) {
  //     while (i < arr.length) {
  //       crr[k] = arr[i];
  //       k++;
  //       i++;
  //     }
  //   }

  //   for (int m : crr)
  //     System.out.print(m + " ");

  // }

  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   int n = sc.nextInt();
  //   int arr[] = new int[n];
  //   for (int i = 0; i < n; i++)
  //     arr[i] = sc.nextInt();
  //   int m = sc.nextInt();
  //   int brr[] = new int[m];
  //   for (int i = 0; i < m; i++)
  //     brr[i] = sc.nextInt();
  //   merge(arr, brr);
  //   sc.close();
  // }


  public static void merge(int arr[], int brr[]){

    int crr [] = new int[arr.length + brr.length];

    int i = arr.length - 1, j = brr.length - 1, k = crr.length - 1;

    while (i > -1 && j > -1) {
      
      if(arr[i] > brr[j]){
        crr[k] = arr[i];
        i--;
      }
      else{
        crr[k] = brr[j];
        j--;
      }
       k--; 
    }

   
      while(j > -1){
        crr[k] = brr[j];
        j--;
        k--;
      }
   

    
      while (i > -1) {
        crr[k] = arr[i];
        i--;
        k--;
      }
    
      for (int e : crr) {
        System.out.print(e+" ");
      }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int m = sc.nextInt();
    int brr[] = new int[m];
    for (int i = 0; i < m; i++)
      brr[i] = sc.nextInt();
    merge(arr, brr);
    sc.close();
  }

}
