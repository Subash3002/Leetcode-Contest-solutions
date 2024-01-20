3010. Divide an Array Into Subarrays With Minimum Cost I
https://leetcode.com/contest/biweekly-contest-122/problems/divide-an-array-into-subarrays-with-minimum-cost-i/

class Solution {
public:
    int minimumCost(vector<int>& nums) {
        int minn1=nums[0];
        sort(nums.begin()+1,nums.end());
        return minn1+nums[1]+nums[2];
    }
};