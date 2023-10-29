https://leetcode.com/contest/biweekly-contest-116/problems/length-of-the-longest-subsequence-that-sums-to-target/
2915. Length of the Longest Subsequence That Sums to Target

class Solution {
public:
    int lengthOfLongestSubsequence(vector<int>& nums, int target) {
        int n = nums.size();
        vector<int> dp(target + 1, -1);
        dp[0] = 0;

        for (int num : nums) {
            for (int sum = target; sum >= num; sum--) {
                if (dp[sum - num] != -1) {
                    dp[sum] = max(dp[sum], dp[sum - num] + 1);
                }
            }
        }

        return dp[target];
    }
};