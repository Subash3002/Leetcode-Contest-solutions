https://leetcode.com/contest/weekly-contest-383/problems/minimum-time-to-revert-word-to-initial-state-i/
3029. Minimum Time to Revert Word to Initial State I

class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        //int cnt=0;
        //string s=word;
        int cnt=1;
        for(int i=k;i<word.length();i+=k){
            
            String sub=word.substring(i);
            //System.out.println(sub+" "+i);
            if(word.substring(0,word.length()-i).equals(sub))break;
            cnt++;
        }
        
        return cnt;
    }
}