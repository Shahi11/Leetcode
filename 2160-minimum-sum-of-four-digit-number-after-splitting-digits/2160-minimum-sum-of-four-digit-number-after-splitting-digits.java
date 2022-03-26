class Solution {
    public int minimumSum(int num) {
        char[] ch = String.valueOf(num).toCharArray();
        Arrays.sort(ch);
        int n1 = Integer.parseInt(String.valueOf(ch[0]))*10+Integer.parseInt(String.valueOf(ch[3]));
int n2 = Integer.parseInt(String.valueOf(ch[1]))*10+Integer.parseInt(String.valueOf(ch[2]));
        
        return n1+n2;
    }
}