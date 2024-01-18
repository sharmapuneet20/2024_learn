//Given N array Integers, Calculate number of good integers. An element is said to be good integers, if {No. of element < element == element itself}

//Note: Array elements are distinct.

// pseudo
int n = arr.length ; 
int ans = 0 ;
Arrays.sort(arr);
for(int i=0; i<n; i++){
  if(arr[i]== i ){
    ans++;
  }

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
        n = arr.length; 
        Arrays.sort(arr);
        int ans = 0 ;
        for(int i=0; i<n; i++){
            if(arr[i] == i){
                ans++;
            }
            
        }
        System.out.println(ans);
        
    }
}
