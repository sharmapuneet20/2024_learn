/* 
Take as input a number n, the number of rows
Print the following pattern
1
2	3
4	5	6
7	8	9	10
for n = 4. */


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
          int count =1;
        for(int i=1; i<=n; i++){
       
           
            
             for(int j =1; j<=i; j++){
                 System.out.print(count+" ");
                count++;
             }
             System.out.println();
         }
    }
}
