3076. Shortest Uncommon Substring in an Array

class Solution {
    static class CustomComparator implements Comparator<String>{
        public int compare(String str1,String str2){
            int res=Integer.compare(str1.length(),str2.length());
            if(res==0){
                return str1.compareTo(str2);
            }
            return res;
        }
    }
    public String[] shortestSubstrings(String[] arr) {
        String[] ans=new String[arr.length];
        for(int i=0;i<arr.length;i++)ans[i]="";
        Map<String,HashSet<Integer>> hm=new TreeMap<>(new CustomComparator());
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                for(int k=j;k<arr[i].length();k++){
                    String sub=arr[i].substring(j,k+1);
                    if(hm.containsKey(sub)){
                        HashSet<Integer> h=hm.get(sub);
                        h.add(i);
                        hm.put(sub,h);
                    }else{
                        HashSet<Integer> h=new HashSet<>();
                        h.add(i);
                        hm.put(sub,h);
                    }
                }
            }
        }
        
        for(String k:hm.keySet()){
            if(hm.get(k).size()==1){
                int ind=-1;
                for(int i:hm.get(k)){
                    ind=i;
                }
                if(ans[ind].equals("")){
                    ans[ind]=k;
                }
                
            }
        }
        return ans;
        
    }
}