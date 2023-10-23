https://leetcode.com/contest/weekly-contest-368/problems/minimum-number-of-groups-to-create-a-valid-assignment/
2910. Minimum Number of Groups to Create a Valid Assignment

class Solution {
public:
    unordered_map<int,int> factors;
    void countFactor(int val){
        factors[1]++;
        for(int i=2;i<=val+1;i++){
            int s=val/(i-1);
            int r=val%(i-1);
            if(r<=s){
                factors[i]++;
            }
        }
    }
    int minGroupsForValidAssignment(vector<int>& nums) {
        int grps=0;
        unordered_map<int,int> hm;
        for(int i:nums){
            hm[i]++;
        }
        
        for(auto i:hm){
            countFactor(i.second);
        }
        int x=INT_MIN;
        for(auto i:factors){
            if(i.second==hm.size()){
                x=max(x,i.first);
            }
        }
        
        for(auto i:hm){
            int val=i.second;
            grps+=ceil((double)val/x);
        }
        return grps;
        
    }
    
};