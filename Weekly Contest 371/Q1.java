https://leetcode.com/contest/weekly-contest-371/problems/maximum-strong-pair-xor-i/
2932. Maximum Strong Pair XOR I

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int min=Math.min(nums[i],nums[j]);
                int diff=Math.abs(nums[i]-nums[j]);
                if(diff<=min){
                    ans=Math.max(ans,nums[i]^nums[j]);
                }
            }
        }
        return ans;
    }
}