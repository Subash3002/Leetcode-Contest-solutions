//Link: https://leetcode.com/contest/weekly-contest-362/problems/points-that-intersect-with-cars
//2848. Points That Intersect With Cars
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.size();i++){
            int start=nums.get(i).get(0);
            int end=nums.get(i).get(1);
            for(int j=start;j<=end;j++){
                hs.add(j);
            }
        }
        return hs.size();
    }
}