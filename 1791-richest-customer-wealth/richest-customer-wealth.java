class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max=0;
        for(int[] arr: accounts){
            int current=0;
            for(int num: arr){
                current+=num;
            }
            max=Math.max(current,max);
        }

        return max;
    }
}