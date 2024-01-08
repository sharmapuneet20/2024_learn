// You need to find the number of factors of the given required input.

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
        int count =0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(i!=n/i){
                    count = count + 2;
                }else{
                    count++;
                }
                
            }
            
        }  System.out.println(count);
      
    }
}
