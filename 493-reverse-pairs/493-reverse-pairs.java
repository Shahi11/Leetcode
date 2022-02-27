class Solution {
    public int reversePairs(int[] nums) {
        if(nums.length == 0) return 0;
        return mergeSort(nums, 0, nums.length-1);
    }
    
    public int mergeSort(int[] nums, int left, int right){
        
        if(left>=right) return 0;
        int mid = left+(right-left)/2;
        
        int inv = mergeSort(nums, left, mid);
        inv += mergeSort(nums,mid+1,right);
        inv += merge(nums, left, mid,right);
        
        return inv;
    }
    
    public int merge(int[] nums, int left, int mid, int right){
        
        int k = mid+1,count =0;
            for(int i = left ; i<=mid; i++){
                while(k<=right && nums[i] > (2*(long)nums[k])) k++;
                
                 count +=k-(mid+1);
            }
        ArrayList<Integer> tmp = new ArrayList<>();
        int i = left, j = mid+1;
        while(i <= mid && j <= right){
            if(nums[i]>nums[j])
                tmp.add(nums[j++]);
            else
                tmp.add(nums[i++]);
        }
        
        while(i <= mid)
            tmp.add(nums[i++]);
        while(j <=right)
            tmp.add(nums[j++]);
        
        for( i = left; i<=right;i++){
            nums[i] = tmp.get(i-left);
        }
        
        return count;
    }
}