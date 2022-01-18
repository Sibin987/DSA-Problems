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
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        int total = R*C;
        int startingCol = 0;
        int startingRow = 0;
        int endingCol = C-1;
        int endingRow = R-1;
        while(count < total)
        {
            for(int i=startingCol; count < total && i<=endingCol; i++)
            {
                list.add(a[startingRow][i]);
                count++;
            }
            startingRow++;
            
            for(int i=startingRow; count < total &&  i<=endingRow; i++)
            {
                list.add(a[i][endingCol]);
                count++;
            }
            endingCol--;
            
            for(int i=endingCol; count < total &&  i>=startingCol; i--)
            {
                list.add(a[endingRow][i]);
                count++;
            }
            endingRow--;
            
            for(int i=endingRow; count < total &&  i>=startingRow; i--)
            {
                list.add(a[i][startingCol]);
                count++;
            }
            startingCol++;
            
        }
        Collections.reverse(list);
        int size = total;
        int index = 0;
        int[] arr = new int[size];
        for(int i : list)
        {
            arr[index++] = i;
        }
        return arr;
    }
}