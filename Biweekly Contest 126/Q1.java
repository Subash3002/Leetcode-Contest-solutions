3079. Find the Sum of Encrypted Integers

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int num:nums){
            String s=""+num;
            int maxx=0;
            for(int i=0;i<s.length();i++){
                int d=s.charAt(i)-'0';
                maxx=Math.max(maxx,d);
            }
            //System.out.println(maxx);
            int cur=0;
            for(int j=0;j<s.length();j++){
                cur=(cur*10)+maxx;
            }
            sum+=cur;
            
        }
        return sum;
    }
}