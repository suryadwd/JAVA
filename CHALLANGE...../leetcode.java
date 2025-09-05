// // leetcode 1672

// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int maxi = 0;
//         for(int i = 0; i < accounts.length; i++){
//             int ans = 0;
//             for(int j = 0; j < accounts[0].length; j++){
//                 ans += accounts[i][j];
//             }
//             maxi = Math.max(maxi,ans);
//         }
//         return maxi;
//     }
// }

// // gfg ciel 
// class Solution {
//     public int findCeil(int[] arr, int x) {
//         return BinarySearch(arr, x);
//     }
    
//     static int BinarySearch(int []arr, int x){
//         int low = 0, high = arr.length-1;
//         int ans = -1;
//         while(low <= high){
//             int mid = low + (high - low)/2;
//             if(x > arr[mid]) low = mid + 1;
//             else{
//                 ans = mid; 
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }
// }

// // ghg floor 
// class Solution {
//     public int findFloor(int[] arr, int x) {
//         return BinarySearchFloor(arr, x);
//     }
//     static int BinarySearchFloor(int [] arr, int x){
//         int low = 0, high = arr.length - 1, ans = -1;
//         while(low <= high){
//             int mid = low + (high - low)/2;
//             if(x < arr[mid]) high = mid- 1;
//             else {
//                 ans = mid;
//                 low = mid +  1;
//             }
//         }
//         return ans;
//     }
// }

class leetcode{
    public static void main(String[] args) {
        char c = 'a';
        System.out.println((int)c);
    }

}

class Solution {

    public int[] searchRange(int[] nums, int target) {
        int firstCheck = binarySearchFirstOcc(nums, target);
        int lastCheck = binarySearchLastOcc(nums, target);
        return new int[] {firstCheck, lastCheck};
    }

    int binarySearchFirstOcc(int[] nums, int target){
            int low = 0, high = nums.length - 1, ans = -1;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] == target){
                    ans =  mid;
                    high = mid - 1;
                }
            else if(nums[mid] > target)high = mid - 1;
            else low = mid + 1;
            }
            return ans;
    }

    int binarySearchLastOcc(int[] nums, int target){
            int low = 0, high = nums.length - 1, ans = -1;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] == target){
                    ans =  mid;
                    low = mid + 1;
                }
            else if(nums[mid] > target)high = mid - 1;
            else low = mid + 1;
            }
            return ans;
        }
}