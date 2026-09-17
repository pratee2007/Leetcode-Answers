class Solution {
    public int countSeniors(String[] details) {
        int count=0;

        for (String s : details) {
            if (s.substring(11, 13).compareTo("60") > 0) count++;
        }
        return count;
    }
}