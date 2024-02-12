https://leetcode.com/contest/weekly-contest-383/problems/ant-on-the-boundary/
3028. Ant on the Boundary

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int cnt=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            if(sum==0)cnt++;
        }
        return cnt;
    }
}