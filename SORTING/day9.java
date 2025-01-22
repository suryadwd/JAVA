

import java.util.Scanner;

public class day9 {
  
  static void PRINT(int arr[]){
    for (int i : arr) {
      System.out.print(i+" ");
    }
  }

  // static void SWAP(int []arr, int ele, int corrIndx){
  //   int temp = arr[ele];
  //   arr[ele] = arr[corrIndx];
  //   arr[corrIndx] = temp;
  // }

  // static int partition(int arr[], int low, int high){
  //   int ele = low;
  //   int smallCnt = 0;
  //   for(int i = low+1; i <= high; i++) if(arr[i]<arr[ele]) smallCnt++;
  //   int corrIndx = low + smallCnt;
  //   SWAP(arr,ele,corrIndx);
  //   int i = low , j = high; 
  //   while (i < corrIndx && j > corrIndx) {
  //     if(arr[i] < arr[corrIndx]) i++;
  //     else if(arr[j] > arr[corrIndx]) j--;
  //     else if(arr[i] > arr[corrIndx] && arr[j] < arr[corrIndx]) SWAP(arr, i, j);
  //   }
  //   return corrIndx;
  // }

  // static void quickSort(int arr[],int low, int high){
  //   if(low>=high) return;
  //   int pivot = partition(arr,low,high);
  //   quickSort(arr, low, pivot-1);
  //   quickSort(arr, pivot+1, high);

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
  //   sc.close();
  //   quickSort(arr,0,arr.length-1);
  //   PRINT(arr);

  // }

  static boolean  CheckSort(int [] arr){
    
    boolean flag = true;

    for(int i = 0; i < arr.length; i++){
      if(arr[i] >= arr[i+1]){
          flag = false;
          break;
      }
    }
    return flag;
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
    sc.close();
   System.out.println( CheckSort(arr));
   

  }

}
