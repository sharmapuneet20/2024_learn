// bubble sort 
// swap elements and move largest element to last 

// pseudo code
 // for(int i=0; i<n-1; i++){
 //   for(int j=0; j<n-1-i; j++){
 //     if(arr[j] > arr[j+1]){
 //       int temp  = arr[j];
 //       arr[j] = arr[j+1];
 //       arr[j+1] = temp;
 //     }


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
        
        
        
        for(int i=0; i< n-1 ; i++){
            for(int j = 0 ; j< n-1 - i; j++){
               if(arr[j] > arr[j+1]){
                   
               
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
