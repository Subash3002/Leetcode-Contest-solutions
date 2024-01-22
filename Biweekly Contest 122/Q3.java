3012. Minimize Length of Array Using Operations
https://leetcode.com/contest/biweekly-contest-122/problems/minimize-length-of-array-using-operations/

class Solution {
    public int minimumArrayLength(int[] nums) {
        int minn=nums[0];
        for(int i:nums)minn=Math.min(minn,i);
        int cnt=0;
        int f=0;
        for(int i:nums){
            if(i==minn){
                cnt++;
            }
            //check whether any smaller number than minn can be obtained
            if(i%minn!=0){
                f=1;
                break;
            }
        }
        
        if(cnt==1 || f==1)return 1;
        return (cnt+1)/2;
        
    }
}