import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> ansList = new ArrayList<>();
        
        Set<Integer> friendSet = new HashSet<>();
        for (int f : friends) {
            friendSet.add(f);
        }

        for (int id : order) {
            if (friendSet.contains(id)) {
                ansList.add(id);
            }
        }

         int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }

}
