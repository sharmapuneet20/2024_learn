import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();

        int n = sc.nextInt();
        System.out.println(power(a,n));
    }
    
    public static long power(int a , int n){
        if(n==1 ){
            return a;
        }
        long temp = power(a, n/2);
        if(n%2==0){
            return temp* temp;
        }
                    return temp * temp * a ;

        }
    }
