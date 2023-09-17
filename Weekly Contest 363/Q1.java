https://leetcode.com/contest/weekly-contest-363/problems/sum-of-values-at-indices-with-k-set-bits/
2859. Sum of Values at Indices With K Set Bits

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int sum=0;
        
        for(int i=0;i<nums.size();i++){
            if(setBits(i)==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
    
    int setBits(int num){
        int count=0;
        
        while(num>0){
            count+=(num&1);
            num=(num>>1);
        }
        return count;
    }
}