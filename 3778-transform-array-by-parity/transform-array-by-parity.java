class Solution {

                //method-2
     public int[] transformArray(int[] nums){

        int counteven=0;

        for(int n: nums) {
            if(n % 2 ==0) counteven++;
        }

        for(int i=0; i<nums.length; i++){
            if(i < counteven) nums[i]=0;
            else nums[i]=1;
        }

        return nums;


     }
           
   










                //method-1

    // public int[] transformArray(int[] nums) {
    //     for(int i=0; i<nums.length; i++){
    //         if(nums[i] % 2 == 0) nums[i]=0;
    //         else nums[i]=1;
    //     }

    //     Arrays.sort(nums);
    //     return nums;
    // }
}