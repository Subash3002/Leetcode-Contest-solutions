https://leetcode.com/contest/weekly-contest-384/problems/number-of-subarrays-that-match-a-pattern-i/
3034. Number of Subarrays That Match a Pattern I

class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n=nums.length;
        int k=pattern.length+1;
        int cnt=0;
        for(int i=0;i<=n-k;i++){
            int ind=0;
            boolean flag=true;
            for(int j=i;j<i+k-1;j++){
                if(pattern[ind]==1){
                    if(nums[j+1]>nums[j]==false){
                        flag=false;
                        break;
                    }
                }else if(pattern[ind]==0){
                    if(nums[j+1]==nums[j]==false){
                        flag=false;
                        break;
                    }
                }else{
                    if(nums[j+1]<nums[j]==false){
                        flag=false;
                        break;
                    }
                }
                ind++;
            }
            if(flag)cnt++;
        }
        
        return cnt;
    }
}