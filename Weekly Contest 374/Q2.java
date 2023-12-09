https://leetcode.com/contest/weekly-contest-374/problems/minimum-number-of-coins-to-be-added/
2952. Minimum Number of Coins to be Added

class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int c=0;
        int mr=0;
        
        for(int coin:coins){
            while(mr<target && mr+1<coin){
                mr+=mr+1;
                c++;
            }
            if(mr>=target)break;
            mr+=coin;
        }
        
        while(mr<target){
            mr+=mr+1;
            c++;
        }
        return c;
    }
}