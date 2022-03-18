class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0 ; i<nums.length-1; i=i+2){
            int r = nums[i];
            while(r>0){
                ls.add(nums[i+1]);
                r--;
            }
        }
        
        return ls.stream().mapToInt(i->i).toArray();
    }
}