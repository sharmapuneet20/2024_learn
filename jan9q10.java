
// swap indexes
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
        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        
            int temp = arr[index1];
            arr[index1]= arr[index2];
               arr[index2] = temp; 
        
        
         
        for(int i=0; i<arr.length; i++){
                      System.out.print(arr[i]+" ");          

        }
    }
}
