// Take as input String.

// Write a Function to Check whether it is palindrome or not. if yes print true
// otherwise false. Palindrome means string and it's reversed form are same

// please Note: Lower and Upper case letter treated as equal. You have to use recursion to solve the problem.


// Example:

// Input:
// aBcba

// output
// true

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkpalindrome(str, 0 , str.length()-1));
    }
    
    public static boolean checkpalindrome(String str , int s ,int e){
          str = str.toLowerCase();
        if(s>=e){
            return true;
        }
        
        if(str.charAt(s)== str.charAt(e)){
            boolean temp = checkpalindrome(str , s + 1 , e-1);
            return temp;
        }else{
            return false;
        }
        
        
    }
}
