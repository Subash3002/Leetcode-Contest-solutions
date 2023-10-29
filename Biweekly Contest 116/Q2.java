https://leetcode.com/contest/biweekly-contest-116/problems/minimum-number-of-changes-to-make-binary-string-beautiful/
2914. Minimum Number of Changes to Make Binary String Beautiful

class Solution {
    public int minChanges(String s) {
        int ans=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                ans++;
            }
        }
        return ans;
    }
}