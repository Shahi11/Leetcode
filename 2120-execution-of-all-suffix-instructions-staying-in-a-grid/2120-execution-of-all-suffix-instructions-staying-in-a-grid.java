class Solution {
    
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int l = s.length();
        int[] res = new int[l];
        
        for(int i =0 ; i< l; i++){
            res[i] = check(n,startPos[0],startPos[1],s,0,i);
        }
        return res;
    }
    
    
    public int check(int n, int r, int c, String s, int count, int index){
        
        if(index>= s.length()) return count;
        if(s.charAt(index) == 'U'){
            if(r-1 < 0)
                return count;
            count = check(n,r-1,c,s,count+1,index+1);
        }
        else if(s.charAt(index) == 'D'){
            if(r+1 >= n)
                return count;
            count = check(n,r+1,c,s,count+1,index+1);
        }
        else if(s.charAt(index) == 'L'){
            if(c-1 < 0)
                return count;
            count = check(n,r,c-1,s,count+1,index+1);
        }
        else{
            if(c+1 >= n)
                return count;
            count = check(n,r,c+1,s,count+1,index+1);
        }
        
        return count;
    }
}