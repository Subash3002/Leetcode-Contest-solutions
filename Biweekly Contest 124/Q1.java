https://leetcode.com/contest/biweekly-contest-124/


3038. Maximum Number of Operations With the Same Score I

class Solution {
    public int maxOperations(int[] nums) {
        int cnt=1;
        int sum=nums[0]+nums[1];
        for(int i=2;i<nums.length;i+=2){
            if(i+1==nums.length)break;
            if(nums[i]+nums[i+1]==sum)cnt++;
            else break;
        }
        return cnt;
    }
}