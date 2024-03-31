class Solution {
    public int minimumLevels(int[] possible) {
        int n=possible.length;
        int[] sc=new int[n];
        int scr=0;
        for(int i=0;i<n;i++){
            int cur=(possible[i]==0)?-1:1;
            sc[i]=scr+cur;
            scr=sc[i];
        }
        
        int ans=-1;
        
        for(int i=0;i<n-1;i++){
            if(sc[i]>(sc[n-1]-sc[i]))return i+1;
        }
        return ans;
    }
}