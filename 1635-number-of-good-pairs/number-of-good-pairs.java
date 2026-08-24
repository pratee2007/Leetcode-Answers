class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums) {
            if(map.containsKey(n)) {
                count += map.get(n);
            }
            map.put(n,map.getOrDefault(n, 0) + 1);
        }
        return count;
    }
}