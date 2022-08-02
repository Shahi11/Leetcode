class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int e1 = m-1, e2 = n-1, e3 = m+n -1;
        while(e1>= 0 && e2 >= 0){
            nums1[e3--] = nums1[e1] > nums2[e2]? nums1[e1--] : nums2[e2--];
        }
        
        while(e2 >= 0)
            nums1[e3--] = nums2[e2--];
    }
}