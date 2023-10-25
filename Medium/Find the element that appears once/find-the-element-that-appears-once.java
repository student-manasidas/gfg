//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<N;i++){
            int value=A[i];
            map.put(value,map.getOrDefault(value,0)+1);
        }
        for(int i=0;i<N;i++){
            int currentvalue=A[i];
            if(map.get(currentvalue)==1){
                return currentvalue;
            }
        }
        return -1;
    }
}