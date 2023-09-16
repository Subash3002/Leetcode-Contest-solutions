https://leetcode.com/contest/biweekly-contest-113/problems/minimum-right-shifts-to-sort-the-array/
8039. Minimum Right Shifts to Sort the Array


class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int count=0;
        int i=0;
        for(i=0;i<nums.size();i++){
            if(nums.get(i)>nums.get((i+1)%nums.size())){
                break;
            }
        }
        
        for(i=i+1;i<nums.size();i++){
            if(nums.get(i)>nums.get((i+1)%nums.size())){
                return -1;
            }
            count++;
        }
        
        return count;
        
    }
}