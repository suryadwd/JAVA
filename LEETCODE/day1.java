package LEETCODE;

import java.util.Scanner;

public class day1 {


//   Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false

//   static public boolean isPalindrome(int x) {
        
//       if(x < 0) return false;

//       int temp = x;
//       int reverse = 0;
//       while(temp != 0){
//           int lastDigit =(int) temp % 10;
//           reverse = reverse * 10 + lastDigit;
//           temp = temp / 10;
//       }
//       return (reverse == x);
//   }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter number: ");
//     int num = sc.nextInt();
    
      
//       System.out.println(isPalindrome(num));
      
//     sc.close();
//   }

// }
