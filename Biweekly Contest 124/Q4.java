3041. Maximize Consecutive Elements in an Array After Modification

class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int[] dp=new int[1000001];
        int ans=0;
        for(int i:nums){
            dp[i+1]=dp[i]+1;
            dp[i]=dp[i-1]+1;
            ans=Math.max(ans,Math.max(dp[i],dp[i+1]));
        }
        
        return ans;
    }
}