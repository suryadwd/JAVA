package Conditionals;
import java.util.Scanner;
public class day1Cond {
  public static void main(String[] args) {
    System.out.println("Even odd finder");
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    if(a%2 == 0) System.out.println(a+" a even number");
    else System.out.println(a+" a odd number");

    sc.close();
  }
}
