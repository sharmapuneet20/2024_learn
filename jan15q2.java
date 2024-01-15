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
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
       
        }
          if(twosum(arr, k) == true){
             System.out.println("Y");
         }else{
              
             System.out.println("N");

         }   
    }
    
    public static boolean twosum(int arr[], int k){
        int n = arr.length;
        HashMap < Integer , Integer >hm  = new HashMap<>();
        for(int i=0; i< n; i++){
            if(hm.containsKey(arr[i]) == true){
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            }else{
                hm.put(arr[i] , 1);
            }
        }
        
        for (int i = 0; i<n; i++){
            int a = arr[i];
            int b = k-a;
            if(a!=b && hm.containsKey(b)== true){
               return true;
            }else if(a==b && hm.containsKey(b) && hm.get(b)>1){
                            return true;

            }
            

        }
        return false;
    }
    
}
