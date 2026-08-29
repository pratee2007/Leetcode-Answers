class Solution {
    public boolean isAnagram(String s1, String s2) {
           
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map1.containsKey(ch)) {
                int fre=map1.get(ch);
                map1.put(ch,fre+1);
            }
            else map1.put(ch,1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (map2.containsKey(ch)) {
                int fre=map2.get(ch);
                map2.put(ch,fre+1);
            }
            else map2.put(ch,1);
        }
       if(map1.equals(map2)) return true;
       return false;
    

    }
}