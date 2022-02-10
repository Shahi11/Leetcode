class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        
        for(int i = 0 ; i< nums1.length; i++){
            arr[nums1[i]]++;
        }
        
        ArrayList<Integer> ls = new ArrayList<>();
        
        for(int i = 0; i < nums2.length; i++){
            if(arr[nums2[i]] > 0){
                arr[nums2[i]]--;
                ls.add(nums2[i]);
            }
        }
        
        return ls.stream().mapToInt(i->i).toArray();
    }
}