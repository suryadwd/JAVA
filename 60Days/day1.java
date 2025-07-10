881. Boats to Save People

import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int cnt = 0;
        while( i <= j){
            cnt++;
            if(people[i] + people[j] <= limit){
                i++;
                j--;
            }else{
                j--;
            }
        }
        return cnt;
    }
}


1833. Maximum Ice Cream Bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0, j = costs.length - 1;
        int cnt = 0;
        while(i <= j){
            if(costs[i] <= coins){
                cnt ++;
                coins = coins -  costs[i];
            }
            i++;
        }
        return cnt;
    }
}

991. Broken Calculator

class Solution {
    public int brokenCalc(int startValue, int target) {
//isko reverse kr do to - -> + * -> / ho jayega  hm log target ko startvalur ke pas le jayege aur      try krege krne ka
        int cnt  = 0;
        while(target > startValue){
            cnt++;
            if(target % 2 == 0)target = target / 2;
            else target = target + 1;
        }
        return cnt + (startValue - target);
    }
}

