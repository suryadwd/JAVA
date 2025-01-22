import java.util.Scanner;

public class day10 {

  static void SELECTIONSORT(int[] arr){
    for(int i = 0; i < arr.length; i++){
      int min = Integer.MAX_VALUE;
      int minIndx = -1;
      for(int j = i; j < arr.length; j++){
          if(min > arr[j]){
            min = arr[i];
            minIndx  = j;
          }
      }
      int temp = arr[i];
      arr[i] =  arr[minIndx];
      arr[minIndx] = temp;
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size: ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {

      arr[i] = sc.nextInt();

    }
    sc.close();

    SELECTIONSORT(arr);

    for (int i : arr) {
      System.out.print(i+" ");
    }

  }

}
