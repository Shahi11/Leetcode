class Solution {
    public String getPermutation(int n, int k) {
        
        int fact = 1;
        List<Integer> nums = new ArrayList<>();
        for(int i = 1 ; i < n; i++){
            fact = fact*i;
            nums.add(i);
        }
        
        nums.add(n);
        
        k = k-1;
        String st = "";
        
        while(true){
            st += nums.get(k/fact);
            nums.remove(k/fact);
            
            if(nums.isEmpty())
                break;
            
            k = k % fact;
            fact /= nums.size();
            
        }
        
        return st;
        
    }
}


//TC: O(n^2)
//SC: O(n)