class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
          Arrays.sort(products);
        
      List<List<String>> sol = new ArrayList<>();
        List<String> possible = new ArrayList<>();
        for(int i = 0 ; i< products.length; i++){
            possible.add(products[i]);
        }
        
      
        for(int j =0; j <searchWord.length(); j++){
             List<String> match = new ArrayList<>();
            for(String word : possible){
                if(j<word.length()  && word.charAt(j) == searchWord.charAt(j)){
                    match.add(word);
                }
            }
            List<String> add = new ArrayList<>();
            for(int k = 0 ; k <3 && k<match.size() ;k++){
                add.add(match.get(k));
            }
             possible = match;
               sol.add(add);
        }
        
        
        return sol;
        
        
    }
}