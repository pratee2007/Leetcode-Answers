class Solution {
    public int digitFrequencyScore(int n) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n != 0){
            int rem = n%10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            n = n/10;
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans += entry.getKey() * entry.getValue();
        }
         return ans;
    }
}