https://leetcode.com/contest/weekly-contest-367/problems/find-indices-with-index-and-value-difference-ii/
2905. Find Indices With Index and Value Difference II

class Solution {
public:
    vector<int> findIndices(vector<int>& nums, int id, int vd) {
        vector<int> ans{-1,-1};
        int n=nums.size();
        set<pair<int,int>> s;
        for(int i=0;i<n;i++){
            int j=i-id;
            if(j>=0){
                s.insert({nums[j],j});
                auto minn=*s.begin();
                auto maxx=*(--s.end());
                if(abs(nums[i]-minn.first)>=vd){
                    ans[0]=minn.second;
                    ans[1]=i;
                    return ans;
                }
                if(abs(nums[i]-maxx.first)>=vd){
                    ans[0]=maxx.second;
                    ans[1]=i;
                    return ans;
                }
                
            }
        }
        return ans;
    }
};