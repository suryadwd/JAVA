
package ARRAY;

import java.util.Scanner;

public class day8 {


  // 1->Finding the first Occurence of a number

  // static void firstOcc(int[] arr, int target) {
  //   int low = 0, high = arr.length - 1;
  //   int index = -1;
  //   while (low <= high) {
  //     int mid = low + (high - low) / 2;

  //     if (arr[mid] == target) {
  //       index = mid;
  //       high = mid - 1;
  //     } else if (arr[mid] > target)
  //       high = mid - 1;
  //     else
  //       low = mid + 1;

  //   }
  //   System.out.println("First occ: "+index);
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
      //   System.out.println("Enter target");
      //   int t = sc.nextInt();
      //   firstOcc(arr, t);
      //   sc.close();
      // }
      
      static void lastOcc(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int index = -1;
        while (low <= high) {
          int mid = low + (high - low) / 2;
    
          if (arr[mid] == target) {
            index = mid;
              low = mid + 1;
          } else if (arr[mid] > target)
            high = mid - 1;
          else
            low = mid + 1;
    
        }
        System.out.println("Last occ: "+index);
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
        System.out.println("Enter target");
        int t = sc.nextInt();
        lastOcc(arr,t);
        sc.close();
      }

    }
    