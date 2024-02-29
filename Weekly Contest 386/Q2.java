3047. Find the Largest Area of Square Inside Two Rectangles


class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long ans=0;
        
        for(int i=0;i<bottomLeft.length;i++){
            for(int j=i+1;j<bottomLeft.length;j++){
                int[] left1=bottomLeft[i];
                int[] left2=bottomLeft[j];
                int[] top1=topRight[i];
                int[] top2=topRight[j];
                
                long a=Math.max(left1[0],left2[0]);
                long b=Math.min(top1[0],top2[0]);
                long c=Math.max(left1[1],left2[1]);
                long d=Math.min(top1[1],top2[1]);
                
                if(a<b && c<d){
                    ans=Math.max(ans,Math.min(d-c,b-a));
                }
            }
        }
        
        return ans*ans;
    }
}