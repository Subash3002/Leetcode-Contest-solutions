https://leetcode.com/contest/weekly-contest-366/problems/apply-operations-on-array-to-maximize-sum-of-squares/
2897. Apply Operations on Array to Maximize Sum of Squares

class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long mod=1000000007;
        int[] ans=new int[k];
        long res=0;
        for(int i=0;i<30;i++){
            int cnt=0;
            for(int j=0;j<nums.size();j++){
                if((nums.get(j)&(1<<i))!=0){
                    cnt++;
                }
            }
            //System.out.println(cnt);
            if(cnt>k)cnt=k;
            for(int j=0;j<cnt;j++){
                ans[j]=ans[j] | (1<<i);
            }
        }
        
        for(int a:ans){
            //System.out.println(a);
            res=(res+(1L*a*a)%mod)%mod;
        }
        return (int)res;
    }
}