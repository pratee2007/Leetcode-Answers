class Solution {
    static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int n=nums.length;
        int presum=0;
        int count=0;
        for(int i=0; i<n; i++){
            presum += nums[i];

            if(map.containsKey(presum-goal)){
                count += map.get(presum - goal);
            }
            map.put(presum, map.getOrDefault(presum, 0) + 1);
        }
        return count;
    }
}