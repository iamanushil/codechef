/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef {

    public static boolean solve(String str, int n, int k) {
        
        int count = 0;
        
        char[] c = str.toCharArray();
        
        if (n < k)
            return false;
            
        for (int i = 0; i < n; i++) {
            
            if (count >= k)
                return true;
            
            if (c[i] == '*') {
                count++;
            } else
                count = 0;
        }
        
        if (count >= k)
            return true;
        else
            return false;
    }
    
    // Driver Method
    public static void main (String[] args) throws java.lang.Exception 
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int noOfTestCases = Integer.parseInt(br.readLine()); 

        
        while(noOfTestCases-- > 0) {
            
            int[] arr = new int[2];
            
            // to read multiple integers line 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
            
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(strs[i]); 
            }
            
            String str = br.readLine(); 
            
            System.out.println(solve(str, arr[0], arr[1]) ? "YES" : "NO"); 
        }  
            
    }
    
    
}
