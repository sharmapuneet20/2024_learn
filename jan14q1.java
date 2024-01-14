// Given an array arr[] of length N, The task is to count all distinct elements in arr[].
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
        HashSet <Integer> hs = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            hs.add(arr[i]);
            
        }
        System.out.println(hs.size());
    }
}
