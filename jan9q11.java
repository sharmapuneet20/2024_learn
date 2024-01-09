// Given n length Array, You have to Reverse the entire array and print it.

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
        int start = 0;
        int end = arr.length -1;
        
        while(start<end){
            int temp = arr[start];
             arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
