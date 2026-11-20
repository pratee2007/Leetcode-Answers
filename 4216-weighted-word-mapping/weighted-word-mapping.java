class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String s ="";
        for(String s1 : words){
            s = s + letter(s1,weights);
        }

        return s;
        
    }
    
    char letter(String st, int[] arr){
        int n = st.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char c = st.charAt(i);
            sum += arr[c - 'a'];
        }
        int m = sum % 26;
        return (char) ('z'-m);
    }
}