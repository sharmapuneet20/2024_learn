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
        printinc(n);

    }
    public static  void  printinc(int n ){
          if(n==1){
        System.out.println(1);
              return;
          }
         printinc(n-1);
        System.out.println(n);
    }
}
