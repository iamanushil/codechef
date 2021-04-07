/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef {

    public static long solve(long n) {
        
        long sum = 0; // n can be grater than 10^12 so consider long
        
        long rem = (n%4);
        
        if (n >= 4) {
            sum = (n/4) * 44; // 44 for one layer (5+6)*4 -> will make the max sum , and 5 and 6 are adajacent as well
            if (rem == 0)
                sum += 16; // all 4 facing up (4*4)
            if (rem == 1)
                sum += 32; // (16-4-1+21)
            if (rem == 2)
                sum += 44;  // (16-4*2+2*(3+4+5+6))
            if (rem == 3)  // (16-4*3 +2*(3+4+5+6) + 4+5+6)
                sum += 55;
        } else {
            if (rem == 0)
                sum = 0; 
            if (rem == 1)
                sum = 20; 
            if (rem == 2)
                sum = 36; // calculate manually 
            if (rem == 3)
                sum = 51; // calculate manually
        }
        
        return sum;
        
    }
    
    // Driver Method
    public static void main (String[] args) throws java.lang.Exception 
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int noOfTestCases = Integer.parseInt(br.readLine()); 

        
        while(noOfTestCases-- > 0) {
            long noOfDice = Long.parseLong(br.readLine()); 
            System.out.println(solve(noOfDice)); 
        }  
            
    }    
}
