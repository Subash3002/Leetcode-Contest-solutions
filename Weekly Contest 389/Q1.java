3083. Existence of a Substring in a String and Its Reverse

class Solution {
    boolean find(String sub,String s){
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        
        for(int i=0;i<=rev.length()-2;i++){
            if(rev.substring(i,i+2).equals(sub))return true;
        }
        
        return false;
    }
    public boolean isSubstringPresent(String s) {
        for(int i=0;i<=s.length()-2;i++){
            String sub=s.substring(i,i+2);
            if(find(sub,s)){
                return true;
            }
        }
        return false;
    }
}