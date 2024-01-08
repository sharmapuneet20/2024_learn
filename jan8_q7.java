/*
Take as input
1. first number: n
2. second number: r

Print n!, npr & ncr separated by lines. */

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
        int r = sc.nextInt();
         int nfact =factorial_cal(n);
        int rfact = factorial_cal(r);
        int nmrfact = factorial_cal(n-r);
        
        
        int npr = nfact/ nmrfact;
        int ncr = (nfact) / ((rfact)*(nmrfact)) ;
        
        
        System.out.println(nfact);
        System.out.println(npr);
        System.out.println(ncr);

        
        
        
        
        
    }
    
    public static int factorial_cal(int n){
        
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = ans * i;
        }
        return ans;
    }
}
