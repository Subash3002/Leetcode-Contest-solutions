https://leetcode.com/contest/weekly-contest-369/problems/minimum-equal-sum-of-two-arrays-after-replacing-zeros/
2918. Minimum Equal Sum of Two Arrays After Replacing Zeros

class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0;
        long sum2=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0)cnt1++;
            sum1+=nums1[i];
        }
        long max1=sum1+cnt1;
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==0)cnt2++;
            sum2+=nums2[i];
        }
        long max2=sum2+cnt2;
        if(max2>max1){
            if(cnt1>0)return max2;
        }else if(max2<max1){
            if(cnt2>0 )return max1;
        }else{
            return max1;
        }
        return -1;
        
    }
}