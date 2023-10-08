https://leetcode.com/contest/weekly-contest-366/problems/divisible-and-non-divisible-sums-difference/
2894. Divisible and Non-divisible Sums Difference

class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0;
        int sum2=0;
        
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sum2+=i;
            }else{
                sum1+=i;
            }
        }
        
        return sum1-sum2;
    }
}