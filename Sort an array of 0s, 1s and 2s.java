// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java
import java.util.ArrayList;
import java.util.Arrays;

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<Integer>();
     int i=0;
    while(i<n)
    {
       if(a[i]==0)
       {
             list.add(a[i]);
       }
        ++i;
    }

  int j=0;
     while(j<n)
   {
         if(a[j]==1)
       {
             list.add(a[j]);
        }
         ++j;
    }

    int k=0;
     while(k<n)
   {
       if(a[k]==2)
         {
            list.add(a[k]);
      }
         ++k;
    }
        Object arr2[] = list.toArray();
        Integer[] arr3 = Arrays.copyOf(arr2,
                                            arr2.length,
                                            Integer[].class);
 
        for(i=0;i<n;i++)
        {
          a[i]=arr3[i];  
        }
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends