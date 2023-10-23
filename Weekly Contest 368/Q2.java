https://leetcode.com/contest/weekly-contest-368/problems/minimum-sum-of-mountain-triplets-ii/
2909. Minimum Sum of Mountain Triplets II

class Solution {
    public int minimumSum(int[] nums) {
        int n=nums.length;
        int[] pref=new int[n];
        int[] suff=new int[n];
        pref[0]=nums[0];
        suff[n-1]=nums[n-1];
        int sum=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            pref[i]=Math.min(pref[i-1],nums[i]);
        }
        
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.min(suff[i+1],nums[i]);
        }
        
        for(int i=1;i<nums.length-1;i++){
            int pre=pref[i-1];
            int next=suff[i+1];
            
            if(pre<nums[i] && nums[i]>next){
                int s=pre+nums[i]+next;
                sum=Math.min(s,sum);
            }
        }
        return (sum==Integer.MAX_VALUE)?-1:sum;
    }
}