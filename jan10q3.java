// Given an integer array nums of size N, rotate the array to the right by k steps, where k is non-negative.

// Leetcode Link: https://leetcode.com/problems/rotate-array/ 

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
        
        int k = sc.nextInt();
        k = k % n;
        reverse(arr , 0 , n -1);
        reverse(arr, 0 , k-1);
        reverse(arr, k , n -1);
        
          for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
    public static void reverse(int arr[] , int sp , int ep){
        // int sp = s;
        // int ep =e;
        while(sp<ep){
            int temp  =   arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
