https://leetcode.com/contest/weekly-contest-384/problems/maximum-palindromes-after-operations/
3035. Maximum Palindromes After Operations

class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        int n=words.length;
        int[] freq=new int[26];
        int[] len=new int[n];
        for(int i=0;i<n;i++){
            len[i]=words[i].length();
            for(int j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);
                freq[c-'a']++;
            }
        }
        
        int ones=0;
        int twos=0;
        
        for(int i:freq){
            if(i%2==0){
                twos+=i/2;
            }else{
                twos+=i/2;
                ones++;
            }
        }
        Arrays.sort(len);
        //System.out.println(Arrays.toString(len));
        int cnt=0;
        
        for(int i=0;i<n;i++){
            int siz=len[i];
            if(siz%2==0){
                if(siz/2<=twos){
                    cnt++;
                    twos-=siz/2;
                }else{
                    break;
                }
            }else{
                if(ones>0 && siz/2<=twos){
                    cnt++;
                    ones--;
                    twos-=siz/2;
                }else if((siz+1)/2<=twos){
                    cnt++;
                    ones++;
                    twos-=(siz+1)/2;
                }else{
                    break;
                }
            }
            //System.out.println(ones+" "+twos);
        }
        
        return cnt;
        
    }
}