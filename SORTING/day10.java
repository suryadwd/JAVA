import java.util.Scanner;

public class day10 {

  // static void SELECTIONSORT(int[] arr){
  // for(int i = 0; i < arr.length; i++){
  // int min = Integer.MAX_VALUE;
  // int minIndx = -1;
  // for(int j = i; j < arr.length; j++){
  // if(min > arr[j]){
  // min = arr[i];
  // minIndx = j;
  // }
  // }
  // int temp = arr[i];
  // arr[i] = arr[minIndx];
  // arr[minIndx] = temp;
  // }
  // }

  // static void INSERTIONSORT(int []arr){
  // for(int i = 1; i < arr.length ;i++){
  // for(int j = i ; j >= 1; j--){
  // if(arr[j] < arr[j-1]){
  // int temp = arr[j];
  // arr[j] = arr[j-1];
  // arr[j-1] = temp;
  // }else break;
  // }
  // }
  // }

  static void Transforming(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      int min = Integer.MAX_VALUE;
      int minIndx = 0;
      int x=-1;

      for (int j = 0; j < arr.length; j++) {
        if (min > arr[j] && arr[j] > 0) {
          min = arr[j];
          minIndx=j;
        }
        arr[minIndx]=x;
        x--;
      }
     
    }
   for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
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

    Transforming(arr);

    for (int i : arr) {
      System.out.print(i + " ");
    }

  }

}
