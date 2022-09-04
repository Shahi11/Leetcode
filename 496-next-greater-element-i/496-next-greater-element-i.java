class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
        int[] nxt = new int[nums2.length];
        Arrays.fill(nxt,-1);
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums2.length; i++){
            
            while(!st.isEmpty() && st.peek() < nums2[i]){
                nxt[map.get(st.peek())] = nums2[i];
                st.pop();
            }
            map.put(nums2[i], i);
            st.push(nums2[i]);
        }
        
        int[] res = new int[nums1.length];
        
        for(int i = 0 ; i < nums1.length; i++){
            res[i] = nxt[map.get(nums1[i])];
        }

        return res;
        
        
    }
}

// T : O(n)
// S: O(n)