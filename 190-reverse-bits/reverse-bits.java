class Solution {

    private String reverse(String str){
        char[] ch = str.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i++] = ch[j];
            ch[j--] = temp;
        }
        return new String(ch);
    }

    public int reverseBits(int n) {
    String s1 = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
    String s2 = reverse(s1);
      
      return Integer.parseUnsignedInt(s2, 2);
    }
}