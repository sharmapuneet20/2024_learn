// count freq

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            
        }
        int queries[] = new int[M];
        for(int i=0; i<M; i++){
            queries[i] = sc.nextInt();
            
        }
        
        
                             countfreq(arr,queries , N , M);

        
        
    }
    public static void countfreq(int arr[], int queries[] , int N , int M){
        HashMap<Integer, Integer> hm =new HashMap<>();
            for(int i=0; i<N; i++){
               if( hm.containsKey(arr[i]) == true){
                    int temp = hm.get(arr[i]);
                   hm.put(arr[i], temp +1);
                }
                else{
                   hm.put(arr[i],1);
               }
            }
            
            for(int i=0; i<M; i++){
                int val = queries[i];
                if(hm.containsKey(val)==true){
                    System.out.println(hm.get(val));
                }
                else{
                     System.out.println(0);

                }
            }
        
        
        
    }
}
