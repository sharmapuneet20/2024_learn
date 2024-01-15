//  fist nn repeating elemnt

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
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(nonrepeat(arr));
        
        
    }
    public static int nonrepeat(int arr[]){
        int n = arr.length;
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(arr[i]) == true){
                int temp = hm.get(arr[i]);
                 hm.put(arr[i], temp + 1);
            }else{
                hm.put(arr[i],1);
            }
        }
        
        for(int i=0; i<n; i++){
            if(hm.get(arr[i])==1){
                return arr[i];
            }
        }
        return -1;
    }
    
}
