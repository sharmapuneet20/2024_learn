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
        System.out.println(fibonaci(n));
    }
    
    public static int fibonaci(int n){
        if(n<2){
            return n;
        }
        int temp = fibonaci(n-1) + fibonaci(n-2);
        return temp ;
    }
}
