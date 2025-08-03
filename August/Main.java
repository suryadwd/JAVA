package August;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(digitSum(a));
    sc.close();
  }

  public static int digitSum(int n){
    if(n == 0) return 0;
    int digit = n % 10;
    return digit + digitSum(n/10);
    
  }

}
