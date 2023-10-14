https://leetcode.com/contest/biweekly-contest-115/problems/longest-unequal-adjacent-groups-subsequence-i/
2900. Longest Unequal Adjacent Groups Subsequence I

class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> ans=new ArrayList<>();
        ans.add(words[0]);
        int v=groups[0];
        for(int i=0;i<groups.length;i++){
            if(v!=groups[i]){
                ans.add(words[i]);
                v=groups[i];
            }
        }
        return ans;
    }
}