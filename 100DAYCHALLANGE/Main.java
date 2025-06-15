// LeetCode 121: Best Time to Buy and Sell Stock
// Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Main {

    static int memLocation(int[] arr, int base, int pos) {
        int loc = ((base + pos+1)* 4);
        return loc;
    }


    public static void main(String[] args) {
        
        int[] arr = {7, 1, 5, 3, 6, 4};
        int base = 100;
        int pos = 2;
        System.out.println(memLocation(arr, base, pos)); 

    }
}

