// Given n length Array and two valid index [s,e], You have to Reverse the array from s to e and print the final array.
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
        int s = sc.nextInt();
        int e = sc.nextInt();
        
       reverse(arr , s , e); 
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[], int s , int e){
        int sp = s;
        int ep = e;
        while(sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            
            sp++;
                ep--;
        }
        
    }

         
    }
    
