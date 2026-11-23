class Solution {
    public String convertDateToBinary(String date) {
        String  str [] = date.split("-");
        StringBuilder sb = new StringBuilder ();

        for(int i=0; i<str.length; i++){

            int d = Integer.parseInt(str[i]);
            String s = Integer.toBinaryString(d);

            sb.append(s);
            if(i<str.length-1) sb.append("-");

        }

        return sb.toString();
    }
}