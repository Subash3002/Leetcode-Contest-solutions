2946. Matrix Similarity After Cyclic Shifts
https://leetcode.com/contest/weekly-contest-373/problems/matrix-similarity-after-cyclic-shifts/

class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] mat2=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat2[i][j]=mat[i][j];
            }
            
        }
        for(int z=0;z<k;z++){
            for(int i=0;i<mat.length;i++){
                int temp=mat[i][0];

                for(int j=1;j<mat[i].length;j++){
                    if(i%2==0){
                        mat[i][j-1]=mat[i][j];
                    }
                }
                if(i%2==0){
                    mat[i][mat[i].length-1]=temp;
                }
                int temp2=mat[i][mat[i].length-1];
                for(int j=mat[i].length-2;j>=0;j--){
                    if(i%2!=0){
                        mat[i][j+1]=mat[i][j];
                    }
                }
                if(i%2!=0){
                    mat[i][0]=temp2;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                // System.out.print(mat[i][j]+" ");
                // System.out.print(mat2[i][j]+" ");
                if(mat[i][j]!=mat2[i][j]){
                    return false;
                }
            }
            //System.out.println();
        }
        
        return true;
        
    }
}