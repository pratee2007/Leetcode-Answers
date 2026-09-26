class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char a: s.toCharArray()) set.add(a);
        return set.size();  
    }
}