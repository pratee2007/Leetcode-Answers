class Solution {
    public boolean canAliceWin(int n) {
        int flag = 1;
        int aliceRemove = 10;
        while(n >= aliceRemove){
            n -= aliceRemove;
            if(flag == 1) flag = 0;
            else flag = 1;
            aliceRemove--;     
        }

        if(flag == 0) return true;
        return false;
        
    }
}