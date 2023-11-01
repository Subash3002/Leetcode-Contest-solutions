https://leetcode.com/contest/weekly-contest-369/problems/find-the-k-or-of-an-array/
2917. Find the K-or of an Array
class Solution {
    public int findKOr(int[] nums, int k) {
        int res=0;
        for(int i=31;i>=0;i--){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j]>>i)&1)!=0){
                    count++;
                }
            }
            if(count>=k){
                res|=1<<i;
            }
        }
        return res;
    }
}