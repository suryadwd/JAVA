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