package Conditionals;

import java.util.*;

public class day1Cond {
  // public static void main(String[] args) {
  // System.out.println("Even odd finder");
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // if(a%2 == 0) System.out.println(a+" a even number");
  // else System.out.println(a+" a odd number");
  // sc.close();
  // }

  // public static void main(String[] args) {
  // System.out.println("Checking number is divisible by 5 or not");
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // if(a%5 == 0) System.out.println("divisible");
  // else System.out.println("not divisible");
  // sc.close();
  // }

  // public static void main(String[] args) {
  // System.out.println("Printing absolut value");
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // if(a < 0) a = -a;
  // System.out.println(a);
  // sc.close();
  // }

  // public static void main(String[] args) {
  // System.out.println("Profit loss calculator: ");
  // Scanner sc = new Scanner(System.in);
  // System.out.println("enter costPrice sellingPrice: ");
  // double cp = sc.nextDouble();
  // double sp = sc.nextDouble();

  // if(cp<sp) System.out.println("Made profit of: "+( sp-cp ));
  // else if(cp>sp) System.out.println("Made loss: "+(cp-sp));
  // else System.out.println("no profit no loss");

  // sc.close();
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // System.out.println("Number of digits in input");
  // int a = sc.nextInt();
  // int b = a;
  // int cnt = 0;
  // while(b>0){
  // b = b / 10;
  // cnt++;
  // }
  // System.out.println("number of digits are: "+cnt);
  // sc.close();
  // }

  // public static void Triangle(int a, int b, int c){
  // if(a+b > c && a+c > b && b+c > a) System.out.println("Yes");
  // else System.out.println("no");
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // int b = sc.nextInt();
  // int c = sc.nextInt();
  // Triangle(a,b,c);

  // sc.close();
  // }

  // public static int Greatest(int a, int b, int c){
  // int ans;
  // if(a>b && a>c) ans = a;
  // else if(c>b && c>a) ans = c;
  // else ans = b;
  // return ans;
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // System.out.println("Enter three number to get the greatest in them");
  // int a = sc.nextInt();
  // int b = sc.nextInt();
  // int c = sc.nextInt();
  // int res = Greatest(a,b,c);
  // System.out.println(res);
  // sc.close();
  // }

  // public static int Smallest(int a, int b, int c){
  // int ans;
  // if(a<b && a<c) ans = a;
  // else if(c<b && c<a) ans = c;
  // else ans = b;
  // return ans;
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // System.out.println("Enter three number to get the Smallest in them");
  // int a = sc.nextInt();
  // int b = sc.nextInt();
  // int c = sc.nextInt();
  // int res = Smallest(a,b,c);
  // System.out.println(res);
  // sc.close();
  // }

  // public static int Smallest(int a, int b){
  // int ans = (a<b) ? a : b;
  // return ans;
  // }

  // public static void main(String[] args) {
  // System.out.println("learning ternary operator");
  // Scanner sc = new Scanner(System.in);
  // System.out.println("enter two numbers: ");
  // int a = sc.nextInt();
  // int b = sc.nextInt();
  // int res = Smallest(a,b);
  // System.out.println(res);

  // sc.close();
  // }

  // public static boolean LeapCheck(int num){
  // boolean ans;
  // if(num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) ans = true;
  // else ans = false;
  // return ans;
  // }

  // public static void main(String[] args) {
  // System.out.println("leap year checker");
  // Scanner sc = new Scanner(System.in);
  // int year = sc.nextInt();
  // boolean res = LeapCheck(year);
  // System.out.println(res);
  // sc.close();
  // }

  // public static void print1to100Even(){
  // for(int i = 1; i < 101; i++) if(i % 2 == 0) System.out.println(i+" ");
  // }

  // public static void main(String[] args) {
  // print1to100Even();
  // }

  // public static void AP(int q){
  // int ans = 0 ;
  // for(int n = 1; n <= q; n++){
  // ans = + (1 + (n-1) * 2);
  // System.out.print(ans+" ");
  // }
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();

  // AP(a);

  // sc.close();
  // }

  // public static void GP(int n) {
  // int ans = 0;

  // for (int i = 1; i <= n; i++) {
  // ans = (int) (1 * (Math.pow(2, i - 1)));
  // System.err.print(ans + " ");
  // }

  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // GP(a);
  // sc.close();
  // }

  // public static void Composite(int n){
  // int count = 0;
  // for(int i = 1; i <= n; i++){
  // if(n%i == 0) count++;
  // }
  // if (count>2) System.out.println("Composite number");
  // else System.out.println("Not a composite number");
  // }
  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // Composite(a);
  // sc.close();
  // }

  // public static void Prime(int n) {
  // int count = 0;
  // for (int i = 2; i < n; i++) {
  // if (n % i == 0)
  // count++;
  // }

  // if (count > 0) {
  // System.out.println("Not a prime");
  // } else {
  // System.out.println("Prime");
  // }

  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // Prime(a);
  // sc.close();
  // }

  // public static void BreakUse(int n){
  // for(int i = 1; i <= n; i++){
  // if(i == 5) break;
  // else System.out.println(i);
  // }
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // BreakUse(a);
  // sc.close();
  // }

  // public static void DigitAdder(int n) {
  //   int b = n;
  //   int sum = 0;

  //   while (b > 0) {
  //     int digit = b % 10;
  //     sum = sum + digit;
  //     b = b / 10;
  //   }
  //   System.out.println(sum);
  // }

  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   int a = sc.nextInt();
  //   DigitAdder(a);
  //   sc.close();
  // }

  public static int Fibo(int n){
    if (n==0) return 0;
    if (n == 1) return 1;
    return Fibo(n-1)+Fibo(n-2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int res = Fibo(a);
    System.out.println(res);
    sc.close();
  }

}
