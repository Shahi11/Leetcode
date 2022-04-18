class Solution {
    public int numOfPairs(String[] nums, String target) {
        
        int len = nums.length;
        int count = 0;
        for(int i = 0; i< len-1; i++){
            for(int j = i+1; j<len; j++){
                String temp1 = nums[i]+nums[j];
                String temp2 = nums[j]+nums[i];
                if(temp1.equals(target))
                    count++;
                 if(temp2.equals(target))
                    count++;
            }
        }
        
        return count;
    }
}