class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int ans=nums.length+1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int OrSum=0;
                for(int z=i;z<=j;z++)OrSum|=nums[z];
                if(OrSum>=k)ans=Math.min(ans,j-i+1); 
            }
        }
        return (ans==nums.length+1)?-1:ans;
    }
}