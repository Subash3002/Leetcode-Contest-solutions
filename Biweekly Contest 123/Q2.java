https://leetcode.com/contest/biweekly-contest-123/problems/find-the-number-of-ways-to-place-people-i/
3025. Find the Number of Ways to Place People I

class Solution {
    public int numberOfPairs(int[][] points) {
        
        int cnt=0;
        int n=points.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)continue;
                
                int x1=points[i][0];
                int x2=points[j][0];
                int y1=points[i][1];
                int y2=points[j][1];
                
                if(x1<x2 || y1>y2)continue;
                boolean flag=true;
                for(int k=0;k<n;k++){
                    if(k==i || k==j)continue;
                    
                    int x3=points[k][0];
                    int y3=points[k][1];
                    
                    if(x3<=x1 && x3>=x2 && y3>=y1 && y3<=y2){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    cnt++;
                    System.out.println(i+" "+j);
                }
                
            }
        }
        
        return cnt;
    }
}