https://leetcode.com/contest/weekly-contest-367/problems/shortest-and-lexicographically-smallest-beautiful-string/
2904. Shortest and Lexicographically Smallest Beautiful String

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int count=0;
                String a=s.substring(i,j+1);
                for(int z=0;z<a.length();z++){
                    if(a.charAt(z)=='1'){
                        count++;
                    }
                }
                if(count==k){
                    if(ans.equals("")){
                        ans=a;
                    }else{
                        if(a.length()<ans.length()){
                            ans=a;
                        }else if(a.length()==ans.length()){
                            for(int x=0;x<ans.length();x++){
                                if(ans.charAt(x)<a.charAt(x)){
                                    break;
                                }else if(ans.charAt(x)>a.charAt(x)){
                                    ans=a;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}