class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        int n=arr.length;

        if (n==1){
            if(arr[0].charAt(0) != arr[0].charAt(arr[0].length() - 1))
            return false;
        }

        for(int i=0; i<arr.length; i++){
            if(i%2 ==0 && i+1 < n ){
                char last = arr[i].charAt(arr[i].length()-1);
                char first = arr[i+1].charAt(0);
                if(last != first) return false;
              }else if(i%2 == 1 && i+1<n){
                char last = arr[i].charAt(arr[i].length()-1);
                char first = arr[i+1].charAt(0);
                if(last != first) return false;
              }
              else if(arr[0].charAt(0) != arr[n-1].charAt(arr[n-1].length()-1)){
                        return false;
                }
        }
        return true;
    }
}