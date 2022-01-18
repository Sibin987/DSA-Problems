// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        int total = r*c;
        int startingCol = 0;
        int startingRow = 0;
        int endingCol = c-1;
        int endingRow = r-1;
        while(count < total)
        {
            for(int i=startingCol; count < total && i<=endingCol; i++)
            {
                list.add(matrix[startingRow][i]);
                count++;
            }
            startingRow++;
            
            for(int i=startingRow; count < total &&  i<=endingRow; i++)
            {
                list.add(matrix[i][endingCol]);
                count++;
            }
            endingCol--;
            
            for(int i=endingCol; count < total &&  i>=startingCol; i--)
            {
                list.add(matrix[endingRow][i]);
                count++;
            }
            endingRow--;
            
            for(int i=endingRow; count < total &&  i>=startingRow; i--)
            {
                list.add(matrix[i][startingCol]);
                count++;
            }
            startingCol++;
            
        }
        return list;
    }
}
