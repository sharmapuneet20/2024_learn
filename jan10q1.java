// You need to find whether the largest element in the array is at least twice as much as every other number in the array.
/*
Sample Input 0

4
1 2 3 4
Sample Output 0

-1 

*/

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
        int second_max = Integer.MIN_VALUE;
        int index = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]> max){
                     second_max = max;
                    max = arr[i];
                    index = i;
                }else if(arr[i]> second_max){
                    second_max = arr[i];
                }
            }
        if(second_max*2<= max){
            System.out.println(index);
        }else{
                        System.out.println(-1);
        }
         
    }
}
