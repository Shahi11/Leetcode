class Solution {
    public String getPermutation(int n, int k) {
        
        List<Integer> num = new ArrayList<>();
        int fact = 1;
        for(int i = 1; i< n ; i++){
            fact = fact*i;
            num.add(i);
        }
        num.add(n);
        k = k-1;
        String res = "";
        while(true){
            res += num.get(k/fact);
            num.remove(k/fact);
            
            if(num.isEmpty()) break;
            
            k %= fact;
            fact /= num.size();
            
        }
        
        return res;
    }
}