// to run any program just perform this first
// javac day1.java
// java day1.java

import java.util.Scanner;
class day1 {

  // public static void main(String[] args) {
  //   System.out.println("hlo world");    
  //   System.out.println("learning java day 1");
  // }

  // public static void main(String[] args) {
  //   int x = 5;
  //   int y = 2;
  //   System.out.println("Learning arithmatics");
  //   System.out.println(x+y); //7
  //   System.out.println(x-y); //3
  //   System.out.println(x*y); //10
  //   System.out.println(x/y); //2

  // }

  // public static void main(String[] args) {
  //   float x = 6.9f;
  //   float y = 3;
  //   System.out.println("Learning arithmatics");
  //   System.out.println(x+y); 
  //   System.out.println(x-y); 
  //   System.out.println(x*y); 
  //   System.out.println(x/y);
  // }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Printing the area using user input: ");
    int x = sc.nextInt();

    System.out.println("area of circle is: "+(x*3.14*x));

    sc.close();

  }

}