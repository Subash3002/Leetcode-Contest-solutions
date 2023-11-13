https://leetcode.com/contest/biweekly-contest-117/problems/maximum-spending-after-buying-items/
2931. Maximum Spending After Buying Items

class Solution {
public:
    long long maxSpending(vector<vector<int>>& values) {
        long long ans=0;
        int n=values.size();
        int m=values[0].size();
        vector<int> arr;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr.emplace_back(values[i][j]);
            }
        }
        
        sort(arr.begin(),arr.end());
        
        for(int i=0;i<arr.size();i++){
            ans+=1ll*(i+1)*arr[i];
        }
        return ans;
        
    }
};