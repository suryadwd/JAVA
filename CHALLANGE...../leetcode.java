// leetcode 1672

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi = 0;
        for(int i = 0; i < accounts.length; i++){
            int ans = 0;
            for(int j = 0; j < accounts[0].length; j++){
                ans += accounts[i][j];
            }
            maxi = Math.max(maxi,ans);
        }
        return maxi;
    }
}

// gfg ciel 
class Solution {
    public int findCeil(int[] arr, int x) {
        return BinarySearch(arr, x);
    }
    
    static int BinarySearch(int []arr, int x){
        int low = 0, high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(x > arr[mid]) low = mid + 1;
            else{
                ans = mid; 
                high = mid - 1;
            }
        }
        return ans;
    }
}
