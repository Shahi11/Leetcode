class Solution {
    public int longestConsecutive(int[] nums) {
        
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int num : nums){
            hs.add(num);
        }
        int longest = 0;
        for(int num : nums){
            if(!hs.contains(num-1)){
                int current = 1;
                int n = num;
                while(hs.contains(n+1)){
                    current++;
                    n = n+1;
                }
                
                longest = Math.max(longest, current);
            }
        }
        
        return longest;
    }
}