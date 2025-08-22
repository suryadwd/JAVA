// package August;
// import java.util.*;
// public class Main {

//   static int rev = 0;

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     // int a = sc.nextInt();
//     // System.out.println(fibo(a));
//     // // recursion(a);
//     // sc.close();
    
//   }

//   public static int digitSum(int n){
//     if(n == 0) return 0;
//     int digit = n % 10;
//     return digit + digitSum(n/10);
//   }

//   public static int digitMul(int n){
//    if(n == 0) return 1;
//    int digit = n % 10;
//    return digit * digitMul(n/10); 
//   }

//   public static int digitReverse(int n) {
//     if (n == 0) return rev;
//     int digit = n % 10;
//     rev = rev * 10 + digit;
//     return digitReverse(n / 10);
//   }

//   public static boolean checkPalindrome(int n) {
//     int check = n;
//     int rev = 0;
//     while (check != 0) {
//       int digit = check%10;
//       rev = rev * 10 + digit;
//       check = check/10;
//     }
//     return rev == n;
//   }

//   public static int countZero(int n) {
//    int ans = 0;
//    int temp = n;
//    while(temp != 0) {
//     int digit = temp%10;
//     if(digit == 0) ans++;
//     temp /= 10;
//    }
//    return ans;
//   }
 
//   static int ans = 0;

//   public static int recursiveCountZero(int n) {
//     if(n == 0) return ans;
//     int digit = n % 10;
//     if(digit == 0) ans++;
//     return recursiveCountZero(n/10);
//   }

//   public static void recursion(int n){
//     if(n==0) return;
//     System.out.print(n+" ");
//     recursion(n-1);
//   }

//   public static int fibo(int n){
//     if (n < 2) return n;
//     return fibo(n-1) + fibo(n-2);
//   }


// leetcode 7 reverse number

// class Solution {
//     public static int helper(int x, int rev){
//         if(x == 0) return rev;
//         if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) return 0;
//         rev = rev*10 + x % 10;
//         return helper(x/10, rev);
//     }
//     public int reverse(int x) {
//         return helper(x, 0);
//     }
// }

// gfg conunt numer of zero in Array

// (recursion)
// class Solution {
    
//     public int helper(int arr[], int count, int itr){
//         if(itr >= arr.length) return count;
//         if(arr[itr] == 0) count++;
//         return helper(arr, count, itr +1);
//     }
    
//     int countZeroes(int[] arr) {
//         return helper(arr, 0, 0);
//     }
// }

// (iterative)
// int countZeroes(int[] arr) {
//     int start = 0, count = 0;
//     while(start <arr.length){
//         if(arr[start] == 0) count++;
//         start++;
//     }
//     return count;
// }

// leetcode 704  binary search using recursion

// class Solution {
//     public int search(int[] nums, int target) {
//        return rec(nums, target, 0, nums.length - 1);
//     }

//     public static int  rec(int nums[], int target, int left, int right){
//         while(left <= right){
//         int mid = left + (right - left)/2;
//         if(nums[mid] == target) return mid;
//         else if(nums[mid] > target) return rec(nums, target, left, mid - 1);
//         else return rec(nums,target, mid + 1, right);
//         }
//         return -1;
//     }
// }

// leetcode 2089(recursion)
// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         List<Integer> ans = new ArrayList<>();
//         Arrays.sort(nums);
//         return helper(nums, target, ans,  0);
//     }
//     public List<Integer> helper(int nums[], int target, List<Integer> ans, int i){
//         if(i == nums.length ) return ans;
//         if(nums[i] == target) ans.add(i);
//         return helper(nums, target, ans, i + 1);
//     }
// }

// leetcode 2089 (iterative)
// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         List<Integer> ans = new ArrayList<>();
//         Arrays.sort(nums);
//         int idx = 0;
//         for(int i: nums){
//             if(i == target) ans.add(idx);
//             idx++;
//         }
//         return ans;
//     }
// }
// }



// import java.util.*;
// class Main {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		print(n);
// 	}
// 	public static void print(int n) {
// 		if(n == 0) return;
// 		print(n-1);
// 		for(int i = 0; i < n; i++) {
// 			System.out.print("* ");
// 		}
// 		System.out.println();
// 	}
// }


// import java.util.*;
// class Main {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		print(n);
// 	}
// 	public static void print(int n) {
// 		if(n == 0) return;
// 		print(n-1);
// 		for(int i = 0; i < n; i++) {
// 			System.out.print("* ");
// 		}
// 		System.out.println();
// 	}
// }

// class Main {
// 	public static void main(String[] args) {
// 		print(0, 10);
// 	}
// 	public static void print(int i, int n) {
// 		if(i == n) return;
// 		System.out.println(n);
//         print(i, n-1);

		
// 	}
// }


class Main {
	public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int i = arr.length - 1, j = 0;
		rev(arr, j, i);
        System.out.println();
        for(int x : arr)System.out.print(x +" ");
        System.out.println();
	}
	public static void rev(int arr[], int j, int i) {
		if(j >= i) return;
        swaps(arr, j, i);
        rev(arr, j+1, i-1);
	}
    public static void swaps(int arr[], int j, int i){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}