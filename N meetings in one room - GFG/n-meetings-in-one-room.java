//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        int len = start.length;
        int[][] arr = new int[len][2];
        for(int i = 0 ; i < len; i++){
            arr[i][0] =  start[i];
            arr[i][1] = end[i];
        }
        
        Arrays.sort(arr, (a,b) -> (a[1] - b[1]));
        
       
        int count = 1;
        int smin = arr[0][0];
        int smax = arr[0][1];
          //System.out.println( arr[0][1]);
        for(int i = 1 ; i < len; i++){
            
            if(arr[i][0] > smax){
                count++;
                smax = Math.max(smax, arr[i][1]);
                smin = Math.min(smin, arr[i][0]);
               // System.out.println( arr[i][1]);
            }
            
       
        }
        
        return count;
        
    }
}


class tuple{
    int s;
    int e;
    
    tuple(int s, int e){
        this.s = s;
        this.e = e;
    }
}