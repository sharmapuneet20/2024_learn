//  print in zig zag
// Given a 2D array, Print integers in zig zag fashion.

// Note: Zig zag fashion means oth row from left to right, 1st row form right to left, 2nd row from left to right and so on 

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
        int m = sc.nextInt();
        
         int arr[][] = new int[n][m];
        
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                 for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }else{
                for(int j=m-1; j>=0; j--){
                                    System.out.print(arr[i][j]+" ");

                }
                            System.out.println();

            }
            
            }
    }
}
