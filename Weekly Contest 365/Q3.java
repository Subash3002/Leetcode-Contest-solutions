https://leetcode.com/contest/weekly-contest-365/problems/minimum-size-subarray-in-infinite-array/
2875. Minimum Size Subarray in Infinite Array

class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        
        long sum=0;
        
        for(int i:nums){
            sum+=i;
        }
        
        long itr=target/sum;
        long len=itr*nums.length;
        
        int[] nums2=new int[nums.length*2];
        
        for(int i=0;i<nums2.length;i++){
            nums2[i]=nums[i%nums.length];
        }
        if(target%sum==0){
            return (int)len;
        }
        int l=0;
        int r=0;
        long rSum=target%sum;
        long cur=0;
        int length=Integer.MAX_VALUE;
        while(r<nums2.length && l<=r){
            if(cur<rSum){
                cur+=nums2[r++];
            }else if(cur==rSum){
                length=Math.min(r-l,length);
                cur-=nums2[l++];
               
            }else{
                cur-=nums2[l++];
                
            }
        }
        if(length>nums2.length){
            return -1;
        }else{
            return (int)(len+length);
        }
        
    }
}