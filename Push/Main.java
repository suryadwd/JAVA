package Push;

import java.util.Scanner;


class NumberClassifier {
    
  int [] arr;
  int n;
  
  public static void classifyNumbers(int[]arr){
     
  }
  
  public static void printEvenNumbers(int[]arr){
      System.out.print("Even Numbers: ");
      for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0) {
              System.out.println(arr[i]);
          }
      }
  }
  
  public static void printOddNumbers(int[]arr){
      System.out.print("Odd Numbers: ");
      for(int i=0;i<arr.length;i++){
          if(arr[i]%2!=0) {
              System.out.println(arr[i]);
          }
      }
  }
  
}
public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      NumberClassifier obj = new NumberClassifier();
      obj.n = scanner.nextInt();
      int[] arr = new int[obj.n];
      
      for (int i = 0; i < obj.n; i++) {
          arr[i] = scanner.nextInt();
      }
      
      obj.classifyNumbers(arr);
      obj.printEvenNumbers(arr);
      obj.printOddNumbers(arr);

      scanner.close();
  }
}
