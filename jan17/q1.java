// 1.Take as input String.

// a. Write a recursive function which counts, the number of times “aaa”
// appears in the string. Print the value returned.

// b. Write a recursive function which counts, the number of times “aaa”
// appears in the string, but only such instances of “aaa” should be
// considered which do not overlap. Print the value returned.

// Example(To be used only for expected output):

// Input:
// aaaaaa

// output
// 4
// 2

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
         System.out.println(countaaa1(str , 0));
        System.out.println(countaaa2(str , 0));


    }
    
    public static int countaaa1(String str , int index){
        if( index >= str.length()-2 ){
            return 0;
        }
                   int temp = countaaa1( str , index +1);

         if(str.charAt(index)== 'a' && str.charAt(index +1)== 'a' && str.charAt(index +2)== 'a'){
           return temp + 1;
    }
        else{
                    return temp;

        }
        
    }
    
    
    
    
    public static int countaaa2(String str , int index){
         
        if( index >= str.length()-2){
            return 0;
        }
        
        if(str.charAt(index)== 'a' && str.charAt(index +1)== 'a' && str.charAt(index +2)== 'a'){
           int temp =          countaaa2( str , index +3);
           return temp + 1;
        }else{
            int temp = countaaa2( str ,index+1);
            return temp;
        }
        
    }
}
