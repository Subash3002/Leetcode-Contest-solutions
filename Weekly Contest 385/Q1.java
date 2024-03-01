https://leetcode.com/contest/weekly-contest-385/problems/count-prefix-and-suffix-pairs-i/
3042. Count Prefix and Suffix Pairs I

class Solution {
    boolean check(String str1,String str2){
        int n=str2.length();
        int len=str1.length();
        if(len>n)return false;
        // System.out.println(str2.substring(0,len+1));
        // System.out.println(str2.substring(n-len));
        if(str2.substring(0,len).equals(str1) && str2.substring(n-len).equals(str1))return true;
        
        return false;
        
    }
    public int countPrefixSuffixPairs(String[] words) {
        int cnt=0;
        int n=words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(check(words[i],words[j]))cnt++;
            }
        }
        return cnt;
    }
}