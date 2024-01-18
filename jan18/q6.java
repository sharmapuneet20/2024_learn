// Take an input N, the size of array.
// Take N more inputs and store that in an array.

// 1.It reads a number N.
// 2.Take Another N numbers as input and store them in an Array.

// Write a recursive function which returns true if the array is sorted and false
// otherwise

// print returned value.


// Example(To be used only for expected output):
// Input:
// 4
// 2 8 6 4
// Output:
// false

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
   System.out.println(checksorted(arr, 0));      
        
    }
    
    public static boolean checksorted(int arr[], int index){
        int n = arr.length;
//         base cond
        
        if(index ==  n-1){
            return true;
        }
        
//         main logic
       boolean temp =   checksorted(arr, index +1);
        if(temp == false){
            return false;
        }
        else{
            if(arr[index] <= arr[index +1]){
                return true;
            }else{
                return false;
            }
        }
        
    }
}
