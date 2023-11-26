2943. Maximize Area of Square Hole in Grid
https://leetcode.com/contest/biweekly-contest-118/problems/maximize-area-of-square-hole-in-grid/

class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int hmax=1;
        int hcur=1;
        for(int i=1;i<hBars.length;i++){
            if(hBars[i]-hBars[i-1]==1){
                hcur++;
            }else{
                hmax=Math.max(hmax,hcur);
                hcur=1;
            }
        }
        hmax=Math.max(hmax,hcur);
        int vmax=1;
        int vcur=1;
        System.out.println(Arrays.toString(vBars));
        for(int i=1;i<vBars.length;i++){
            if(vBars[i]-vBars[i-1]==1){
                vcur++;
            }else{
                vmax=Math.max(vmax,vcur);
                vcur=1;
            }
        }
        vmax=Math.max(vmax,vcur);
        System.out.println(hmax);
        System.out.println(vmax);
        int l=Math.min(hmax,vmax);
        return (l+1)*(l+1);
        
    }
}