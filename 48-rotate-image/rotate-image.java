class Solution {


        static void swap(int[][] arr, int r1, int c1, int r2, int c2) {
        int temp = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = temp;
        }



    public void rotate(int[][] arr) {
        int n=arr.length;

       
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                swap(arr,i,j,j,i);
            }
        }

      
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            
            while (left < right) {
                swap(arr, i, left, i, right);
                left++;
                right--;
            }

        }
       
    }
}