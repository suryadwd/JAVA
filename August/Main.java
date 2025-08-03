package August;
import java.util.*;
public class Main {

  static int rev = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(checkPalindrome(a));
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

  public static int digitReverse(int n) {
    if (n == 0) return rev;
    int digit = n % 10;
    rev = rev * 10 + digit;
    return digitReverse(n / 10);
  }


  public static boolean checkPalindrome(int n) {
    int check = n;
    int rev = 0;
    while (check != 0) {
      int digit = check%10;
      rev = rev * 10 + digit;
      check = check/10;
    }
    return rev == n;
  }

}
