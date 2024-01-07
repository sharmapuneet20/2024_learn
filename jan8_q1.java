// Take as input n. Print the number in reverse.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int ld = n%10;
            System.out.print(ld);
            n/=10;
        }
    }
}
