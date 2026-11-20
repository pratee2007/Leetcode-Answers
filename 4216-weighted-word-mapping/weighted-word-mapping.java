class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s = new StringBuilder();
        for(String s1 : words){
            s.append(letter(s1,weights));
        }

        return s.toString();
        
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