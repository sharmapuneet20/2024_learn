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
        printdec(n);
    }
    public static void printdec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
                          System.out.println(n);

        printdec(n-1);

    }
    
}
