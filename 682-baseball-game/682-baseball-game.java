class Solution {
    public int calPoints(String[] ops) {
        
        String[] arr = new String[ops.length];
        
        int i = 0, sum =0;
        for(String c : ops){
            if(c.equals("C")){
                sum -= Integer.valueOf(arr[i-1]);
                i--;
            }
            else if(c.equals("D")){
               sum += Integer.valueOf(arr[i-1])*2; 
               arr[i] = String.valueOf(Integer.valueOf(arr[i-1])*2);
                i++;
            }
            else if(c.equals("+")){
                sum += Integer.valueOf(arr[i-1])+Integer.valueOf(arr[i-2]);
                arr[i] = String.valueOf(Integer.valueOf(arr[i-1])+Integer.valueOf(arr[i-2]));
                i++;
            }
            else{
                sum += Integer.valueOf(c);
                arr[i] = c;
                i++;
            }
        }
        
        return sum;
    }
}