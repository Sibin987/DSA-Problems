// { Driver Code Starts
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
            System.out.println(ob.searchInsertK(Arr, N, k));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int s = 0, e=N-1;
        int mid = s + (e-s)/2;
        while(s<=e)
        {
            if(k == Arr[mid])
            {
                return mid;
            }
            else if(k > Arr[mid])
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
}
