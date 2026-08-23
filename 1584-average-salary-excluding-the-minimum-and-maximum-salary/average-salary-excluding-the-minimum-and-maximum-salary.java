class Solution {
    public double average(int[] salary) {

        int min=salary[0];
        int max=salary[0];
        int s=0;
        int n=salary.length;


        for(int i=0; i<n; i++){
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
            s+=salary[i];
        }

        s=s-min-max;
     

        double avg=(double) (s)/(n-2);
        return avg;
    }
}