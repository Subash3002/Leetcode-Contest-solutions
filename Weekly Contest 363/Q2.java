https://leetcode.com/contest/weekly-contest-363/problems/happy-students/
2860. Happy Students

class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int count=0;
        
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)<(i+1) && (i+1)<nums.get(i+1)){
                count++;
            }
        }
        
        if(nums.size()>nums.get(nums.size()-1)){
            count++;
        }
        
        if(nums.get(0)!=0){
            count++;
        }
        return count;
    }
}