https://leetcode.com/contest/weekly-contest-386/problems/split-the-array/
3046. Split the Array

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq=new int[101];
        for(int i:nums){
            freq[i]++;
            if(freq[i]>2)return false;
        }
        return true;
    }
}