class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int count = 0;
        int num = 0;
        
        for(int i = 0 ; i < s.length()-1; i++){
            char cur = s.charAt(i);
            char next = s.charAt(i+1);
            
            if(map.get(cur) < map.get(next)){
                num += map.get(next) - map.get(cur);
                count +=2;
                i++;
            }
            else{
                count++;
                num += map.get(cur);
            }
        }
        
        if(count == s.length())
            return num;
        
        return num + map.get(s.charAt(s.length()-1));
        
    }
}