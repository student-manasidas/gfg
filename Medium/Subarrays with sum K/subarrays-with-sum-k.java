//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.findSubArraySum(Arr, N, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int findSubArraySum(int arr[], int N, int k)
    {
        // code here
        
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            int oldval=map.getOrDefault(sum,0);
            map.put(sum,oldval+1);
        }
        return count;
    }
}