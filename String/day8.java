package String;

import java.util.Scanner;

public class day8 {
  
  static void VowelCounter(String s){

    int count = 0;

    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'a'|| s.charAt(i) ==  'e'|| s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u') count++;
    }

    System.out.println("Vovels: "+count);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    VowelCounter(s);

    sc.close();
  }

}
