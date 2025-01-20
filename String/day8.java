package String;

import java.util.Scanner;

public class day8 {

  // 1-> count number of vovels

  // static void VowelCounter(String s){

  // int count = 0;

  // for(int i = 0; i < s.length(); i++){
  // if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i'||s.charAt(i)
  // == 'o'||s.charAt(i) == 'u') count++;
  // }

  // System.out.println("Vovels: "+count);

  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // String s = sc.nextLine();

  // VowelCounter(s);

  // sc.close();
  // }

  // finding tht index of a number
  // public static void main(String[] args) {
  //   // String s = "hlo suraj kaise ho tum i lov you";

  //   // System.out.println(s.indexOf("u"));

  //   String a = "azc";
  //   String b = "aaa";

  //   System.out.println(a.compareTo(b));

  // }

  // 2-> To lower and upper 
  // public static void main(String[] args) {
  //   String a = "azc";
  //   String b = "ABZ";
  //   System.out.println(a.toUpperCase());
  //   System.out.println(b.toLowerCase());

  // }

  // 3 -> substring inbuild method

  // public static void main(String[] args) {
  //   String a = "abcdef";
  //   System.out.println(a.substring(1,4));

  // }

  // 3 -> concat inbuild method

  // public static void main(String[] args) {
  //   String a = "abcdef";
  //   String b = "xxxxxx";
  //   String c = a + b;
  //   System.out.println(a.concat(b));
  //   System.out.println(c);

  // }

  // 4 -> equals() and == in string

  public static void main(String[] args) {
    // String a = "abcdef";
    // String b = "xxxxxx";
    // System.out.println(a==b); // false normally
    // String p = "abcdef";
    // String q = "abcdef";
    // System.out.println(p==q);  (interning) true not because they have same value
    // but because they both are pointing to same string in memeory

    String n = "abcdef";
    String m = "def";
    System.out.println(n==m); // false normally
    String t = "abc"+m;
    System.out.println(t);
    System.out.println(n == t); // n amd t have the same vallue but still getting false (interning reason) t is the new string 

    //main thing == compares the address of a memory it gives true because of interning 

    System.out.println(n.equals(t)); // return true as it comapres the value not the location

  }

}
