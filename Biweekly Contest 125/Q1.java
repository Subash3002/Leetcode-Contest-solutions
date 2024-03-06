https://leetcode.com/contest/biweekly-contest-125/problems/minimum-operations-to-exceed-threshold-value-i/
3065. Minimum Operations to Exceed Threshold Value I

class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt=0;
        for(int i:nums){
            if(i<k)cnt++;
        }
        return cnt;
    }
}