2944. Minimum Number of Coins for Fruits
https://leetcode.com/contest/biweekly-contest-118/problems/minimum-number-of-coins-for-fruits/

class Solution {
    public int minimumCoins(int[] prices) {
        int n=prices.length;
        int dp[]=new int[n];
        Arrays.fill(dp,(int)1e9);
        
        for(int i=n-1;i>=0;i--){
            int count=i+1+1;
            if(i+count>=n)dp[i]=prices[i];
            for(int j=i+1;j<=Math.min(n-1,i+count);j++){
                dp[i]=Math.min(dp[i],dp[j]+prices[i]);
            }
        }
        return dp[0];
    }
}