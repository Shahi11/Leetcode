class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        
        List<Boolean> res = new ArrayList<>();
        // Arrays.fill(res,false);
        for(int i = 0 ; i < candies.length; i++){
            if(candies[i]+extraCandies >= max)
                res.add(true);
            else
                res.add(false);
        }
        
        return res;
    }
}