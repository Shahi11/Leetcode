class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        
        LinkedList<int[]> ls = new LinkedList<>();
        
        for(int[] i : intervals){
            if(ls.isEmpty() || ls.getLast()[1] < i[0])
                ls.add(i);
            else
                ls.getLast()[1] = Math.max(ls.getLast()[1], i[1]); 
        }
        
        
        return ls.toArray(new int[ls.size()][2]);
    }
}