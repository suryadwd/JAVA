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


// class Main {
// 	public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5};
//         int i = arr.length - 1, j = 0;
// 		rev(arr, j, i);
//         System.out.println();
//         for(int x : arr)System.out.print(x +" ");
//         System.out.println();
// 	}
// 	public static void rev(int arr[], int j, int i) {
// 		if(j >= i) return;
//         swaps(arr, j, i);
//         rev(arr, j+1, i-1);
// 	}
//     public static void swaps(int arr[], int j, int i){
//         int temp = arr[j];
//         arr[j] = arr[i];
//         arr[i] = temp;
//     }
// }

// class Main {
// 	public static void main(String[] args) {
//         String s = "12321u";
//         char arr[] = s.toCharArray();
// 		System.out.println(checkPalindrome(arr, 0, arr.length - 1));
// 	}
// 	public static boolean checkPalindrome(char arr[], int i, int j) {
//         if( i >= j ) return true;
//         if( arr[i] != arr[j] ) return false;
//         return checkPalindrome(arr, i+1, j-1);
// 	}
// }


// class Main{
//         public static void main(String[] args) {
//                 int arr[] = {66,322,-5,10,35,97,18,4,7};
//                 mergeSort(arr,0,arr.length - 1);
//                 for(int x : arr) System.out.print(x+" ");
//                 System.out.println();
//         }

//         public static void mergeSort(int arr[], int start, int end){
//                 int mid = (start + end) / 2;
//                 if(start >= end) return;
//                 mergeSort(arr,start,mid);  // left divide
//                 mergeSort(arr,mid+1, end); // right divide

//                 merge(arr,start,end,mid);  // combining each block of arr i.e. elements
//         }
        
//         public static void merge(int arr[], int start, int end, int mid){
//                 int temp[] = new int[end - start + 1];
//                 int left = start, right = mid + 1, idx = 0;

//         while (left <= mid && right <= end) {
//                 if(arr[left] <= arr[right]){
//                         temp[idx++] = arr[left++];
//                 }else {
//                         temp[idx++] = arr[right++];
//                 }
//         }

//         while(left <= mid){
//                 temp[idx++] = arr[left++];
//         }

//         while(right <= end){
//                 temp[idx++] = arr[right++];
//         }
//         // adding each element to ansew

//         idx = 0;
//         while (start <= end) {
//                arr[start++] = temp[idx++];
//        }
//         }
// }


// class Main{
//         public static void main(String[] args) {
//                 int arr[] = {10,4,2,65,34,7};
//                 quickSort(arr, 0, arr.length - 1);
//                 for(int x: arr) System.out.print(x+" ");
//         }
//         public void quickSort(int []arr, int start, int end){
//                 if(start >= end) return;
//                 int s = start;
//                 int e = end;
//                 int mid = s + (e - s)/2;
//                 int pivot = arr[mid];
//                 while (s <= e) {
//                         while (arr[s] < pivot) {
//                                 s++;
//                         }
//                         while (arr[s] > pivot) {
//                                 e++;
//                         }
//                 }
//         }
// }

// SKIP A CHARACTER

// class Main{
//         public static void main(String[] args) {
//                 String s = "anujdwdhumai";
//                 helper(s);
//         }
//         public static void helper(String s) {
//                 char[] c = s.toCharArray();
//                 StringBuilder ans = new StringBuilder();
//                 System.out.println(aremove(c, 0, ans));
//         }

//         public static StringBuilder aremove(char[] s, int i, StringBuilder ans){
//                 if( i == s.length) return ans;
//                 if(s[i] != 'a') ans.append(s[i]);
//                 return aremove(s, i+1, ans);
//         }
// }


        // SKIP A STRING

// class Main{
//         public static void main(String[] args) {
//                 String s = "AnujDwivediKaBhaiHuMai";
//                 System.out.println(SkipString(s,0));
//         }
//         static String SkipString(String s, int i){
//               if(i >= s.length())   return "";
//               if(i+7 <= s.length() && s.startsWith("Dwivedi",i)){
//                 return SkipString(s, i+7);
//               }else return s.charAt(i) + SkipString(s, i+1);

//         }
// }


        // GET ALL SUBSEQUENCE 

// class Main {
//          public static void main(String[] args) {
//                 String str = "abc";
//                 substr("", str);
//          }
//          static void substr(String p, String up){
//                 if(up.isEmpty()){
//                         System.out.println(p);
//                         return;
//                 }
//                 char c = up.charAt(0);
//                 substr(p + c, up.substring(1)); // add
//                 substr(p , up.substring(1));
//          }
// }

// class Main{
//         public static void main(String[] args) {
//                 char c = 'a';
//                 System.out.println(c+0);
//         }
// }

// PW

class Main{
        public static void main(String[] args) {
                // print1toN(5);
                // System.out.println();
                // printNto1(5);
                // System.out.println();
                // System.out.println( sum1toN(5));
                // System.out.println(power(3, 2));
                // System.out.println(powerRec(3, 2));
                // System.out.println(NthFib(3));
                // System.out.println(removeA("","anujaja"));
                // System.out.println(removeApple("","anujappleChor"));
                // subSequencePattern("","xyz");
                // sequence("","xyz");
                System.out.println(stairPath(5));
        }
        static void print1toN(int n){
                if(n <= 0) return;
                print1toN(n-1);
                System.out.print(n+" ");
        }
        static void printNto1(int n){
                if(n <= 0) return;
                System.out.print(n+" ");
                print1toN(n-1);
        }     
        static int sum1toNPara(int n, int ans){
                if(n <= 0) return ans;
                return sum1toNPara(n-1, ans + n);
        }
        static int sum1toN(int n){
                if(n == 1) return 1;
                //sum(n) = n + n-1 + n-2 + . . . + 3 + 2 + 1
                //sum(n) = n + sum(n-1)
                //sum(n-1) = n-1 + n-2 + n-3 + . . . 2 + 1
                //sum(n-1) = n-1 + sum(n-2);
                return n + sum1toN(n-1);
        }
        static int power(int a, int b){
                int ans = 1;
                for(int i = 0; i < b; i++){
                        ans  = ans * a;
                }
                return ans;
        }
        static int powerRec(int a, int b){
                if(b == 0) return 1;
                if (b == 1) return a;
                return a * power(a, b-1);
        }
        static int NthFib(int n){
                if(n == 1 || n == 0) return n;
                return NthFib(n-1) + NthFib(n-2);
        }
        static String removeA(String p, String up){
                if(up.isEmpty()) return p;
                char c = up.charAt(0);
                if(c != 'a') return removeA(p+c, up.substring(1));
                return removeA(p, up.substring(1));
        }
        static String removeApple(String p, String up){
                if(up.isEmpty()) return p;
                char ch = up.charAt(0);
                if(up.startsWith("apple")) return removeApple(p, up.substring(5));
                return removeApple(p+ch, up.substring(1));
        }     
        static void subSequencePattern(String p, String up){
                if(up.isEmpty()){ 
                        System.out.println(p);
                        return;
                }
                char ch = up.charAt(0);
                subSequencePattern(p+ch, up.substring(1));
                subSequencePattern(p, up.substring(1));
        }
        static void sequence(String p, String up){
                if(up.isEmpty()){
                        System.out.println(p);
                        return;
                }
                char c = up.charAt(0);
                sequence(p+c, up.substring(1));
                sequence(p, up.substring(1));
        }

        static int stairPath(int n){
                 if(n <= 2) return n;
                 return stairPath(n-1) + stairPath(n-2);
        }

}
