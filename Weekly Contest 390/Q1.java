3090. Maximum Length Substring With Two Occurrences

class Solution {
    boolean check(String s){
        int[] f=new int[26];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
            if(f[s.charAt(i)-'a']>2)return false;
        }
        return true;
    }
    public int maximumLengthSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(check(sub))max=Math.max(max,sub.length());
            }
        }
        return max;
    }
}