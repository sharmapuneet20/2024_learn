// Given n length array "arr". Find the pair with maximum value of arr[i] - arr[j]. You need to print max value of (arr[i] - arr[j]) possible and not the (i,j) itself.

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
        int arr[] = new int[n];
          for(int i=0; i<n; i++){
              arr[i] = sc.nextInt();
          }
        int max = Integer.MIN_VALUE;
        int  min = Integer.MAX_VALUE;
           for(int i=0; i<n; i++){
               if(arr[i]> max){
                   max = arr[i];
               }
               if(arr[i]< min){
                   min = arr[i];
               }
           }
        int diff  = max - min ;
      System.out.println(diff);
    }
    
    
}
