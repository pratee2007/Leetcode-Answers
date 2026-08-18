class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];

        int i=0, j=n;
        int index=0; // it will tell me index of new arr

        while(index<nums.length){
            if(index % 2 == 0){
                ans[index]=nums[i++];
            }
            else {
                ans[index]=nums[j++];
            }

            index++;
        }
        return ans;

    }
}