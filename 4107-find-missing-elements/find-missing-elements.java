class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int num : nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
            set.add(num);
            }

        List<Integer> missingElements = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                missingElements.add(i);
            }
        }

        return missingElements;
    }
}