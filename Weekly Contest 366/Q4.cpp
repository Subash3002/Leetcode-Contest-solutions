https://leetcode.com/contest/weekly-contest-366/problems/apply-operations-on-array-to-maximize-sum-of-squares/
2897. Apply Operations on Array to Maximize Sum of Squares

class Solution {
public:
    int maxSum(vector<int>& nums, int k) {
        int mod=1e9+7;
        vector<int> vec(k,0);
        int res=0;
        for(int i=0;i<30;i++){
            int cnt=0;
            for(int j=0;j<nums.size();j++){
                if(nums[j]&(1<<i)){
                    cnt++;
                }
            }
            if(cnt>k)cnt=k;
            for(int j=0;j<cnt;j++){
                vec[j]|=(1<<i);
            }
        }

        for(int a:vec){
            res=(res+(1ll*a*a)%mod)%mod;
        }
        return res;
    }
};