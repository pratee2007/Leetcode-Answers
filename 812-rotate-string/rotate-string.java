class Solution {
    public boolean rotateString(String s, String goal) {
        int n1=goal.length();
        int n2=s.length();
        if(n1< n2) return false;
        s=s+s;
    
        if(s.contains(goal)) return true;
        
    return false;
        
    }
}