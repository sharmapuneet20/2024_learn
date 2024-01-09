/*
Given an Integer number n, return the difference between the product of its digits and the sum of its digits.

Leetcode Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/ 
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
        int product = 1;
        int sum = 0;
        while(n!=0){
            int ld = n%10;
            sum+= ld;
            product*= ld;
           n/=10;
        }
        int diff = (product) - (sum);
        
        System.out.println(diff);
    }
}
