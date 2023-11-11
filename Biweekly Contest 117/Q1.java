https://leetcode.com/contest/biweekly-contest-117/problems/distribute-candies-among-children-i/
2928. Distribute Candies Among Children I

class Solution {
    public int distributeCandies(int n, int limit) {
        int res=0;
        int itr=Math.min(n,limit);
        for(int i=0;i<=itr;i++){
            int rem=n-i;
            if(rem<=limit){
                res+=rem+1;
            }else{
                int f=rem-limit;
                if(f<=limit){
                    res+=(limit-f)+1;
                }
            }
            //System.out.println(res);
            
        }
        return res;
    }
}