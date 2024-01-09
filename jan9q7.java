/* Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt. */

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
        int i=1;
        int ans =1;
       while(i*i<=n){
           ans = i;
           i++;
           
       }
        if(ans*ans==n){
            System.out.println("true");
        }else{
                        System.out.println("false");

        }
}}
