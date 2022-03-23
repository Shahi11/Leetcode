class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] alpha = new int[26];
        
        for(int i = 0 ; i < s.length(); i++){
            alpha[s.charAt(i) - 'a'] = i;
        }
        
        List<Integer> ans = new ArrayList<>();
        int start = 0; int j = 0;
        for(int i = 0; i < s.length(); i++){
            j = Math.max(j,alpha[s.charAt(i)-'a']);
            if(i==j){
                ans.add(i-start+1);
                start = i+1;
            }
        }
        
        return ans;
        
    }
}