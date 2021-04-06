/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef {

    public static boolean solve(double[] arr, int sizeOfArray) {
        
        double k1 = arr[0];
        double k2 = arr[1];
        double k3 = arr[2];
        double v = arr[3];
        
        double value = k1*k2*k3*v;
        
        double ans = Math.round((100/value) * 100.0) / 100.0;
        
        if (ans < 9.58)
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
            int sizeOfArray = 4;
            
            double[] arr = new double[sizeOfArray];
            
            // to read multiple integers line 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
            
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Double.parseDouble(strs[i]); 
            }
            System.out.println(solve(arr, sizeOfArray) ? "YES" : "NO"); 
        }  
            
    }
    
    
}
