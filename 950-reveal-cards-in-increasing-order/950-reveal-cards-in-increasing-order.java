class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0 ; i<deck.length; i++)
            dq.offerLast(i);
        
        Arrays.sort(deck);
        int[] res = new int[deck.length];
        for(int i : deck){
            res[dq.pollFirst()] = i;
            if(!dq.isEmpty()){
                dq.offerLast(dq.pollFirst());
            }
        }
        
        return res;
    }
}