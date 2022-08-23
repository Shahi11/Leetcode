

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet(wordList);
        Queue<String>  q = new LinkedList<>();
        q.add(beginWord);
        int level = 1;
        while(!q.isEmpty()){
            int lsize = q.size();
            while(lsize-- > 0){
                String cur = q.remove();
                if(cur.equals(endWord)) return level;
                char word[] = cur.toCharArray();
                for(int i=0; i<word.length; i++){
                    for(char j='a'; j<='z'; j++){
                        word[i] = j;
                        String newWord = String.valueOf(word);
                        if(wordSet.contains(newWord)){
                            wordSet.remove(newWord);
                            q.add(newWord);
                        }
                        word[i] = cur.charAt(i);
                    }
                }
            }
            level++;
        }
        return 0;
    }
}