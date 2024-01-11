//  Given n length array "arr". Find (i,j) with maximum value of (abs(arr[i] - arr[j]) + i - j). You need to print max value of (abs(arr[i] - arr[j]) + i - j) possible and not the (i,j) itself.

// Note 1: abs represents the postive part only. ex: abs(8) = 8 and abs(-8) = 8.

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
        
        
        
        int ans1 = maxdiff2(arr);
      int ans2 = maxdiff3(arr);
      int ans = Math.max(ans1, ans2);
        System.out.println(ans);
        
    }
     public static int maxdiff2(int arr[]){
          int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         int n = arr.length;
         for(int i=0; i<n; i++){
             arr[i] = arr[i] + i;
             
         }
         for(int i=0; i<n; i++){
             if(arr[i]> max){
                 max = arr[i];
             }
             if(arr[i]<min){
                 min = arr[i];
             }
             
         }
         
             for(int i=0; i<n; i++){
            arr[i] = arr[i] - i;
             }
         return max - min;
     }
    
     public static int maxdiff3(int arr[]){
          int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         int n = arr.length;
         for(int i=0; i<n; i++){
             arr[i] = arr[i] - i;
             
         }
         for(int i=0; i<n; i++){
             if(arr[i]> max){
                 max = arr[i];
             }
             if(arr[i]<min){
                 min = arr[i];
             }
             
         }
         return max - min;
     }
    
}
