class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        if(n <= 1) return 1;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[left])
                left = i;
                
            if (nums[i] > nums[right])
                right = i;
        }
        
        if (left < right) {
            int temp = left;
            left = right;
            right = temp;
        }
        
        int front =left + 1;

        int back = n - right;
   
        int combo = (right + 1) + (n - left);

        return Math.min(front, Math.min(back, combo));
        
      
    }
}