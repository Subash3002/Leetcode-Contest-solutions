https://leetcode.com/contest/biweekly-contest-115/problems/last-visited-integers/
2899. Last Visited Integers

class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> nums=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int count=0;
        for(int i=0;i<words.size();i++){
            if(words.get(i).equals("prev")){
                if(count>=nums.size()){
                    ans.add(-1);
                }else{
                    
                    ans.add(Integer.valueOf(nums.get(nums.size()-count-1)));
                }
                count++;
            }else{
                count=0;
                nums.add(Integer.valueOf(words.get(i)));
            }
            
        }
        return ans;
        
    }
}