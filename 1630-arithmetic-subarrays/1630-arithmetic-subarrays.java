class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
     boolean[] res = new boolean[l.length];
        Arrays.fill(res,true);
        for(int i =0 ; i < l.length; i++){
            int[] temp = new int[r[i]-l[i]+1];
            int k = 0;
            for(int j = l[i]; j<= r[i]; j++){
                temp[k++] = nums[j];
            }
            
            Arrays.sort(temp);
            int gap = temp[1]-temp[0];
            for(int x = 2; x < temp.length; x++){
                if((temp[x]-temp[x-1]) != gap){
                    res[i] = false;
                        break;
                }    
            }
        }
        // Converting array to list
        ArrayList<Boolean> bres = new ArrayList<>();
        for(int i = 0; i<res.length; i++)
            bres.add(res[i]);
        return bres;
    }
}