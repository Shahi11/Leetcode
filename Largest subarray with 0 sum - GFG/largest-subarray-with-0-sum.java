// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        
     
        int len =0,sum=0, maxlen =0;
        Map<Integer, Integer> map = new HashMap<>();
       for(int i = 0 ; i < arr.length; i++){
           sum += arr[i];
           if(sum ==0){
               maxlen = Math.max(maxlen,i+1);
           }
           else{
               if(!map.containsKey(sum)){
                   map.put(sum,i);
               }
               else{
                   maxlen = Math.max(maxlen, i - map.get(sum));
               }
           }
           
       }
       return maxlen;
        
    }
}