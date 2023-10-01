https://leetcode.com/contest/weekly-contest-365/problems/maximum-value-of-an-ordered-triplet-ii/
2874. Maximum Value of an Ordered Triplet II

class Solution {
    public long maximumTripletValue(int[] nums) {
        int len=nums.length;
        long[] max_left=new long[len];
        long[] max_right=new long[len];
        
        max_left[0]=nums[0];
        
        for(int i=1;i<len;i++){
            max_left[i]=Math.max(max_left[i-1],nums[i]);
        }
        
        max_right[len-1]=nums[len-1];
        
        for(int i=len-2;i>=0;i--){
            max_right[i]=Math.max(max_right[i+1],nums[i]);
        }
        
        long max=0;
        
        for(int i=1;i<len-1;i++){
            long val=(max_left[i-1]-nums[i])*max_right[i+1];
            max=Math.max(max,val);
        }
        
        return max;
    }
}