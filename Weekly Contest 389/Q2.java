3084. Count Substrings Starting and Ending with Given Character

class Solution {
    public long countSubstrings(String s, char c) {
        long ans=0;
        long cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                cnt++;
                ans+=cnt;
            }
        }
        return ans;
    }
}