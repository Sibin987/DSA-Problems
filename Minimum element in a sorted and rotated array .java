// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int arr[], int n){
        
        int s=0,e=n-1;
        int ans = 1000000;
        int mid = s+(e-s)/2;
        while(s<e)
        {
            if(arr[mid] >= arr[0])
            {
                s =  mid + 1 ;
            }
            else
            {
                e = mid;
            }
            mid = s+(e-s)/2;
        }
        if(arr[0] < arr[s])
        {
            return arr[0];
        }
        return arr[s];
}
}