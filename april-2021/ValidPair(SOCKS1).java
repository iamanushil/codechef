/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class CodeChef {

    public static String solve(int[] arr, int sizeOfArray) {
            
        if (arr[0] == arr[1])
            return "YES";
        else if (arr[0] == arr[2])
            return "YES";
        else if (arr[1] == arr[2])
            return "YES";
        else
            return "NO";
    }
      
    // Driver Method
    public static void main (String[] args) throws java.lang.Exception 
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        int[] arr = new int[3];
        
        // to read multiple integers line 
        String line = br.readLine(); 
        String[] strs = line.trim().split("\\s+"); 
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strs[i]); 
        }
        System.out.println(solve(arr, arr.length)); 
    }
    
    
}
