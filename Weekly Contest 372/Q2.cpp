https://leetcode.com/contest/weekly-contest-372/problems/separate-black-and-white-balls/
2938. Separate Black and White Balls

class Solution {
public:
    long long minimumSteps(string s) {
        
        long long int ans=0;
        int n=s.length();
        int lastfix=n-1;
        for(int i=n-1;i>=0;i--){
            if(s[i]=='1'){
                ans+=lastfix-i;
                lastfix--;
            }
        }
        return ans;
    }
};