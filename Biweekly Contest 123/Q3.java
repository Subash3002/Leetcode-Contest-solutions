https://leetcode.com/contest/biweekly-contest-123/problems/maximum-good-subarray-sum/
3026. Maximum Good Subarray Sum

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Long,Long> hm=new HashMap<>();
        
        long[] preSum=new long[n+1];
        
        for(int i=1;i<=n;i++){
            preSum[i]=preSum[i-1]+nums[i-1];
        }
        long ans=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(hm.containsKey(1L*nums[i]-k)){
                //int ind=hm.get(1L*nums[i]-k);
                
                ans=Math.max(ans,preSum[i+1]-hm.get(1L*nums[i]-k));
                
                
            }
            if(hm.containsKey(1L*nums[i]+k)){
                //int ind=hm.get(1L*nums[i]+k);
                
                ans=Math.max(ans,preSum[i+1]-hm.get(1L*nums[i]+k));
            
                
            }
            
            if(hm.containsKey(1L*nums[i])){
                long val=hm.get(1L*nums[i]);
                //System.out.println(val+" "+preSum[i+1]);
                
                hm.put(1L*nums[i],Math.min(val,preSum[i]));
    
            }else{
                hm.put(1L*nums[i],preSum[i]);
            }
        }
        
        
        return (ans==Long.MIN_VALUE)?0:ans;
    }
}