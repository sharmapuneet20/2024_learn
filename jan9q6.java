/* Take as input a number n.  
Print the nth number of Fibonacci sequence where  
0th Fibonacci is 0 and 1st Fibonacci is 1. Here is a sample  
0 1 1 2 3 5 8 13 21 34 55

Leetcode Link: https://leetcode.com/problems/fibonacci-number/ 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int ans = fib(n);
        System.out.println(ans);
        
    }
     public static  int fib(int n) {
        //  base condition
        if(n<2){
            return n;
        }
        return  fib(n-1) + fib(n-2);
        

        
    }
}
