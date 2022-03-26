class Solution {
    public int findCenter(int[][] edges) {
        int size=edges.length;
		// if 0th Index of first element is same like 0th or 1st index last element
        if(edges[0][0]==edges[size-1][0] ||edges[0][0]==edges[size-1][1]  ) return edges[0][0];  // return 0th index
        return edges[0][1]; // return 1st index
    }
}