class Solution {
    public int missingNumber(int[] nums) {
        
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        if(min != 0)
            return 0;
        
        List<Integer> ls = Arrays.stream(nums).boxed().toList();
        
        for(int i = min; i < max; i++){
            if(!ls.contains(i))
                return i;
        }
        return max+1;
    }
}