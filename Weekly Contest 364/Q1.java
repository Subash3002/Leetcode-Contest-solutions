https://leetcode.com/contest/weekly-contest-364/problems/maximum-odd-binary-number/
2864. Maximum Odd Binary Number


class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        

        for(int i=0;i<count-1;i++){
            ans+="1";
        }
        for(int i=0;i<s.length()-count;i++){
            ans+="0";
        }
        ans+="1";
        
        
        return ans;
    }
}