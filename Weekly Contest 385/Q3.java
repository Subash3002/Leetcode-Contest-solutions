3044. Most Frequent Prime

class Solution {
    static HashMap<Integer,Integer> hm;
    void north(int i,int j,int[][] mat){
        int val=0;
        while(i>=0){
            val=(val*10)+mat[i][j];
            if(val>9){
                checkPrime(val);
            }
            i--;
        }
    }
    void south(int i,int j,int[][] mat){
        int val=0;
        while(i<mat.length){
            val=(val*10)+mat[i][j];
            if(val>9){
                checkPrime(val);
            }
            i++;
        }
    }
    void east(int i,int j,int[][] mat){
        int val=0;
        while(j<mat[0].length){
            val=(val*10)+mat[i][j];
            if(val>9){
                checkPrime(val);
            }
            j++;
        }
    }
    void west(int i,int j,int[][] mat){
        int val=0;
        while(j>=0){
            val=(val*10)+mat[i][j];
            if(val>9){
                checkPrime(val);
            }
            j--;
        }
    }
    void northeast(int i,int j,int[][] mat){
        int val=0;
        while(i>=0 && j<mat[0].length){
            val=(val*10)+mat[i][j];
            if(val>9){
                checkPrime(val);
            }
            i--;
            j++;
        }
    }
    void northwest(int i,int j,int[][] mat){
        int val=0;
        while(i>=0 && j>=0){
            val=(val*10)+mat[i][j];
            if(val>9){
                checkPrime(val);
            }
            i--;
            j--;
        }
    }
    void southeast(int i,int j,int[][] mat){
        int val=0;
        while(i<mat.length && j<mat[0].length){
            val=(val*10)+mat[i][j];
            if(val>9){
                checkPrime(val);
            }
            i++;
            j++;
        }
    }
    void southwest(int i,int j,int[][] mat){
        int val=0;
        while(i<mat.length && j>=0){
            val=(val*10)+mat[i][j];
            if(val>9){
                checkPrime(val);
            }
            i++;
            j--;
        }
    }
    
    void checkPrime(int num){
        if(num==1)return;
        
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return;
            }
        }
        
        hm.put(num,hm.getOrDefault(num,0)+1);
        
    }
    
    public int mostFrequentPrime(int[][] mat) {
        hm=new HashMap<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                north(i,j,mat);
                south(i,j,mat);
                east(i,j,mat);
                west(i,j,mat);
                northeast(i,j,mat);
                northwest(i,j,mat);
                southeast(i,j,mat);
                southwest(i,j,mat);
            }
        }
        int maxFreq=0;
        int maxVal=0;
        for(int k:hm.keySet()){
            int val=hm.get(k);
            if(val>maxFreq){
                maxFreq=val;
                maxVal=k;
            }else if(val==maxFreq){
                maxVal=Math.max(maxVal,k);
            }
        }
        
        return maxVal==0?-1:maxVal;
    }
}