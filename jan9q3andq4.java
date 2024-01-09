// You need to find the square root of a given number N. If N is not a perfect square, then floor(√x) must be returned.
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
        int ans = 1;
        for(int i=1; i*i<=n; i++){
            ans = i ;
        }
        System.out.println(ans);
    }
    
    
}

// sum of first natural numbers
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
        int sum = ((n)*(n+1))/(2);
        System.out.println(sum);
    }
}
