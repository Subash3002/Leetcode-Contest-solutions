3040. Maximum Number of Operations With the Same Score II

class Solution {
    static int[][] dp;
    int solve(int s,int e,int[] nums,int sum){
        if(s>=e)return 0;
        if(dp[s][e]!=-1)return dp[s][e];
        int ans1=0;
        int ans2=0;
        int ans3=0;
        if(nums[s]+nums[s+1]==sum){
            ans1=solve(s+2,e,nums,sum) +1;
        }
        if(nums[e]+nums[e-1]==sum){
            ans2=solve(s,e-2,nums,sum)+1;
        }
        if(nums[s]+nums[e]==sum){
            ans3=solve(s+1,e-1,nums,sum)+1;
        }
        
        return dp[s][e]=Math.max(Math.max(ans1,ans2),ans3);
    }
    public int maxOperations(int[] nums) {
        int n=nums.length;
        // List<Integer> arr=new ArrayList<>();
        // for(int i:nums)arr.add(i);
        dp=new int[n][n];
        for(int[] row:dp)Arrays.fill(row,-1);
        int s1=solve(0,n-1,nums,nums[0]+nums[1]);
        for(int[] row:dp)Arrays.fill(row,-1);
        int s2=solve(0,n-1,nums,nums[n-2]+nums[n-1]);
        for(int[] row:dp)Arrays.fill(row,-1);
        int s3=solve(0,n-1,nums,nums[0]+nums[n-1]);
        
        return Math.max(Math.max(s1,s2),s3);
    }
}