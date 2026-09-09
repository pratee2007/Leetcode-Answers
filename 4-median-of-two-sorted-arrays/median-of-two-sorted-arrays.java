class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n1=nums1.length;
    int n2=nums2.length;
    int[] ans=new int[n1+n2];
    int i=0,j=0,idx=0;

    while(i<n1 && j<n2){
        if(nums1[i] < nums2[j]){
            ans[idx++]=nums1[i];
            i++;

        }else {
              ans[idx++]=nums2[j];
              j++;
              }
    }

    while(i<n1){
        ans[idx++]=nums1[i];
        i++;
    }
    while(j<n2){
        ans[idx++]=nums2[j];
        j++;
    }

   int mid=ans.length/2;

    if(ans.length%2!=0){  // for odd no
        
        return ans[mid];

    }  // for even no
       return (ans[mid-1]+ans[mid])/2.0;
    
    
} }