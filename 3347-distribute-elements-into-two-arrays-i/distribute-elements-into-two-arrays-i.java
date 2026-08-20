class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr2 = new ArrayList<>();
        int[] res = new int[nums.length];   
        res[0]=nums[0];
        arr2.add(nums[1]);
        int j = 0;

        for(int i=2; i<nums.length; i++){
            int last1=res[j];
            int last2=arr2.get(arr2.size()-1);
            if(last1 > last2) res[++j]=nums[i];
            else arr2.add(nums[i]);
        }


        int idx = j+1;
        for (int x : arr2) res[idx++] = x;

        return res;


    }
}