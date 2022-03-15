class Solution {
    public int longestConsecutive(int[] nums) {
        
    HashSet<Integer> hs = new HashSet<>();
    int max = 0;
    for(int i : nums)
        hs.add(i);
        
    for(int i = 0 ;  i < nums.length; i++){
        if(!hs.contains(nums[i]-1)){
            int count = 1;
            int tmp = nums[i]+1;
            while(hs.contains(tmp++)){
                count++;
            }
            max = Math.max(max,count);
        }
    }
        
        return max;
    }
}