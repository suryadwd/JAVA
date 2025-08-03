package August;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Sum: "+digitSum(a));
    System.out.println("Multiply: "+digitMul(a));
    sc.close();
  }

  public static int digitSum(int n){
    if(n == 0) return 0;
    int digit = n % 10;
    return digit + digitSum(n/10);
  }

  public static int digitMul(int n){
   if(n == 0) return 1;
   int digit = n % 10;
   return digit * digitMul(n/10); 
  }

}
