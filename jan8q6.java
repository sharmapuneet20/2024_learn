/*
Take as input a number n, the number of rows  
Print the following pattern  
*** ***  
**   **  
*     *  
**   **  
*** ***  
for n = 5.  */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int space = 1;
        int stars = n/2 + 1;
        for(int i=1; i<=n; i++){
//          stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
//             spaces
            for(int k=1; k<= space; k++){
             System.out.print(" ");

            }
//             stars
             for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            if(i<=n/2){
                space = space +2;
                stars--;
            }else{
                space = space -2;
                stars++;
            }
            System.out.println();
        }
        
        
    }
    
}
