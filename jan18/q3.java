// Given N length Array, at every step remove an array element. Cost to remove element = sum of array elements present. Find min cost to remove all the elements.

// Note: Add to cost first and then remove.

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
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=0; i<n; i++){
            int temp = arr[i] * (n-i);
            ans = ans + temp;
        }
        System.out.println(ans);
    }
}
