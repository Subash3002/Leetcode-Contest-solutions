https://leetcode.com/contest/weekly-contest-365/problems/maximum-value-of-an-ordered-triplet-i/
2873. Maximum Value of an Ordered Triplet I

class Solution {
    public long maximumTripletValue(int[] nums) {
        long max=0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    long val1=(nums[i] - nums[j]);
                    long val2=val1* nums[k];
                    max=Math.max(max,val2);
                }
            }
        }
        
        return max;
    }
}