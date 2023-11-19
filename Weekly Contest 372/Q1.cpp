https://leetcode.com/contest/weekly-contest-372/problems/make-three-strings-equal/
2937. Make Three Strings Equal

class Solution {
public:
    int findMinimumOperations(string s1, string s2, string s3) {
        int m1=s1.length();
        int m2=s2.length();
        int m3=s3.length();
        int c=0;
        
        for(int i=0;i<m1 && i<m2 && i<m3;i++){
            if(s1[i]==s2[i] && s2[i]==s3[i]){
                c++;
            }else{
                break;
            }
        }
        int ans=(m1+m2+m3)-3*c;
        return (c<1)?-1:ans;
    }
};