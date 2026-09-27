class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        HashMap<Integer,String> map= new HashMap<>(); 

        for(int i=0; i<n; i++){
            map.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        int i=0;
        int j=heights.length-1;
        while(i<j){
            int temp=heights[i];
            heights[i]=heights[j];
            heights[j]=temp;
            i++;
            j--;
        }

        
        int ind = 0;
        for(int x : heights) {
            names[ind++] = map.get(x);
        }
        return names;


    }
}