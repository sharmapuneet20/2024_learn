// Given n length Array, You have to count total no. of elements in the array having atleast 1 element greater than itself.

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
        int count =0;
        for(int i =0; i<n; i++){
             if(arr[i]>max){
                 max = arr[i];
             } }
            for(int i=0; i<n; i++){
                if(arr[i]!= max){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
