class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int ele: arr){
         map.put(ele,map.getOrDefault(ele,0)+1);
        }
        if(map.isEmpty()) return false;

        for(int key: map.keySet()){
            int val=map.get(key);
            set.add(val);
        }
        return map.size()== set.size();
    }
    
}