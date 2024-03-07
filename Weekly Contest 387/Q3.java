3071. Minimum Operations to Write the Letter Y on a Grid

class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
        int[] dig=new int[3];
        int[] dig2=new int[3];
        int n=grid.length;
        
        for(int i=0;i<=n/2;i++){
            int val=grid[i][i];
            //System.out.println(val);
            dig[val]++;
        }
        int j=(n/2);
        for(int i=(n/2)-1;i>=0;i--){
            int val=grid[i][++j];
            //System.out.println(val);
            dig[val]++;
        }
        
        for(int i=(n/2)+1;i<n;i++){
            int val=grid[i][(n/2)];
            //System.out.println(val);
            dig[val]++;
        }
        int tot1=0;
        int tot2=0;
        
        for(int i:dig){
            System.out.println(i);
            tot1+=i;
        }
        int m=grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j1=0;j1<m;j1++){
                if(i==j1 && i<=n/2)continue;
                if(m-j1-1==i && i<=n/2)continue;
                if(j1==n/2 && i>n/2)continue;
                dig2[grid[i][j1]]++;
            }
        }
        for(int i:dig2){
            System.out.println(i);
            tot2+=i;
        }
        System.out.println(tot1+" "+tot2);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            for(int jj=0;jj<3;jj++){
                if(i==jj)continue;
                int sum=(tot2-dig2[i])+(tot1-dig[jj]);
                //System.out.println(i+" "+jj+" "+sum);
                min=Math.min(min,sum);
            }
        }
        return min;
        
        
        
        
    }
}