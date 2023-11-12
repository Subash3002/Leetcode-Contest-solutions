https://leetcode.com/contest/weekly-contest-371/problems/high-access-employees/
2933. High-Access Employees

class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String> ans=new ArrayList<>();
        HashMap<String,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<access_times.size();i++){
            String emp=access_times.get(i).get(0);
            String time=access_times.get(i).get(1);
            int hr=Integer.valueOf(time.substring(0,2));
            int min=Integer.valueOf(time.substring(2,4));
            int tot=60*hr+min;
            if(hm.containsKey(emp)){
                List<Integer> l=hm.get(emp);
                l.add(tot);
                hm.put(emp,l);
            }else{
                List<Integer> l=new ArrayList<>();
                l.add(tot);
                hm.put(emp,l);
            }
            
        }
        
        for(Map.Entry<String,List<Integer>> me:hm.entrySet()){
            String s=me.getKey();
            //System.out.println(s);
            List<Integer> l=me.getValue();
            //for(int ele:l)System.out.println(ele);
            if(l.size()>=3){
                for(int i=0;i<l.size();i++){
                    int val1=l.get(i);
                    int count=0;
                    for(int j=0;j<l.size();j++){
                        if(i==j)continue;
                        int val2=l.get(j);
                        if(Math.abs(val1-val2)<60 && val1<=val2){
                            count++;
                        }
                    }
                    if(count>=2){
                        ans.add(s);
                        break;
                    }
                }
            }
            
        }
        return ans;
        
        
        
    }
}