Take as input a number n. Determine whether it is even or odd. If it is even, 
print "even" otherwise print "odd".

Note: Using any mathematical operator is not allowed.

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
          if((n&1)==0){
              System.out.println("even");
          }else{
                 System.out.println("odd");

          }
    }
}
