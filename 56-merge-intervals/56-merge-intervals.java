class Solution {
    public int[][] merge(int[][] intervals) {
      
     Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
     LinkedList<int[]> ls = new LinkedList<>();
        
    for(int[] interval: intervals){
        
        if(ls.isEmpty() || ls.getLast()[1] < interval[0]){
            ls.add(interval);
        }
        else{
            ls.getLast()[1] = Math.max(ls.getLast()[1], interval[1]);
            
        }
    }
        
        return ls.toArray(new int[ls.size()][]);
        
        
    }
}

//T: O(logn) + O(n)