/*
Take as input a number n, the number of rows
Print the following pattern
  *
 ***
*****
 ***
  *
for n = 5.   */

// code
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
        int star = 1;
        int spaces_for_star = n/2;
        for(int i=1; i<=n; i++){
//             spaces 
            for(int j=1; j<=spaces_for_star; j++){
                System.out.print(" ");
            }
//             stars
            for(int k=1; k<=star; k++){
                 System.out.print("*");
            }
            if(i<=n/2){
                spaces_for_star--;
                star = star + 2;
            }else{
                spaces_for_star++;
                star = star -2;
            }
            System.out.println();
        }
         
    }
}
