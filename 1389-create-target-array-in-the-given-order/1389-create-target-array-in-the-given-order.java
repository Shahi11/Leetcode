class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0 ; i< nums.length; i++){
            ar.add(index[i], nums[i]);
        }
        
        return ar.stream().mapToInt(i->i).toArray();
    }
}