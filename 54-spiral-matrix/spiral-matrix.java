class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;
        int srow = 0, erow = m - 1;
        int scolm = 0, ecolm = n - 1;

        while(srow <= erow && scolm <=ecolm){
            //top
            for(int j=scolm; j<=ecolm; j++){
                ans.add(matrix[srow][j]);
            }
            //right
            for(int i=srow+1; i<=erow; i++){
                ans.add(matrix[i][ecolm]);
            }
            //bottom
            for(int j=ecolm-1; j>=scolm; j--){
                if(srow==erow) break;
                ans.add(matrix[erow][j]);
            }
            //left
            for(int i=erow-1; i>=srow+1; i--){
                if(scolm==ecolm) break;
                ans.add(matrix[i][scolm]);
            }

            srow++; erow--; scolm++; ecolm--;

        }
    return ans;
    }
}