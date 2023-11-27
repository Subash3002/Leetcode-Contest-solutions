2947. Count Beautiful Substrings I
https://leetcode.com/contest/weekly-contest-373/problems/count-beautiful-substrings-i/

class Solution {
    public int beautifulSubstrings(String s, int k) {
        int ans=0;
        
        int[] vow=new int[s.length()];
        int[] con=new int[s.length()];
        int vc=0;
        int cc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vc++;
                
            }else{
                cc++;
                
            }
            vow[i]=vc;
            con[i]=cc;
        }
        
        for(int i=0;i<s.length();i++){
            
            for(int j=i;j<s.length();j++){
                int prod=1;
                int c=0;
                int v=0;
                if(j==0 || i==0){
                    v=vow[j];
                    c=con[j];
                }else{
                    v=(vow[j]-vow[i-1]);
                    c=(con[j]-con[i-1]);
                }
                prod=v*c;
                if(prod%k==0 && v==c){
                    ans++;
                }
            }
        }
        return ans;
    }
}